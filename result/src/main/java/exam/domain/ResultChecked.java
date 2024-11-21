package exam.domain;

import exam.domain.*;
import exam.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ResultChecked extends AbstractEvent {

    private Long id;

    public ResultChecked(ExamResult aggregate) {
        super(aggregate);
    }

    public ResultChecked() {
        super();
    }
}
//>>> DDD / Domain Event
