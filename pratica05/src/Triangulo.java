public class Triangulo extends PoligonoRegular {
    public float lado;

    public Triangulo(int numLado, float tamLado) {
        super(numLado, tamLado);
        this.lado = lado;
    }
    @Override


    public float calcularArea() {
        return (getTamLados()*getTamLados())/2;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }



}

