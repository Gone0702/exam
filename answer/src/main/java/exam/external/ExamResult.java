package exam.external;

import java.util.Date;
import lombok.Data;

@Data
public class ExamResult {

    private Long resultId;
    private Long examId;
    private Long userId;
    private Float examScore;
    private Object correctYn;
}
