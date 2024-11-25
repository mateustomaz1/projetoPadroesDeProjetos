package com.ifpb.marketingPlace.marketplace.service;

import java.util.List;

import ifpb.edu.br.marketplace.model.Pedido;

public interface PedidoService {
    Pedido criarPedido(Pedido pedido);

    Pedido buscarPedidoPorId(String id);

    List<Pedido> listarPedidosPorUsuario(String usuarioId);

    void atualizarStatusPedido(String id, String status);

    void cancelarPedido(String id);

    List<Pedido> listarTodosPedidos();
}
