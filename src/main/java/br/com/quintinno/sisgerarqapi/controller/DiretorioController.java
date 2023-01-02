package br.com.quintinno.sisgerarqapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quintinno.sisgerarqapi.model.DiretorioModel;
import br.com.quintinno.sisgerarqapi.service.DiretorioService;

@RestController
@RequestMapping("/api/v1/diretorio")
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
