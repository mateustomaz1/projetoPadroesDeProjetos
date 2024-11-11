package ifpb.edu.br.service;

import ifpb.edu.br.entities.Feedback;

import java.util.List;

public interface FeedbackService {
    void adicionarFeedback(Feedback feedback);

    List<Feedback> listarFeedbacksPorProduto(String produtoId);

    List<Feedback> listarFeedbacksPorVendedor(String vendedorId);
}