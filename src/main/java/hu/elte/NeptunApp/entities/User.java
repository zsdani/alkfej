
package hu.elte.NeptunApp.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import hu.elte.NeptunApp.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "Users")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(unique = true)
        private String username;

        @Column(nullable = false)
        private String name;

        @Column(nullable = false)
        private String password;

        @Enumerated(EnumType.STRING)
        private Role role;

        @Column
        private Integer sum_credit;

        @Column(nullable = false)
        private String e_mail;

        @ManyToMany
        @JoinTable
        @JsonIgnore
        private List<Subject> subjects;

        public void removeSubject(Subject subject) {
            this.subjects.remove(subject);
        }


}




