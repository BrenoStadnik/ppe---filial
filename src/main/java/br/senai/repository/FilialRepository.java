package br.senai.repository;

import br.senai.model.Filial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilialRepository extends JpaRepository<Filial, Long> {

    public Filial findByNome(String nome);
    public Filial findByLocalizacao(String localizacao);
     public Filial findByRazaoSocial(String razaoSocial);
}
