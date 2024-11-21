package exam.domain;

import exam.domain.*;
import exam.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ScoreCalculated extends AbstractEvent {

    private Long id;

    public ScoreCalculated(ExamResult aggregate) {
        super(aggregate);
    }

    public ScoreCalculated() {
        super();
    }
}
//>>> DDD / Domain Event
