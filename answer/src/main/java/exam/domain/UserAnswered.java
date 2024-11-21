package exam.domain;

import exam.AnswerApplication;
import exam.domain.ExamCanceled;
import exam.domain.ExamShowed;
import exam.domain.ExamSubmitted;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "UserAnswered_table")
@Data
//<<< DDD / Aggregate Root
public class UserAnswered {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long answerId;

    private Long examId;

    private Long userId;

    private Date submitDt;

    private String userAnswer;

    private String examStat;

    @PostPersist
    public void onPostPersist() {
        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        exam.external.ExamResult examResult = new exam.external.ExamResult();
        // mappings goes here
        AnswerApplication.applicationContext
            .getBean(exam.external.ExamResultService.class)
            .saveResult(examResult);

        ExamSubmitted examSubmitted = new ExamSubmitted(this);
        examSubmitted.publishAfterCommit();

        ExamCanceled examCanceled = new ExamCanceled(this);
        examCanceled.publishAfterCommit();

        ExamShowed examShowed = new ExamShowed(this);
        examShowed.publishAfterCommit();
    }

    public static UserAnsweredRepository repository() {
        UserAnsweredRepository userAnsweredRepository = AnswerApplication.applicationContext.getBean(
            UserAnsweredRepository.class
        );
        return userAnsweredRepository;
    }

    //<<< Clean Arch / Port Method
    public static void cancelExam(ExamCanceled examCanceled) {
        //implement business logic here:

        /** Example 1:  new item 
        UserAnswered userAnswered = new UserAnswered();
        repository().save(userAnswered);

        ExamCanceled examCanceled = new ExamCanceled(userAnswered);
        examCanceled.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(examCanceled.get???()).ifPresent(userAnswered->{
            
            userAnswered // do something
            repository().save(userAnswered);

            ExamCanceled examCanceled = new ExamCanceled(userAnswered);
            examCanceled.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void openExam(ExamDemanded examDemanded) {
        //implement business logic here:

        /** Example 1:  new item 
        UserAnswered userAnswered = new UserAnswered();
        repository().save(userAnswered);

        ExamShowed examShowed = new ExamShowed(userAnswered);
        examShowed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(examDemanded.get???()).ifPresent(userAnswered->{
            
            userAnswered // do something
            repository().save(userAnswered);

            ExamShowed examShowed = new ExamShowed(userAnswered);
            examShowed.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
