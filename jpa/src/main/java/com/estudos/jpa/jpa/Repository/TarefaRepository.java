package com.estudos.jpa.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.jpa.jpa.Entities.Tarefa;
import com.estudos.jpa.jpa.dto.TarefaDTO;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {  
}
