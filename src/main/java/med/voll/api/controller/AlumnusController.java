package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.alumnus.Alumnus;
import med.voll.api.alumnus.AlumnusData;
import med.voll.api.alumnus.AlumnusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alumnus-registration")
public class AlumnusController {

    @Autowired
    private AlumnusRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid AlumnusData data) {
        repository.save(new Alumnus(data));
    }
}
