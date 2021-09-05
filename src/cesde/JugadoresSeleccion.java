package cesde;

public class JugadoresSeleccion {

    public String numeroCamiseta;
    public String nombre;
    public String apellidos;
    public String posicion;
    public String edad;
    public String equipoDondeJuega;

    public JugadoresSeleccion(){}

    public JugadoresSeleccion(String numeroCamiseta, String nombre, String apellidos, String posicion, String edad, String equipoDondeJuega) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.posicion = posicion;
        this.edad = edad;
        this.equipoDondeJuega = equipoDondeJuega;
    }

    public String getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(String numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEquipoDondeJuega() {
        return equipoDondeJuega;
    }

    public void setEquipoDondeJuega(String equipoDondeJuega) {
        this.equipoDondeJuega = equipoDondeJuega;
    }
}
