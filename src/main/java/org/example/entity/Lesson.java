package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.BaseEntity;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "lessons")
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(name = "base_id_gen", sequenceName = "lesson_seq", allocationSize = 1)
public class Lesson extends BaseEntity {

    private String title;
    private String description;
    private String videoLink;
    private boolean isPresentation;
    private LocalDate publishedDate;

    @OneToOne
    private Task task;
}
