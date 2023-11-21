package med.voll.api.alumnus;

public record AlumnusDataList(
        Long id,
        String name,
        String course,
        String classEntry,
        String advisor) {

        public AlumnusDataList(Alumnus alumnus) {
                this(alumnus.getId(), alumnus.getName(), alumnus.getCourse(), alumnus.getClassEntry(), alumnus.getGraduation().advisor);
        }
}
