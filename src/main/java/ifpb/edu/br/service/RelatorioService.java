package ifpb.edu.br.service;

import ifpb.edu.br.model.Relatorio;

import java.time.LocalDate;

public interface RelatorioService {
    Relatorio gerarRelatorioVendas(String vendedorId, LocalDate dataInicio, LocalDate dataFim);

    Relatorio gerarRelatorioProdutosVendidos();

    Relatorio gerarRelatorioUsuarios();
}
