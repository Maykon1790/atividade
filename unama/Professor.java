package unama;
public class Professor{
    public String nome;
    private  String  cpf;
    public boolean  hasMestrado;



    void cadastrar(){
        System.out.println("cadastrando o professor");
    }
    public Professor(String nome){
        this.nome = nome;
    }    
}