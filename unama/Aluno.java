package unama;

public class Aluno {
    public String nome;
    private String cpf;
    public int matricula;

    public Aluno(String nome, int matricula, String cpf){
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
    }
    void realizarCpf(){
        System.out.println("cpf usado");
    }
    void realizarNome(){
        System.out.println("nick usado");
    }
    void realizarCadastrar(){
        System.out.println("cadastro realizado");
    }
    void  realizarMatricula(){
        System.out.println("numero da matricula");
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public Aluno(String cpf){
        this.cpf=cpf;
    }
}
