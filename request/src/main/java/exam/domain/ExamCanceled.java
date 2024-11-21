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

    private Long reqId;
    private Long examId;
    private Long userId;

    public ExamCanceled(ExamReq aggregate) {
        super(aggregate);
    }

    public ExamCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
