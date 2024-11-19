package ifpb.edu.br.service;

import ifpb.edu.br.model.Usuario;

import java.util.List;

public interface UsuarioService {
    void registrarUsuario(Usuario usuario);

    Usuario buscarUsuarioPorId(String id);

    List<Usuario> buscarTodosUsuarios();

    void atualizarUsuario(Usuario usuario);

    void removerUsuario(String id);

    boolean autenticarUsuario(String email, String senha);

    List<Usuario> buscarVendedores();
}
