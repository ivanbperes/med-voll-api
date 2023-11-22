package med.voll.api.alumnus;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record GraduationData(
        @NotNull
        Boolean finishedOnTime,
        @NotBlank
        String advisor,
        @NotBlank
        String thesis) {
}