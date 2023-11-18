package med.voll.api.controller;

import med.voll.api.alumnus.GraduationData;

public record AlumnusData(
        String name,
        String course,
        String classEntry,
        boolean employedOnTheField,
        GraduationData graduationData
) {
}
