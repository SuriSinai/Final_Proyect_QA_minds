
public class PastelBoda extends Pastel{

    private int niveles;

    public PastelBoda(String sabor, double precio, int niveles) {
       super(sabor, precio);
        this.niveles = niveles;
    }

    public int getNiveles() {
        return niveles;
    }

    public void setNiveles(int niveles) {
        this.niveles = niveles;
    }
}
