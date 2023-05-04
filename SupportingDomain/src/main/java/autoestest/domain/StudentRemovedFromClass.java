package autoestest.domain;

import autoestest.domain.*;
import autoestest.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StudentRemovedFromClass extends AbstractEvent {

    private String name;
    private String className;

    public StudentRemovedFromClass(Student aggregate) {
        super(aggregate);
    }

    public StudentRemovedFromClass() {
        super();
    }
}
