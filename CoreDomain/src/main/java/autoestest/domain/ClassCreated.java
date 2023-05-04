package autoestest.domain;

import autoestest.domain.*;
import autoestest.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ClassCreated extends AbstractEvent {

    private String className;
    private Integer capacity;

    public ClassCreated(Class aggregate) {
        super(aggregate);
    }

    public ClassCreated() {
        super();
    }
}
