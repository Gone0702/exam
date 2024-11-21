package exam.domain;

import exam.domain.*;
import exam.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ExamCanceled extends AbstractEvent {

    private Long ansId;
    private Long examId;
    private Long userId;

    public ExamCanceled(UserAnswered aggregate) {
        super(aggregate);
    }

    public ExamCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
