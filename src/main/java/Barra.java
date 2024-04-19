import java.util.LinkedHashMap;

public class Barra {
    public static LinkedHashMap<Bebida, Integer> bebidasDisponibles = new LinkedHashMap<>();
    public static LinkedHashMap<Plato, Integer> platosDisponibles = new LinkedHashMap<>();

    public static Bebida cocaCola = new Bebida("Coca Cola", 1, 2000);
    public static Bebida sprite = new Bebida("Sprite", 1, 2000);
    public static Bebida fanta = new Bebida("Fanta", 1, 2000);

    public static Plato papasFritas = new Plato("Papas Fritas", 500, 3000);
    public static Plato completo = new Plato("Completo", 300, 3000);
    public static Plato churrasco = new Plato("Churrasco", 800, 5000);

    public Barra() {
        bebidasIniciales();
        platosIniciales();
    }

    public void bebidasIniciales(){
        bebidasDisponibles.put(cocaCola, 100);
        bebidasDisponibles.put(sprite, 100);
        bebidasDisponibles.put(fanta, 100);
    }
    public void platosIniciales(){
        platosDisponibles.put(papasFritas, 100);
        platosDisponibles.put(completo, 100);
        platosDisponibles.put(churrasco, 100);
    }
    public void mostrarCantidadDeCocaColasDisponibles(){
        System.out.println("Las cantidad de Coca Colas disponibles son: " + Barra.bebidasDisponibles.get(cocaCola));
    }
}
