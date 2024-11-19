package ifpb.edu.br.marketplace.service;

import java.util.List;

import ifpb.edu.br.marketplace.model.Notificacao;

interface NotificacaoService {
    void enviarNotificacao(String usuarioId, String mensagem);

    void enviarNotificacaoGlobal(String mensagem);

    List<Notificacao> listarNotificacoesPorUsuario(String usuarioId);
}
