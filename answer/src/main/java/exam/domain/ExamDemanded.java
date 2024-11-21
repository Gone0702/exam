package exam.domain;

import exam.domain.*;
import exam.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ExamDemanded extends AbstractEvent {

    private Long reqId;
    private Long examId;
    private Long userId;
}
