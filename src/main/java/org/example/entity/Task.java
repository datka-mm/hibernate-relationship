package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.BaseEntity;

import java.time.LocalDate;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(name = "base_id_gen", sequenceName = "task_seq", allocationSize = 1)
public class Task extends BaseEntity {

    private String title;
    private String description;
    private LocalDate deadline;

    @OneToOne(cascade = {MERGE, REFRESH, PERSIST})
    private Lesson lesson;
}
