package trivial;

public class Jugador {
    private String nombre;
    private String usuario;

    private int puntuacion;

    private int numeroAciertos;

    private int numeroFallos;

    public Jugador() {
        puntuacion = 0;
        numeroAciertos = 0;
        numeroFallos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getNumeroAciertos() {
        return numeroAciertos;
    }

    public void setNumeroAciertos(int numeroAciertos) {
        this.numeroAciertos = numeroAciertos;
    }

    public int getNumeroFallos() {
        return numeroFallos;
    }

    public void setNumeroFallos(int numeroFallos) {
        this.numeroFallos = numeroFallos;
    }
}
