package hu.elte.NeptunApp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "Subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private int code;

    private String description;

    private int credit;

    private boolean accomplished;

    @ManyToMany(mappedBy = "subjects")
    @JsonIgnore
    private List<User> users;

    @OneToMany(mappedBy = "subject")
    @JsonIgnore
    private List<Exam> exams;
}
