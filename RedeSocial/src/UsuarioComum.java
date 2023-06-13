public class UsuarioComum extends Usuarios {
    private String interesses;

    public UsuarioComum(String nome, String email, String senha) {
        super(nome, email, senha);
        this.interesses = interesses;
    }

    public String getInteresses() {
        return interesses;
    }

    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }


    @Override
    public void enviarMensagem() {

    }
}
