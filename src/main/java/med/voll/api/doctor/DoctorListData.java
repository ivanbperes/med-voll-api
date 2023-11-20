package med.voll.api.doctor;

public record DoctorListData(
        String nome,
        String email,
        String crm,
        Specialization especialidade) {

    public DoctorListData(Doctor doctor) {
        this(doctor.getNome(), doctor.getEmail(), doctor.getCrm(), doctor.getEspecialidade());
    }
}
