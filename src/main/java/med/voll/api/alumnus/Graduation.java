package med.voll.api.alumnus;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Graduation {
    boolean finishedOnTime;
    String advisor;
    String thesis;

    public Graduation(GraduationData data) {
        this.finishedOnTime = data.finishedOnTime();
        this.advisor = data.advisor();
        this.thesis = data.thesis();
    }
}
