package com.ifpb.marketingPlace.marketplace.service;

import java.util.List;

import ifpb.edu.br.marketplace.model.Pagamento;
import ifpb.edu.br.marketplace.model.Pedido;

public interface PagamentoService {
    boolean processarPagamento(Pedido pedido);

    String verificarStatusPagamento(String pagamentoId);

    void estornarPagamento(String pagamentoId);

    List<Pagamento> listarPagamentosPorUsuario(String usuarioId);
}
