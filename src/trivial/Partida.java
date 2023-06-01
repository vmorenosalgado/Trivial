package trivial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Partida {
    private List<Pregunta> preguntas;

    public Partida() {

        preguntas = new ArrayList<>();

        Pregunta p1 = new Pregunta("La capital de Francia es París", true, 2);
        preguntas.add(p1);
        Pregunta p2 = new Pregunta("La capital de España es Madrid", true, 2);
        preguntas.add(p2);
        Pregunta p3 = new Pregunta("La capital de Inglaterra es Londres", false, 2);
        preguntas.add(p3);
        Pregunta p4 = new Pregunta("La capital de Andalucia es Sevilla", true, 2);
        preguntas.add(p4);
        Pregunta p5 = new Pregunta("La capital de Alemania es Munich", false, 2);
        preguntas.add(p5);

    }

    public void jugarPartida(){
        Scanner scanner = new Scanner(System.in);

        String respuesta;

        for (int i = 0; i < preguntas.size(); i++ ){

            Pregunta pregunta = preguntas.get(i);
            System.out.println(pregunta.getPregunta());

            do {
                System.out.println("Verdadero o falso (V/F)");
                respuesta = scanner.next().toUpperCase();

                if(!respuesta.equals("V") && !respuesta.equals("F"))
                    System.out.println("La opción es incorrecta. Escoja V o F");
                else {
                    validar(respuesta, pregunta.isRespuesta());
                }

            }while(respuesta);

        }



    }

    private void validar(String respuesta, boolean respuesta1) {
        if (respuesta.equals("V") && respuesta1) { //V -> false
            // recpuesta correcta
            System.out.println("Acierto");
        } else if (respuesta.equals("F") && !respuesta1) {
            // recpuesta correcta.
            System.out.println("Acierto");
        } else
            System.out.println("Fallo");
    }




}
