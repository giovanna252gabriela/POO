import javax.swing.*;
import java.util.ArrayList;

public class RedeSocial {
    private ArrayList<Usuarios> usuarios;
    private Usuarios usuarioAtual;

    public RedeSocial() {
        usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(){
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String email = JOptionPane.showInputDialog("Digite seu email:");
        String senha = JOptionPane.showInputDialog("Digite sua senha:");

        Usuarios usuario = new UsuarioComum(nome, email, senha); // Polimorfismo
        usuarios.add(usuario);

        JOptionPane.showMessageDialog(null, "Usuario Cadastrado com sucesso!");
    }

    public void realizarLogin() {
        String email = JOptionPane.showInputDialog("Digite seu email:");
        String senha = JOptionPane.showInputDialog("Digite sua senha:");

        for (Usuarios usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                usuarioAtual = usuario;
                break;
            }
        }

        if (usuarioAtual != null) {
            telaInicio();
        } else {
            JOptionPane.showMessageDialog(null, "Login inválido!");
        }
    }

    private void telaInicio() {
        int opcoes = 0;
        while (opcoes != 5) {
            opcoes = Integer.parseInt(JOptionPane.showInputDialog("1- Incluir\n2- Consultar\n3- Excluir Amigo" +
                    "\n4- Enviar Mensagem\n5-Logout"));
            switch (opcoes) {
                case 1:
                    adicionarAmigo();
                    break;
                case 2:
                    listaAmigos();
                    break;
                case 3:
                    excluirAmigo();
                    break;
                case 4:
                    enviarMensagem();
                    break;
                case 5:
                    logout();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida!");
            }
        }
    }

    private void adicionarAmigo() {
        String nomeAmigo = JOptionPane.showInputDialog("Digite o nome do seu amigo:");
        Usuarios amigo = null;
        Usuarios usuario = usuarioAtual;

        for (Usuarios u : usuarios) {
            if (u.getNome().equals(nomeAmigo)) {
                amigo = u;
                break;
            }
        }

        if (usuario != null && amigo != null) {
            usuario.adicionarAmigo(amigo);
            JOptionPane.showMessageDialog(null, "Amigo adicionado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar o amigo."
                    + "Verifique se digitou corretamente.");
        }
    }

    private void listaAmigos() {
        if (usuarioAtual != null) {
            String amigos = "";
            ArrayList<Usuarios> amigosDoUsuario = usuarioAtual.getAmigos();

            for (Usuarios amigo : amigosDoUsuario) {
                amigos += amigo.getNome() + "\n";
            }

            if (!amigos.isEmpty())
                JOptionPane.showMessageDialog(null, "Lista de Amigos:\n" + amigos);
            else
                JOptionPane.showMessageDialog(null, "Você não tem amigos na rede social.");
        }
    }

    private void excluirAmigo() {
        if (usuarioAtual != null) {
            String nomeAmigo = JOptionPane.showInputDialog("Digite o nome do amigo que deseja excluir:");

            Usuarios amigo = null;
            for (Usuarios u : usuarios) {
                if (u.getNome().equals(nomeAmigo)) {
                    amigo = u;
                    break;
                }
            }

            if (amigo != null && usuarioAtual.eAmigo(amigo)) {
                usuarioAtual.removerAmigo(amigo);
                JOptionPane.showMessageDialog(null, "Amigo removido com sucesso!");
            } else
                JOptionPane.showMessageDialog(null, "Não foi possível encontrar o amigo na " +
                        "sua lista.");
        }
    }

    private void enviarMensagem() {
        if (usuarioAtual != null) {
            String nomeAmigo = JOptionPane.showInputDialog("Digite o nome do amigo para enviar a mensagem:");
            Usuarios amigo = null;

            for (Usuarios u : usuarios) {
                if (u.getNome().equals(nomeAmigo)) {
                    amigo = u;
                    break;
                }
            }

            if (amigo != null && usuarioAtual.eAmigo(amigo)) {
                usuarioAtual.enviarMensagem();
            } else
                JOptionPane.showMessageDialog(null, "Amigo não encontrado ou não " +
                        "está na sua lista de amigos.");
        }
    }

    private void logout() {
        usuarioAtual = null;
        JOptionPane.showMessageDialog(null, "Logout realizado com sucesso.");
    }
}