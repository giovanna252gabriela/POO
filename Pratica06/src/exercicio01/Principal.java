package exercicio01;
import jdk.nashorn.internal.scripts.JO;
import  java.util.ArrayList;

import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
       String dataCriacao, nomeUsuario, dataNascimento, senha;
         String dataPublicacao;
         String textoPublicacao;
        String linkMidia;
       dataCriacao = JOptionPane.showInputDialog("digite a data de criacao da rede social");
       nomeUsuario = JOptionPane.showInputDialog("digiteo nome do usuario");
       dataNascimento = JOptionPane.showInputDialog("digite a data de nascimento");
       senha = JOptionPane.showInputDialog("digite a senha");
       RedeSocial redesocial1 = new RedeSocial(dataCriacao,nomeUsuario,dataNascimento,senha);
        Publicacao publi1;
       ArrayList<Publicacao> publi = new ArrayList<>();
       for(int i=0; i<3;i++){
           dataPublicacao = JOptionPane.showInputDialog("digite a data de publicacao");
           textoPublicacao = JOptionPane.showInputDialog("digite o texto");
           linkMidia = JOptionPane.showInputDialog("digite o link");
          publi1 = new Publicacao(dataPublicacao, textoPublicacao , linkMidia);
           publi.add(publi1);
redesocial1.inserePublicacao(publi.get(i));
redesocial1.imprimePublicacoes();
       }


    }
}
