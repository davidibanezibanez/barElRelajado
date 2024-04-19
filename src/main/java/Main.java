public class Main {
    public static void main(String[] args) {
        Barra barra = new Barra();
        Administrador administrador = new Administrador();
        Usuario usuario = new Usuario();
        barra.mostrarCantidadDeCocaColasDisponibles();
        usuario.comprarCocaCola();
        usuario.comprarCocaCola();
        barra.mostrarCantidadDeCocaColasDisponibles();
        administrador.agregarCocaCola();
        administrador.agregarCocaCola();
        barra.mostrarCantidadDeCocaColasDisponibles();
    }
}
