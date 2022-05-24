package thymeleaf.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "students")
@Getter @Setter

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(
            name = "student_id_generator",
            sequenceName = "student_id_seq",
            allocationSize = 1
    )

    private Long id;
    private String name;
    private String email;
    private int age;

    public Student() {
    }

    public Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
