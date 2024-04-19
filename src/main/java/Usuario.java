public class Usuario {
    public void comprarCocaCola(){
        Barra.bebidasDisponibles.replace(Barra.cocaCola, Barra.bebidasDisponibles.get(Barra.cocaCola)-1);
        System.out.println("Usted ha comprado 1 Coca Cola");
    }
}
