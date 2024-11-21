package exam.infra;

import exam.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserAnsweredHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<UserAnswered>> {

    @Override
    public EntityModel<UserAnswered> process(EntityModel<UserAnswered> model) {
        return model;
    }
}
