package ifpb.edu.br.service;

import ifpb.edu.br.entities.Pagamento;
import ifpb.edu.br.entities.Pedido;

import java.util.List;

public interface PagamentoService {
    boolean processarPagamento(Pedido pedido);

    String verificarStatusPagamento(String pagamentoId);

    void estornarPagamento(String pagamentoId);

    List<Pagamento> listarPagamentosPorUsuario(String usuarioId);
}
