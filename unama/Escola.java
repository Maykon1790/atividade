package unama;
public class Escola{
    
        public static  void main(String[]agrs){
            Aluno aluno1 = new Aluno("Maykon",1212321,"1232456431");
            System.out.println(aluno1.nome);
            aluno1.realizarNome();
            System.out.println(aluno1.matricula);
            aluno1.realizarMatricula();
            System.out.println(aluno1.getCpf());
            aluno1.realizarCpf();
            aluno1.realizarCadastrar();
            Professor prof = new Professor("alessandro");
            System.out.println(prof.nome);
        }
        

     
    
}