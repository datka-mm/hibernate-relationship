package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.BaseEntity;

import java.time.LocalDate;
import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(name = "base_id_gen", sequenceName = "course_seq", allocationSize = 1)
public class Course extends BaseEntity {

    private String name;
    private int price;
    private LocalDate dateOfStart;

    @ManyToMany(cascade = {DETACH, MERGE, REFRESH}, mappedBy = "courses")
    private List<Student> students;

    // many menen butkon klasska mappedby jazylat(OneToMany)
    @OneToMany(cascade = {REMOVE, REFRESH, MERGE, PERSIST})
    private List<Lesson> lessons;

    public Course(String name, int price, LocalDate dateOfStart) {
        this.name = name;
        this.price = price;
        this.dateOfStart = dateOfStart;
    }
}
