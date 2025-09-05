
public class usuario {

    private String nome;
    private String cidade;

    public usuario(String nome, String regiao) {
        this.nome = nome;
        this.regiao = região;
    }

    // Getters e Setters para acessar e modificar os atributos privados

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    /**
     * Método para exibir as informações.
     */

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Região: " + regiao);
    }

    