//Implementar a classe Main do Projeto, onde será possível:
//Cadastrar Pessoa Física
//Cadastrar Promotor
//Cadastrar Evento em um ArrayList
//Cadastrar Ingresso em um ArrayList, sendo que um evento pode ter mais de um tipo de ingresso, por exemplo:
// VIP, CAMAROTE e PISTA
//Criar um objeto do tipo VendaSite e adicionar o conteúdo do atributo qtdeMax.
//Cadastrar os ingressos para vender no site, ou seja, utilize o método vendaSite da classe "VendaSite"
// para cadastrar os ingressos, porém, antes de efetuar o cadastro deverá ser usado o método validaQtdeIngresso
// que deverá retornar verdadeiro para que seja efetuado o cadastro.
// Cadastro de Pessoa Física


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new UsuarioComum("23498735699", "09/12/2000");
        ((UsuarioComum) pessoa).setCpf("23498735699");
        ((UsuarioComum) pessoa).setDataNascimento("09/12/2000");

        Promotor promotor = new Promotor("00984344334");
        promotor.setCnpj("987536789");

        List<Evento> eventos = new ArrayList<>();
        Evento evento1 = new Evento("Evento A", "02/12/2024", "21:00", "Local AB");
        eventos.add(evento1);
        Evento evento2 = new Evento("Evento B", "23/12/2025", "19:00", "Local CD");
        eventos.add(evento2);

        ArrayList<Ingresso> ingressos = new ArrayList<>();
        Ingresso ingresso1 = new Ingresso(evento1, 250.0, 500, "vip");
        ingressos.add(ingresso1);
        Ingresso ingresso2 = new Ingresso(evento1, 220.0, 500, "vip2");
        ingressos.add(ingresso2);
        Ingresso ingresso3 = new Ingresso(evento2, 375.0, 1000, "vip3");
        ingressos.add(ingresso3);

        VendaSite vendaSite = new VendaSite(1000);
        for (Ingresso ingresso : ingressos) {
            if (vendaSite.validaQtdeIngresso()) {
                vendaSite.insereIngressoVenda(ingresso);
            }
        }
    }
}

