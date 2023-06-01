package trivial;


import java.util.*;

public class Partida {
    private List<Pregunta>  preguntas;

    private Jugador jugador;



    public Partida() {

        preguntas = new ArrayList<>();
        jugador = new Jugador();

        Pregunta p1 = new Pregunta("¿La capital de Francia es París?", true, 2);
        preguntas.add(p1);

        Pregunta p2 = new Pregunta("¿La capital de España es Madrid?", true, 2);
        preguntas.add(p2);

        Pregunta p3 = new Pregunta("¿La capital de Inglaterra es Liverpool?", false, 2);
        preguntas.add(p3);

        Pregunta p4 = new Pregunta("¿La capital de Italia es Pisa?", false, 2);
        preguntas.add(p4);

        Pregunta p5 = new Pregunta("¿La capital de Alemania es Berlín?", true, 2);
        preguntas.add(p5);

        Collections.shuffle(preguntas);

    }

    public void jugarPartida(){
        Scanner scanner = new Scanner(System.in);

        String respuesta;

        solicitudDatosJugador();

        for (int i = 0; i < preguntas.size(); i++ ){

            Pregunta pregunta = preguntas.get(i);
            System.out.println(pregunta.getPregunta());

            do {
                System.out.println("Verdadero o falso (V/F)");
                respuesta = scanner.next().toUpperCase();

                if(!respuesta.equals("V") && !respuesta.equals("F"))
                    System.out.println("La opción es incorrecta. Escoja V o F");
                else {
                    validar(respuesta, pregunta);
                }

            }while(!respuesta.equals("V") && !respuesta.equals("F"));

        }

        estadistica();

    }

    private void validar(String respuesta, Pregunta pregunta) {
        if ("V".equals(respuesta) && pregunta.isRespuesta()) { //V ->
            // recpuesta correcta
            System.out.println("Acierto");
            jugador.setPuntuacion(jugador.getPuntuacion() + pregunta.getDificultad());
            jugador.setNumeroAciertos(jugador.getNumeroAciertos() + 1);
        } else if ("F".equals(respuesta) && !pregunta.isRespuesta()) {
            // recpuesta correcta.
            System.out.println("Acierto");
            jugador.setPuntuacion(jugador.getPuntuacion() + pregunta.getDificultad());
            jugador.setNumeroAciertos(jugador.getNumeroAciertos() + 1);
        } else {
            System.out.println("Fallo");
            jugador.setNumeroFallos(jugador.getNumeroFallos() + 1);
        }
    }

    private void estadistica(){
        System.out.println("Has acertado " + jugador.getNumeroAciertos() + " preguntas de " + preguntas.size());
        System.out.println("Has fallado " + jugador.getNumeroFallos());
        System.out.println("Tu puntuacion es " + jugador.getPuntuacion());

    }
    private void solicitudDatosJugador(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        jugador.setNombre(scanner.next());
        System.out.print("Introduce un usuario: ");
        jugador.setUsuario(scanner.next());
    }
}
