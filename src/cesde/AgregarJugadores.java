package cesde;

import java.util.ArrayList;

import static cesde.OpcionesMenu.imprimirOpcionesMenuExecptoIndefinida;

public class AgregarJugadores {
    public ArrayList<JugadoresSeleccion> listaJugadores;
    private final ControladorConsola consola;
    public JugadoresSeleccion jugadores;

    public AgregarJugadores() {
        consola = new ControladorConsola();
        listaJugadores =  new ArrayList<>();
        jugadores = new JugadoresSeleccion();
    }

    public void insertar(){



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


        }


    public void buscar(){

        consola.imprimir("Buscar un jugador por numero");

        String Busqueda = consola.getEntradaDatos();

        for(int i = 0; i < listaJugadores.size(); i++) {
            JugadoresSeleccion jugador = listaJugadores.get(i);

            if(Busqueda.equals(jugador.getNumeroCamiseta())){
                consola.imprimirConSaltoLinea(jugador.getNombre());
                consola.imprimirConSaltoLinea(jugador.getNumeroCamiseta());
            }
        }
        imprimirOpcionesMenuExecptoIndefinida(consola);

    }

    public void editar(){

    }

    public void mostar(){

    }

}
