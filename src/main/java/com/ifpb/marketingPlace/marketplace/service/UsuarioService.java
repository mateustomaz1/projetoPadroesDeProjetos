package com.ifpb.marketingPlace.marketplace.service;

import java.util.List;

import ifpb.edu.br.marketplace.model.Usuario;

public interface UsuarioService {
    void registrarUsuario(Usuario usuario);

    Usuario buscarUsuarioPorId(String id);

    List<Usuario> buscarTodosUsuarios();

    void atualizarUsuario(Usuario usuario);

    void removerUsuario(String id);

    boolean autenticarUsuario(String email, String senha);

    List<Usuario> buscarVendedores();
}
