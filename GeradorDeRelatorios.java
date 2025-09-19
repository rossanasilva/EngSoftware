import java.time.LocalDate;
import java.util.List;

public class GeradorDeRelatorios {
    public static void main(String[] args) {
        // --- Cenário 1: Funcionário de TI ---
        Funcionario carla = new Funcionario("Carla", Departamento.TI, "Analista Sênior");
        List<String> atividadesCarla = List.of(
            "Desenvolvimento do novo módulo de pagamentos",
            "Reunião de sprint planning",
            "Code review de pull requests"
        );

        // --- Cenário 2: Funcionário de RH ---
        Funcionario joao = new Funcionario("João", Departamento.RH, "Gerente de Pessoas");
        List<String> atividadesJoao = List.of(
            "Entrevista com candidatos",
            "Planejamento de treinamento trimestral"
        );
        
        // Data para os relatórios
        LocalDate dataRelatorio = LocalDate.now(); // Pega a data atual do sistema

        // Objeto responsável por construir os relatórios
        RelatorioBuilder builder = new RelatorioBuilder();

        // Gerando e imprimindo o relatório para a Carla (vai incluir a linha de TI)
        String relatorioCarla = builder.montarRelatorio(carla, dataRelatorio, atividadesCarla);
        System.out.println("--- Relatório da Carla ---");
        System.out.println(relatorioCarla);

        // Gerando e imprimindo o relatório para o João (NÃO vai incluir a linha de TI)
        String relatorioJoao = builder.montarRelatorio(joao, dataRelatorio, atividadesJoao);
        System.out.println("--- Relatório do João ---");
        System.out.println(relatorioJoao);}
}