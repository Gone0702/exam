package exam.domain;

import exam.domain.*;
import exam.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ExamShowed extends AbstractEvent {

    private Long examId;
    private String examStat;

    public ExamShowed(UserAnswered aggregate) {
        super(aggregate);
    }

    public ExamShowed() {
        super();
    }
}
//>>> DDD / Domain Event
