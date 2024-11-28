package com.equipe1.sistema_escolar.controller;

import com.equipe1.sistema_escolar.model.Aluno;
import com.equipe1.sistema_escolar.repositores.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos") // Corrigido: substituído "name" por "value"
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping // Adicionado para mapear o método como GET
    public List<Aluno> getAlunos() {
        return alunoRepository.findAll();
    }
}
