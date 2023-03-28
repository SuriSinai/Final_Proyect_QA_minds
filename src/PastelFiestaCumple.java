
public class PastelFiestaCumple extends Pastel{
    private int velas ;

    public PastelFiestaCumple(String sabor, double precio, int velas) {
        super(sabor, precio);
        this.velas = velas;
    }

    public int getVelas() {
        return velas;
    }

    public void setVelas(int velas) {
        this.velas = velas;
    }
}
