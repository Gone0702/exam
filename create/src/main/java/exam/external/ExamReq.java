package exam.external;

import java.util.Date;
import lombok.Data;

@Data
public class ExamReq {

    private Long reqId;
    private Long examId;
    private Long userId;
    private Date reqDt;
    private String reqStat;
    private String examStat;
}
