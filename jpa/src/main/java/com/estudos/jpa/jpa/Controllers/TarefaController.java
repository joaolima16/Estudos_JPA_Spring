package com.estudos.jpa.jpa.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.jpa.jpa.Entities.Tarefa;
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

    // @DeleteMapping("/{tarefaId}")
    // @ResponseBody
    // public TarefaDTO deletar(@PathVariable("tarefaId") Long tarefaId, @RequestBody TarefaDTO tarefaDTO){
    //     return tarefaService.deletar(tarefaId);
    // }

    @GetMapping("/{tarefaId}")
    @ResponseBody
    public ResponseEntity getById(@PathVariable("tarefaId") Long tarefaId){
        Optional <Tarefa>tarefa = tarefaService.getById(tarefaId);
        if(tarefa.isEmpty()){
            return ResponseEntity.badRequest().body("Tarefa não encontrada");
        }
        return ResponseEntity.ok().body(tarefa);
    }

    @GetMapping
    @ResponseBody
    public List <Tarefa> getAll(){
        List<Tarefa> tarefas = tarefaService.getAll();
        return tarefas;
    }
}
