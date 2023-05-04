package autoestest.domain;

import autoestest.domain.*;
import autoestest.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ClassUpdated extends AbstractEvent {

    private String className;
    private Integer capacity;

    public ClassUpdated(Class aggregate) {
        super(aggregate);
    }

    public ClassUpdated() {
        super();
    }
}
