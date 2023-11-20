package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.doctor.Doctor;
import med.voll.api.doctor.DoctorListData;
import med.voll.api.doctor.DoctorRegisterData;
import med.voll.api.doctor.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doctor")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid DoctorRegisterData data) {
        repository.save(new Doctor(data));
    }

    @GetMapping
    public List<DoctorListData> list() {
        return repository.findAll().stream().map(DoctorListData::new).toList();
    }
}