public class Administrador {
    public void agregarCocaCola(){
        Barra.bebidasDisponibles.replace(Barra.cocaCola, Barra.bebidasDisponibles.get(Barra.cocaCola)+1);
        System.out.println("Usted ha agregado 1 Coca Cola");
    }
}
