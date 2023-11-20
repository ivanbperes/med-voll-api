package med.voll.api.alumnus;

public record AlumnusDataList(
        String name,
        String course,
        String classEntry,
        String advisor) {

        public AlumnusDataList(Alumnus alumnus) {
                this(alumnus.getName(), alumnus.getCourse(), alumnus.getClassEntry(), alumnus.getGraduation().advisor);
        }
}
