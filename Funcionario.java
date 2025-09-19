
class Funcionario {
    private String nome;
    private Departamento departamento;
    private String cargo;

    public Funcionario(String nome, Departamento departamento, String cargo) {
        this.nome = nome;
        this.departamento = departamento;
        this.cargo = cargo;
    }


    public String getNome() { return nome; }
    public Departamento getDepartamento() { return departamento; }
    public String getCargo() { return cargo;}
}