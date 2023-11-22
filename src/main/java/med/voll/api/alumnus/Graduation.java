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
    Boolean finishedOnTime;
    String advisor;
    String thesis;

    public Graduation(GraduationData data) {
        this.finishedOnTime = data.finishedOnTime();
        this.advisor = data.advisor();
        this.thesis = data.thesis();
    }

    public void updateData(GraduationData data) {
        if (data.finishedOnTime() != null) {
            this.finishedOnTime = data.finishedOnTime();
        }

        if (data.advisor() != null) {
            this.advisor = data.advisor();
        }

        if (data.thesis() != null) {
            this.thesis = data.thesis();
        }
    }
}
