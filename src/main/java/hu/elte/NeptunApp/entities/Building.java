package hu.elte.NeptunApp.entities;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import javax.persistence.*;

import java.util.List;

@Data
@Entity
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "building")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String b_name;

    @Column(nullable = false)
    private Integer floors;

    @Column(nullable = false)
    private Integer room;

    @OneToMany(mappedBy = "building", targetEntity = Subject.class, cascade = CascadeType.ALL)
    private List<Subject> subjectList;

}
