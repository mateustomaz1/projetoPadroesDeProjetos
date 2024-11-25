package com.ifpb.marketingPlace.marketplace.service;

import java.util.List;

import ifpb.edu.br.marketplace.model.Feedback;

public interface FeedbackService {
    void adicionarFeedback(Feedback feedback);

    List<Feedback> listarFeedbacksPorProduto(String produtoId);

    List<Feedback> listarFeedbacksPorVendedor(String vendedorId);
}
