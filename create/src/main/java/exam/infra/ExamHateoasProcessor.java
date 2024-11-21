package exam.infra;

import exam.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ExamHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Exam>> {

    @Override
    public EntityModel<Exam> process(EntityModel<Exam> model) {
        return model;
    }
}
