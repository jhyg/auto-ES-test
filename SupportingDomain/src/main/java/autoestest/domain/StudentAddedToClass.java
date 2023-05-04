package autoestest.domain;

import autoestest.domain.*;
import autoestest.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StudentAddedToClass extends AbstractEvent {

    private String name;
    private String className;

    public StudentAddedToClass(Student aggregate) {
        super(aggregate);
    }

    public StudentAddedToClass() {
        super();
    }
}
