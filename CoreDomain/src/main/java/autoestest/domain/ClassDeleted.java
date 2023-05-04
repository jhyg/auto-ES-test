package autoestest.domain;

import autoestest.domain.*;
import autoestest.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ClassDeleted extends AbstractEvent {

    private String className;

    public ClassDeleted(Class aggregate) {
        super(aggregate);
    }

    public ClassDeleted() {
        super();
    }
}
