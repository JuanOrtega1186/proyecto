package cesde;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        List<JugadoresSeleccion> listaJugadores = new ArrayList<>();


        int opcion;
        int chami = 0;
        consola.limpiar();
        imprimirOpcionesMenuExecptoIndefinida(consola);
        do {
            JugadoresSeleccion jugadores = new JugadoresSeleccion();
            opcion = consola.getEntrada();
            consola.getEntradaDatos();
            consola.limpiar();
            imprimirOpcionesMenuExecptoIndefinida(consola);
            if (opcion == 1) {
                consola.imprimir("Ingrese el numero de camiseta: ");
                jugadores.setNumeroCamiseta(consola.getEntradaDatos());

                consola.imprimir("Ingrese el nombre: ");
                jugadores.setNombre(consola.getEntradaDatos());

                consola.imprimir("Ingrese el apellido: ");
                jugadores.setApellidos(consola.getEntradaDatos());

                consola.imprimir("Ingrese la posicion :");
                jugadores.setPosicion(consola.getEntradaDatos());

                consola.imprimir("Ingrese la edad :");
                jugadores.setEdad(consola.getEntradaDatos());

                consola.imprimir("Ingrese el equipo donde juega: ");
                jugadores.setEquipoDondeJuega(consola.getEntradaDatos());

                listaJugadores.add(jugadores);
                imprimirOpcionesMenuExecptoIndefinida(consola);

            } else if (opcion == 2) {

                consola.imprimir("Buscar un jugador por numero");

                String Busqueda = consola.getEntradaDatos();

                for(int i = 0; i < listaJugadores.size(); i++) {
                    JugadoresSeleccion jugador = listaJugadores.get(i);

                    if(Busqueda.equals(jugador.getNumeroCamiseta())){
                        consola.imprimirConSaltoLinea(jugador.getNombre());
                        consola.imprimirConSaltoLinea(jugador.getApellidos());
                        consola.imprimirConSaltoLinea(jugador.getNumeroCamiseta());
                        consola.imprimirConSaltoLinea(jugador.getEdad());
                        consola.imprimirConSaltoLinea(jugador.getPosicion());
                        consola.imprimirConSaltoLinea(jugador.getEquipoDondeJuega());
                    }
                }
                imprimirOpcionesMenuExecptoIndefinida(consola);
            }else if (opcion == 3) {
                consola.imprimir("Buscar un jugador por numero");
                String patente = consola.getEntradaDatos();

                for (int i = 0; i < listaJugadores.size(); i++) {
                    JugadoresSeleccion auto = listaJugadores.get(i);
                    if (patente.equals(auto.getNumeroCamiseta())) {
                        consola.imprimir("Ingrese el nombre: ");
                        auto.setNombre(consola.getEntradaDatos());

                        consola.imprimir("Ingrese el apellido: ");
                        auto.setApellidos(consola.getEntradaDatos());

                        consola.imprimir("Ingrese la posicion :");
                        auto.setPosicion(consola.getEntradaDatos());

                        consola.imprimir("Ingrese la edad :");
                        auto.setEdad(consola.getEntradaDatos());

                        consola.imprimir("Ingrese el equipo donde juega: ");
                        auto.setEquipoDondeJuega(consola.getEntradaDatos());
                        imprimirOpcionesMenuExecptoIndefinida(consola);

                    }
                }

            }else if (opcion == 4) {
                for ( JugadoresSeleccion lista :listaJugadores) {
                    System.out.println(lista);
                }
                imprimirOpcionesMenuExecptoIndefinida(consola);
            }else if (opcion == 5) {
                iniciado= false;
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
}
