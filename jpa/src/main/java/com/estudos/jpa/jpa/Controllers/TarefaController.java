package com.estudos.jpa.jpa.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.jpa.jpa.Entities.Tarefa;
import com.estudos.jpa.jpa.Repository.TarefaRepository;
import com.estudos.jpa.jpa.Services.TarefaService;
import com.estudos.jpa.jpa.dto.TarefaDTO;

@RestController
@RequestMapping(value = "/tarefas")
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @PostMapping
    @ResponseBody
    public Tarefa criar(@RequestBody TarefaDTO tarefaDTO){
        return tarefaService.criar(tarefaDTO);
    }


    // @PutMapping("/{tarefaId}")
    // @ResponseBody
    // public TarefaDTO atualizar(@PathVariable("tarefaId") Long tarefaId, @RequestBody TarefaDTO tarefaDTO){
    //     return tarefaService.atualizar(tarefaDTO, tarefaId);
    // }

    // @DeleteMapping("/{tarefaId}")
    // @ResponseBody
    // public TarefaDTO deletar(@PathVariable("tarefaId") Long tarefaId, @RequestBody TarefaDTO tarefaDTO){
    //     return tarefaService.deletar(tarefaId);
    // }

    // @GetMapping("/{tarefaId}")
    // @ResponseBody
    // public TarefaDTO getById(@PathVariable("tarefaId") Long tarefaId){
    //     return tarefaService.getById(tarefaId);
    // }

    // @GetMapping
    // @ResponseBody
    // public List <TarefaDTO> getAll(){
    //     return tarefaService.getAll();
    // }
}
