package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.BaseEntity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType.*;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(name = "base_id_gen", sequenceName = "student_seq", allocationSize = 1)
public class Student extends BaseEntity {

    private String firstName;
    private String email;
    private LocalDate dateOfBirth;

    @ManyToMany(cascade = {MERGE, DETACH, REFRESH})
    private List<Course> courses;
}
