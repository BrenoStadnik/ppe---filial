package br.senai.controller;

import br.senai.service.FilialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilialController {

    @Autowired
    FilialServiceImpl filialService;

    @GetMapping("/filial/list")
    public String findAll(Model model){
        System.out.println(filialService.findAll());

        return "filial/list";
    }
}
