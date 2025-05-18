package Ejercicio10;

public class Vuelo implements Reservable{
    private String aereolinea;
    private String destino;

    public Vuelo(String aereolinea, String destino) {
       this.aereolinea = aereolinea;
        this.destino = destino;
    }

    @Override
    public void reservar() {
        System.out.println("Vuelo al destino '" + destino + " Con aereolinea " + aereolinea + "' reservado con éxito.");

    }
}
