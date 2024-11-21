package exam.domain;

import exam.ResultApplication;
import exam.domain.ResultChecked;
import exam.domain.ResultObjected;
import exam.domain.ScoreCalculated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ExamResult_table")
@Data
//<<< DDD / Aggregate Root
public class ExamResult {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long resultId;

    private Long examId;

    private Long userId;

    private Float examScore;

    @ElementCollection
    private List<Boolean> correctYn;

    @PostPersist
    public void onPostPersist() {
        ResultChecked resultChecked = new ResultChecked(this);
        resultChecked.publishAfterCommit();

        ResultObjected resultObjected = new ResultObjected(this);
        resultObjected.publishAfterCommit();

        ScoreCalculated scoreCalculated = new ScoreCalculated(this);
        scoreCalculated.publishAfterCommit();
    }

    public static ExamResultRepository repository() {
        ExamResultRepository examResultRepository = ResultApplication.applicationContext.getBean(
            ExamResultRepository.class
        );
        return examResultRepository;
    }
}
//>>> DDD / Aggregate Root
