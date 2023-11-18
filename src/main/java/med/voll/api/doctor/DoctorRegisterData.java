package med.voll.api.doctor;

import med.voll.api.address.AddressData;

public record DoctorRegisterData(
        String nome,
        String email,
        String crm,
        Specialization especialidade,
        AddressData endereco) {
}
