package med.voll.api.alumnus;

import jakarta.validation.constraints.NotNull;

public record AlumnusUpdateData(
        @NotNull
        Long id,
        String name,
        String contact,
        Boolean employedOnTheField,
        GraduationData graduation) {
}
