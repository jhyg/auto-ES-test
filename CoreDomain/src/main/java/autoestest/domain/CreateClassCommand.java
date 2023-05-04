package autoestest.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateClassCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String className;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer capacity;
}
