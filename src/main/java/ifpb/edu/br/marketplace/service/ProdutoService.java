package ifpb.edu.br.marketplace.service;

import java.util.List;

import ifpb.edu.br.marketplace.model.Produto;

public interface ProdutoService {
    void adicionarProduto(Produto produto);

    Produto buscarProdutoPorId(String id);

    List<Produto> listarProdutos();

    List<Produto> listarProdutosPorCategoria(String categoriaId);

    void atualizarProduto(Produto produto);

    void removerProduto(String id);

    List<Produto> buscarProdutosPorVendedor(String vendedorId);
}
