
package hu.elte.NeptunApp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Subject")
@Entity
@EqualsAndHashCode
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String name;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Integer credit;

    @Column(nullable = false)
    private Integer buildingid;


    @Column(nullable = false)
    private String status;


    @ManyToMany(mappedBy = "subjects")
    @JsonIgnore
    private List<User> users;

    @ManyToOne(targetEntity = Building.class)
    @JoinColumn
    @JsonIgnore
    private Building building;




}

