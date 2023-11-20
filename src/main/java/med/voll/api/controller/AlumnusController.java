package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.alumnus.Alumnus;
import med.voll.api.alumnus.AlumnusData;
import med.voll.api.alumnus.AlumnusDataList;
import med.voll.api.alumnus.AlumnusRepository;
import med.voll.api.doctor.DoctorListData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alumnus")
public class AlumnusController {

    @Autowired
    private AlumnusRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid AlumnusData data) {
        repository.save(new Alumnus(data));
    }

    @GetMapping
    public List<AlumnusDataList> list() {
        return repository.findAll().stream().map(AlumnusDataList::new).toList();
    }
}
