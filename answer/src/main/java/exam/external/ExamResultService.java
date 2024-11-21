package exam.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "result", url = "${api.url.result}")
public interface ExamResultService {
    @RequestMapping(method = RequestMethod.POST, path = "/examResults")
    public void saveResult(@RequestBody ExamResult examResult);
}
