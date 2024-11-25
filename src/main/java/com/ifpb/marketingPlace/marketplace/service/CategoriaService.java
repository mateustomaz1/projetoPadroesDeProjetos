package com.ifpb.marketingPlace.marketplace.service;

import java.util.List;

import ifpb.edu.br.marketplace.model.Categoria;

public interface CategoriaService {
    void adicionarCategoria(Categoria categoria);

    Categoria buscarCategoriaPorId(String id);

    List<Categoria> listarCategorias();

    void atualizarCategoria(Categoria categoria);

    void removerCategoria(String id);
}
