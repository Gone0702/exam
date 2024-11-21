package exam.domain;

import exam.domain.*;
import exam.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ResultObjected extends AbstractEvent {

    private Long id;

    public ResultObjected(ExamResult aggregate) {
        super(aggregate);
    }

    public ResultObjected() {
        super();
    }
}
//>>> DDD / Domain Event
