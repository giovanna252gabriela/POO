public class Quadrado extends PoligonoRegular {
    public float lado;

    public Quadrado(int numLado, float tamLado, float lado) {
        super(numLado, tamLado);
        this.lado = lado;
    }

    public float calcularArea() {
        return getTamLados()*getTamLados();
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}

