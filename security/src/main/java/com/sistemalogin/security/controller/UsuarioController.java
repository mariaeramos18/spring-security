package com.sistemalogin.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sistemalogin.security.model.UsuarioRepository;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //GET -> Página index
    //GET -> Página de cadastro
    //GET -> Página de logada
    //POST -> Cadastro de usuário
}
