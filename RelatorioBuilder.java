import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Classe responsável por construir a string final do relatório.
 * Suas responsabilidades são focadas apenas na montagem e formatação.
 */
class RelatorioBuilder {

    /**
     * Monta o relatório com base nos objetos fornecidos.
     */
    public String montarRelatorio(Funcionario funcionario, LocalDate data, List<String> atividades) {
        StringBuilder relatorio = new StringBuilder();

        construirCabecalho(relatorio, funcionario);
        construirData(relatorio, data);
        construirCorpo(relatorio, atividades);
        construirRodape(relatorio, funcionario);

        return relatorio.toString();
    }

    private void construirCabecalho(StringBuilder sb, Funcionario f) {
        sb.append("Relatório de ").append(f.getNome())
          .append(" - ").append(f.getDepartamento().getNomeExibicao()) // Usa o nome formal do enum
          .append(" (").append(f.getCargo()).append(")\n");
    }

    private void construirData(StringBuilder sb, LocalDate data) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        sb.append("Data: ").append(data.format(formatador)).append("\n");
    }

    private void construirCorpo(StringBuilder sb, List<String> atividades) {
        sb.append("Atividades:\n");
        if (atividades == null || atividades.isEmpty()) {
            sb.append("- Nenhuma atividade registrada.\n");
        } else {
            for (String atividade : atividades) {
                sb.append("- ").append(atividade).append("\n");
            }
        }
    }

    private void construirRodape(StringBuilder sb, Funcionario f) {

        // A verificação com enum é mais segura e legível
        if (f.getDepartamento() == Departamento.TI) {
            sb.append("Recursos de TI utilizados: Git, CI/CD\n");
        }
    }
}