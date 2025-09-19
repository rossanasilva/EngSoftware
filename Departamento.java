
enum Departamento {

    TI("Tecnologia da Informação"),
    RH("Recursos Humanos"),
    VENDAS("Comercial"),
    FINANCEIRO("Financeiro");


    private final String nomeExibicao;

    Departamento(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }


    public String getNomeExibicao() {
        return nomeExibicao;}
}