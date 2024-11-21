package exam.infra;

import exam.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ExamReqHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ExamReq>> {

    @Override
    public EntityModel<ExamReq> process(EntityModel<ExamReq> model) {
        return model;
    }
}
