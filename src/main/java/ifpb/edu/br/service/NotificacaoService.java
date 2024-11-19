package ifpb.edu.br.service;

import ifpb.edu.br.model.Notificacao;

import java.util.List;

interface NotificacaoService {
    void enviarNotificacao(String usuarioId, String mensagem);

    void enviarNotificacaoGlobal(String mensagem);

    List<Notificacao> listarNotificacoesPorUsuario(String usuarioId);
}
