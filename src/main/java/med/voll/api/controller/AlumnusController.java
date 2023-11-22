package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.alumnus.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    public Page<AlumnusDataList> list(@PageableDefault(size = 10, sort = {"classEntry"}) Pageable pagination) {
        return repository.findAll(pagination).map(AlumnusDataList::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid AlumnusUpdateData data) {
        var alumnus = repository.getReferenceById(data.id());
        alumnus.updateData(data);
    }
}
