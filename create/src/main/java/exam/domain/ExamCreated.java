package exam.domain;

import exam.domain.*;
import exam.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ExamCreated extends AbstractEvent {

    private Long examId;
    private String examTitle;
    private Date examStrDt;
    private Date examEndDt;
    private List<String> answer;

    public ExamCreated(Exam aggregate) {
        super(aggregate);
    }

    public ExamCreated() {
        super();
    }
}
//>>> DDD / Domain Event
