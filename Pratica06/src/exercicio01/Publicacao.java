package exercicio01;

public class Publicacao {
    private String dataPublicacao;
    private String textoPublicacao;
    private String linkMidia;
    public static double contadorPublicacao=0;

    public Publicacao(String cataPublicacao, String textoPublicacao, String linkMidia) {
        this.dataPublicacao = cataPublicacao;
        this.textoPublicacao = textoPublicacao;
        this.linkMidia = linkMidia;
        contadorPublicacao++;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }
}
