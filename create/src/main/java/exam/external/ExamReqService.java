package exam.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "request", url = "${api.url.request}")
public interface ExamReqService {
    @RequestMapping(method = RequestMethod.POST, path = "/examReqs")
    public void addExam(@RequestBody ExamReq examReq);
}
