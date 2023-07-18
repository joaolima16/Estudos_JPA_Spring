package com.estudos.jpa.jpa.Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.jpa.jpa.Entities.Tarefa;
import com.estudos.jpa.jpa.Repository.TarefaRepository;
import com.estudos.jpa.jpa.dto.TarefaDTO;

@Service
public class TarefaService {
   @Autowired
   private TarefaRepository tarefaRepository;

    public Tarefa criar(TarefaDTO tarefaDTO) { 
        Tarefa tarefa = new Tarefa();
        tarefa.setId(tarefaDTO.getId());
        tarefa.setTitulo(tarefaDTO.getTitulo());
        tarefa.setDescricao(tarefaDTO.getDescricao());
        return tarefaRepository.save(tarefa);

    }

    public TarefaDTO atualizar(TarefaDTO tarefaDTO, Long tarefaId) {
     Optional <Tarefa>tarefa = tarefaRepository.findById(tarefaId);
        
        return tarefaDTO;
    }

    // public TarefaDTO getById(Long tarefaId) {
    //     return tarefas.get(tarefaId);
    // }

    // public List<TarefaDTO> getAll() {
    //     return new ArrayList<>(tarefas.values());

    // }

    // public TarefaDTO deletar(Long tarefaId) {
    //     return tarefas.remove(tarefaId);
    // }
}
