package autoestest.domain;

import autoestest.CoreDomainApplication;
import autoestest.domain.ClassCreated;
import autoestest.domain.ClassDeleted;
import autoestest.domain.ClassUpdated;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Class_table")
@Data
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String className;

    private Integer capacity;

    @PostPersist
    public void onPostPersist() {
        ClassCreated classCreated = new ClassCreated(this);
        classCreated.publishAfterCommit();

        ClassUpdated classUpdated = new ClassUpdated(this);
        classUpdated.publishAfterCommit();

        ClassDeleted classDeleted = new ClassDeleted(this);
        classDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ClassRepository repository() {
        ClassRepository classRepository = CoreDomainApplication.applicationContext.getBean(
            ClassRepository.class
        );
        return classRepository;
    }

    public static void classCapacityPolicy(ClassCreated classCreated) {
        /** Example 1:  new item 
        Class class = new Class();
        repository().save(class);

        */

        /** Example 2:  finding and process
        
        repository().findById(classCreated.get???()).ifPresent(class->{
            
            class // do something
            repository().save(class);


         });
        */

    }
}
