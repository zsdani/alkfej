package hu.elte.NeptunApp.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
//@JsonIgnoreProperties({"Role", "Sum credit", "E-mail address"})
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(unique = true)
        private String username;

        @Column(nullable = false)
        private String name;

        @Enumerated(EnumType.STRING)
        private Role role;

        @Column
        private Integer sum_credit;

        @Column(nullable = false)
        private String e_mail;

        @ManyToMany(fetch = FetchType.LAZY, cascade =
                {
                        CascadeType.DETACH,
                        CascadeType.MERGE,
                        CascadeType.REFRESH,
                        CascadeType.PERSIST
                })
        @JoinTable
        @JsonIgnore
        private List<Subject> subjects;


}



