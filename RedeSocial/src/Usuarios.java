import java.util.ArrayList;

// Classe Abstrata
public abstract class Usuarios {
    private String nome, email, senha;
    private ArrayList<Usuarios> amigos;

    public Usuarios(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.amigos = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Usuarios> getAmigos() {
        return amigos;
    }

    public void adicionarAmigo(Usuarios amigo) {
        amigos.add(amigo);
    }

    public void removerAmigo(Usuarios amigo) {
        amigos.remove(amigo);
    }

    public boolean eAmigo(Usuarios usuario) {
        return amigos.contains(usuario);
    }

    // Método abstrato
    public abstract void enviarMensagem();

    // Polimorfismo
    public void realizarAcao() {
        // Implementação padrão
        System.out.println("Realizando ação como um usuário genérico...");
    }
}
