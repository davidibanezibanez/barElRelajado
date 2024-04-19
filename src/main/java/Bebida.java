import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bebida {

    private String nombre;
    private double litros;
    private int precio;

    @Override
    public String toString() {
        return nombre + "\n" + litros + " litro(s)\n" + precio + " pesos";
    }
}
