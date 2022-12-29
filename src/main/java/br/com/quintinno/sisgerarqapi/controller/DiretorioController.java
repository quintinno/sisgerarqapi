package br.com.quintinno.sisgerarqapi.controller;

import br.com.quintinno.sisgerarqapi.model.DiretorioModel;
import br.com.quintinno.sisgerarqapi.service.DiretorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diretorio")
public class DiretorioController {

    @Autowired
    private DiretorioService diretorioService;

    @PostMapping
    public DiretorioModel saveOne(@RequestBody DiretorioModel diretorioModel) {
        return this.diretorioService.saveOne(diretorioModel);
    }

    @GetMapping
    public List<DiretorioModel> findAll() {
        return this.diretorioService.findAll();
    }

}
