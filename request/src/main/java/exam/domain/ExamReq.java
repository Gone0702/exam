package exam.domain;

import exam.RequestApplication;
import exam.domain.ExamCanceled;
import exam.domain.ExamDemanded;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ExamReq_table")
@Data
//<<< DDD / Aggregate Root
public class ExamReq {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reqId;

    private Long examId;

    private Long userId;

    private Date reqDt;

    private String reqStat;

    private String examStat;

    @PostPersist
    public void onPostPersist() {
        ExamDemanded examDemanded = new ExamDemanded(this);
        examDemanded.publishAfterCommit();

        ExamCanceled examCanceled = new ExamCanceled(this);
        examCanceled.publishAfterCommit();
    }

    public static ExamReqRepository repository() {
        ExamReqRepository examReqRepository = RequestApplication.applicationContext.getBean(
            ExamReqRepository.class
        );
        return examReqRepository;
    }
}
//>>> DDD / Aggregate Root
