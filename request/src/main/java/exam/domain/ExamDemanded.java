package exam.domain;

import exam.domain.*;
import exam.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ExamDemanded extends AbstractEvent {

    private Long reqId;
    private Long examId;
    private Long userId;

    public ExamDemanded(ExamReq aggregate) {
        super(aggregate);
    }

    public ExamDemanded() {
        super();
    }
}
//>>> DDD / Domain Event
