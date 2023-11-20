package med.voll.api.alumnus;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "alumnus")
@Entity(name = "Alumnus")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Alumnus {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String contact;
    private String course;
    private String classEntry;
    private boolean employedOnTheField;

    @Embedded
    private Graduation graduation;


    public Alumnus(AlumnusData data) {
        this.name = data.name();
        this.contact = data.contact();
        this.course = data.course();
        this.classEntry = data.classEntry();
        this.employedOnTheField = data.employedOnTheField();
        this.graduation = new Graduation(data.graduationData());
    }
}
