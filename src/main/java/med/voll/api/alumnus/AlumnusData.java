package med.voll.api.alumnus;

public record AlumnusData(
        String name,
        String course,
        String classEntry,
        boolean employedOnTheField,
        GraduationData graduationData) {
}
