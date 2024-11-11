package ifpb.edu.br.service;

import ifpb.edu.br.entities.Produto;

import java.util.List;

public interface ProdutoService {
    void adicionarProduto(Produto produto);

    Produto buscarProdutoPorId(String id);

    List<Produto> listarProdutos();

    List<Produto> listarProdutosPorCategoria(String categoriaId);

    void atualizarProduto(Produto produto);

    void removerProduto(String id);

    List<Produto> buscarProdutosPorVendedor(String vendedorId);
}
