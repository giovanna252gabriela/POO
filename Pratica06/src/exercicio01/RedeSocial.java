package exercicio01;
import java.util.ArrayList;

public class RedeSocial {
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;
    ArrayList<Publicacao> publicacoes = new ArrayList<> ();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;

    }
    void inserePublicacao(Publicacao publi){
publicacoes.add(publi);
    }
    void imprimePublicacoes(){
        System.out.println("total de publicacoes: " + Publicacao.getContadorPublicacao());
        for (int i=0;i<publicacoes.size();i++){
            System.out.println("data da publicacao: " + publicacoes.get(i).getDataPublicacao());
            System.out.println("texto da publicao: " + publicacoes.get(i).getTextoPublicacao());
        }
    }

}
