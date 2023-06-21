public class Evento {
    private String titulo;
    private String data;
    private String hora;
    private String local;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Evento(String titulo, String data, String hora, String local) {
        this.titulo = titulo;
        this.data = data;
        this.hora = hora;
        this.local = local;
    }
}
