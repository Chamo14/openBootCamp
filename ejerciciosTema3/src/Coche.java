public class Coche {
    //ATTRIBUTES
    private int cantPuertas;

    //CONSTRUCTORS
    public Coche() {
    }

    public Coche(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    //GETTERS AND SETTERS
    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    //FUNCTIONS

    public void añadirPuerta(Coche coche){
        coche.setCantPuertas(coche.getCantPuertas()+1);
    }
}
