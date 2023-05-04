package autoestest.infra;

import autoestest.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class StudentHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Student>> {

    @Override
    public EntityModel<Student> process(EntityModel<Student> model) {
        return model;
    }
}
