package med.voll.api.alumnus;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record AlumnusData(
        @NotBlank
        String name,
        @NotBlank
        String course,
        @NotBlank
        @Pattern(regexp = "\\d{4}")
        String classEntry,
        boolean employedOnTheField,
        @NotNull
        @Valid
        GraduationData graduationData) {
}
