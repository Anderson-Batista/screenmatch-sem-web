package br.com.anderson.screenmatch.controller;

import br.com.anderson.screenmatch.dto.SerieDTO;
import br.com.anderson.screenmatch.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {

    @Autowired
    private SerieService service;

    @GetMapping("/series")
    public List<SerieDTO> obterSeries() {
        return service.obterTadasAsSeries();
    }
}
