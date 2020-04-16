package hu.elte.NeptunApp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import hu.elte.NeptunApp.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
        private Role role;

        @Column
        private Integer sum_credit;

        @Column
        private String e_mail;

        @ManyToMany
        @JoinTable
        private List<Subject> subjects;


}



