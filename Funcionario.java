/**
 * Classe para agrupar os dados de um funcionário.
 * Utiliza o enum Departamento para garantir que o departamento seja sempre válido.
 */
class Funcionario {
    private String nome;
    private Departamento departamento; // O tipo do departamento agora é o enum
    private String cargo;

    public Funcionario(String nome, Departamento departamento, String cargo) {
        this.nome = nome;
        this.departamento = departamento;
        this.cargo = cargo;
    }

    // Getters para acessar os dados de forma controlada
    public String getNome() { return nome; }
    public Departamento getDepartamento() { return departamento; }
    public String getCargo() { return cargo;}
}