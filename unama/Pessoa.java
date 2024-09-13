package unama;

public class Pessoa {
    String nome;
    private String cpf;
}
public class Aluno extends Pessoa{
    int matricula;
}public class Professor extends Pessoa{
    boolean hasMestrado;
}