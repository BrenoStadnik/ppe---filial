package br.senai.service;

import br.senai.model.Filial;
import br.senai.repository.FilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilialServiceImpl implements FilialService {

    @Autowired
    private FilialRepository filialRepository;

    public List<Filial> findAll(){
        return filialRepository.findAll(Sort.by("nome"));
    }
}

