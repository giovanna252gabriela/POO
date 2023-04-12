public abstract class PoligonoRegular {
    public int numLados;
    public float tamLados;

    public PoligonoRegular(int numLado, float tamLado) {
    }

    public float calcularPerimetro(){
        return numLados * tamLados;
    }
    public abstract float calcularArea();

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public void setTamLados(float tamLados) {
        this.tamLados = tamLados;
    }

    public float getTamLados() {

    return numLados;


}
}
