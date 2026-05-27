package com.sistemalogin.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.sistemalogin.security.model.Usuario;
import com.sistemalogin.security.model.UsuarioRepository;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //GET -> Página index
    @GetMapping("/")
    public String index(){
        return "index";
    }
    
    //GET -> Página de cadastro
    @GetMapping("/cadastro")// localhost:8080/cadastro
    public String cadastroUsario(Model model){
        model.addAttribute("usuario", new Usuario());
        return "cadastro";
    }

    //GET -> Página de logada
    @PostMapping("/cadastro")
    public String cadstroRealizado(Model model) {        
        return "redirect:/";
    }
    
    @GetMapping("/logado")
        public String areaLogado(){
            return "logado";
        }

    //POST -> Cadastro de usuário


}
