package hu.elte.NeptunApp.entities;



import javax.persistence.*;


@Table(name = "Exam")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String where;

    private String when;

    private int mark;

    @ManyToOne
    @JoinColumn
    private Subject subject;

}
