package exam.infra;

import exam.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ExamResultHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ExamResult>> {

    @Override
    public EntityModel<ExamResult> process(EntityModel<ExamResult> model) {
        return model;
    }
}
