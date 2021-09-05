package cesde;

import java.util.Arrays;

public enum OpcionesMenu {

    IDENFINIDA(-1, "Indefinida"),
    AGREGAR_JUGADOR(1, "Agregar Jugador"),
    BUSCAR_JUGADOR(2, "Buscar Jugador"),
    EDITAR_JUGADOR(3, "Editar Jugador"),
    MOSTAR_JUGADOR(4, "Mostrar jugadores"),
    SALIR_PROGRAMA(5, "Salir programa");

    private int id;
    private String descripcion;

    OpcionesMenu(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getInformacion(){
        return id + " " + descripcion;
    }

    public static void imprimirOpcionesMenuExecptoIndefinida(ControladorConsola consola){
        consola.imprimirConSaltoLinea("------Opciones-----");
        Arrays.stream(values()).filter(o -> o != IDENFINIDA)
                .forEach(opcion -> consola.imprimirConSaltoLinea(opcion.getInformacion()));
        consola.imprimirConSaltoLinea("-------------------");
    }
}
