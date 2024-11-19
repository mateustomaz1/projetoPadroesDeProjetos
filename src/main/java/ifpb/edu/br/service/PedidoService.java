package ifpb.edu.br.service;

import ifpb.edu.br.model.Pedido;

import java.util.List;

public interface PedidoService {
    Pedido criarPedido(Pedido pedido);

    Pedido buscarPedidoPorId(String id);

    List<Pedido> listarPedidosPorUsuario(String usuarioId);

    void atualizarStatusPedido(String id, String status);

    void cancelarPedido(String id);

    List<Pedido> listarTodosPedidos();
}
