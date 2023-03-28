public class Pastel {


   private String sabor;
    private double precio;

    public Pastel(String sabor, double precio) {

        this.sabor = sabor;
        this.precio = precio;
    }


    public  String getSabor() {

        return sabor;
    }

    public  double getPrecio() {

        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pastel{");
        sb.append("sabor='").append(sabor).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
