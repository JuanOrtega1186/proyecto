package cesde;

import static cesde.OpcionesMenu.imprimirOpcionesMenuExecptoIndefinida;

public class ContraladorJuego {

    private boolean iniciado;
    private final ControladorConsola consola;

    public ContraladorJuego() {
        consola = new ControladorConsola();
    }

    public void iniciar(){
        iniciado = true;
        ejecutar();
    }

    public void ejecutar(){
        int opcion;
        consola.limpiar();
        imprimirOpcionesMenuExecptoIndefinida(consola);
        do {
            opcion = consola.getEntrada();
            consola.limpiar();
            imprimirOpcionesMenuExecptoIndefinida(consola);
            if (opcion == 1) {
                agregarJudarores();
            } else if (opcion == 2) {
                buscarJugador();
            }else if (opcion == 3) {
                editarJugador();
            }else if (opcion == 4) {
                mostrarJugadores();
            }else if (opcion == 5) {
                finalizar();
            } else {
                System.out.println("  ? ");
            }
        } while (iniciado);
        System.out.println("Que la fuerza te acompa\u00f1e");
    }

    public void finalizar(){
        iniciado = false;
    }

    public void agregarJudarores(){
        AgregarJugadores agregar = new AgregarJugadores();
        agregar.insertar();
    }

    public void buscarJugador(){
        AgregarJugadores agregar = new AgregarJugadores();
        agregar.buscar();
    }

    public void editarJugador(){

    }

    public void mostrarJugadores(){

    }
}
