package com.prova.restapi.database;

import com.prova.restapi.entidade.Contato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioContato extends JpaRepository<Contato,Long>{
    
}