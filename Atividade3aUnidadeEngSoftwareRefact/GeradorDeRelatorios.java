package Atividade3aUnidadeEngSoftwareRefact;
import java.time.LocalDate;
import java.util.List;

public class GeradorDeRelatorios {
    public static void main(String[] args) {

        Funcionario carla = new Funcionario("Carla", Departamento.TI, "Analista Sênior");
        List<String> atividadesCarla = List.of(
            "Desenvolvimento do novo módulo de pagamentos",
            "Reunião de sprint planning",
            "Code review de pull requests"
        );


        Funcionario joao = new Funcionario("João", Departamento.RH, "Gerente de Pessoas");
        List<String> atividadesJoao = List.of(
            "Entrevista com candidatos",
            "Planejamento de treinamento trimestral"
        );
        

        LocalDate dataRelatorio = LocalDate.now();


        RelatorioBuilder builder = new RelatorioBuilder();


        String relatorioCarla = builder.montarRelatorio(carla, dataRelatorio, atividadesCarla);
        System.out.println("--- Relatório da Carla ---");
        System.out.println(relatorioCarla);


        String relatorioJoao = builder.montarRelatorio(joao, dataRelatorio, atividadesJoao);
        System.out.println("--- Relatório do João ---");
        System.out.println(relatorioJoao);}
}
