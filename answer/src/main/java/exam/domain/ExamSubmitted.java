package exam.domain;

import exam.domain.*;
import exam.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ExamSubmitted extends AbstractEvent {

    private Long ansId;
    private Long examId;
    private Long userId;
    private String userAnswer;

    public ExamSubmitted(UserAnswered aggregate) {
        super(aggregate);
    }

    public ExamSubmitted() {
        super();
    }
}
//>>> DDD / Domain Event
