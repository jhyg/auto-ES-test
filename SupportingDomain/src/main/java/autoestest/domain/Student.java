package autoestest.domain;

import autoestest.SupportingDomainApplication;
import autoestest.domain.StudentAddedToClass;
import autoestest.domain.StudentRemovedFromClass;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Student_table")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private String className;

    @PostPersist
    public void onPostPersist() {
        StudentAddedToClass studentAddedToClass = new StudentAddedToClass(this);
        studentAddedToClass.publishAfterCommit();

        StudentRemovedFromClass studentRemovedFromClass = new StudentRemovedFromClass(
            this
        );
        studentRemovedFromClass.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static StudentRepository repository() {
        StudentRepository studentRepository = SupportingDomainApplication.applicationContext.getBean(
            StudentRepository.class
        );
        return studentRepository;
    }

    public static void classCapacityPolicy(ClassDeleted classDeleted) {
        /** Example 1:  new item 
        Student student = new Student();
        repository().save(student);

        */

        /** Example 2:  finding and process
        
        repository().findById(classDeleted.get???()).ifPresent(student->{
            
            student // do something
            repository().save(student);


         });
        */

    }
}
