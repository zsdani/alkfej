package hu.elte.NeptunApp.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "User")
public class User {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(unique = true)
        private String username;

        @Column
        private String name;

        @Enumerated(EnumType.STRING)
        //private PersonRole role;

        @Column
        private int sum_credit;

        @Column
        private String e_mail;

        @ManyToMany
        @JoinTable
        private List<Subject> subjects;
}



