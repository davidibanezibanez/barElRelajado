import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Plato {

    private String nombre;
    private double gramos;
    private int precio;

    @Override
    public String toString() {
        return nombre + "\n" + gramos + " gramo(s)\n" + precio + " pesos";
    }
}
