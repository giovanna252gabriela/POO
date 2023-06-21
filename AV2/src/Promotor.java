public class Promotor extends Pessoa {
    private String cnpj;

    public Promotor(String cnpj) {
        super();
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
