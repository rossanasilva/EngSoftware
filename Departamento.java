/**
 * Enum que define um tipo seguro para os departamentos.
 * Só os valores definidos aqui são permitidos, evitando erros de digitação.
 */
enum Departamento {
    // Cada constante do enum pode ter seus próprios dados associados
    TI("Tecnologia da Informação"),
    RH("Recursos Humanos"),
    VENDAS("Comercial"),
    FINANCEIRO("Financeiro");

    // Atributo para armazenar o nome completo/formal do departamento
    private final String nomeExibicao;

    // Construtor do enum (é sempre privado)
    Departamento(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    // Método para acessar o nome de exibição
    public String getNomeExibicao() {
        return nomeExibicao;}
}