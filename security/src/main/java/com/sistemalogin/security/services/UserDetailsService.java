package com.sistemalogin.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemalogin.security.model.UsuarioRepository;

@Service
public class UserDetailsService implements UserDetailsService{
    
    // Injeção para acessar os dados do usuario no banco de dados para autenticação
    @Autowired
    private UsuarioRepository usuarioRepository;

    //Metodo que sera chamado SS para carregar os detalhes do usuário com base no nome do usuário(neste caso, será o e-mail) fornecido durante o processo de autenticação
    public UserDetails carregarDadosPorEmail(String email){
        
    }
}
