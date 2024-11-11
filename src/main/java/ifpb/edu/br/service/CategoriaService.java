package ifpb.edu.br.service;

import ifpb.edu.br.entities.Categoria;

import java.util.List;

public interface CategoriaService {
    void adicionarCategoria(Categoria categoria);

    Categoria buscarCategoriaPorId(String id);

    List<Categoria> listarCategorias();

    void atualizarCategoria(Categoria categoria);

    void removerCategoria(String id);
}
