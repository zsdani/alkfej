package hu.elte.NeptunApp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String code;

    @Column
    private String description;

    @Column
    private Integer credit;

    @Column
    private Integer mark;

    @ManyToMany(mappedBy = "subjects")
    @JsonIgnore
    private List<User> users;

    @OneToMany(mappedBy = "subject")
    @JsonIgnore
    private List<Exam> exams;

}
