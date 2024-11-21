package exam.domain;

import exam.CreateApplication;
import exam.domain.ExamCreated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Exam_table")
@Data
//<<< DDD / Aggregate Root
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long examId;

    private String examTitle;

    private Date examStrDt;

    private Date examEndDt;

    @ElementCollection
    private List<String> answer;

    @PostPersist
    public void onPostPersist() {
        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        exam.external.ExamReq examReq = new exam.external.ExamReq();
        // mappings goes here
        CreateApplication.applicationContext
            .getBean(exam.external.ExamReqService.class)
            .addExam(examReq);

        ExamCreated examCreated = new ExamCreated(this);
        examCreated.publishAfterCommit();
    }

    public static ExamRepository repository() {
        ExamRepository examRepository = CreateApplication.applicationContext.getBean(
            ExamRepository.class
        );
        return examRepository;
    }
}
//>>> DDD / Aggregate Root
