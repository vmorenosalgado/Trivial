package trivial;

public class Pregunta {
    private String pregunta;
    private boolean respuesta;
    private int dificultad;

    public Pregunta(String pregunta, boolean respuesta, int dificultad) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.dificultad = dificultad;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }


}
