public class ClaseInicial {

    public static void main(String[] args) {
        Jugador jug[] = new Jugador[10];
        Equipo equip[] = new Equipo[5];


          for (int i = 0; i < equip.length; i++) {
              System.out.println("Equipo "+(i+1));
                for (int j = 0; j < jug.length; j++) {
                    System.out.println("Jugador "+(j+1));
                  jug[j] = new Jugador(CapturaEntrada.capturarEntero("Introduce numero de uniforme "), CapturaEntrada.capturarCadena("Introduce nombre "), CapturaEntrada.capturarEntero("Introduce puntos anotados "), CapturaEntrada.capturarCadena("Introduce posicion "), CapturaEntrada.capturarFlotante("Introduce Estatura "));
                 }
                    System.out.println("\n");
                    equip[i] = new Equipo(CapturaEntrada.capturarCadena("Introduce nombre de Equipo "+(i+1)), CapturaEntrada.capturarEntero("En que division se encuentra 1 o 2 "+(i+1)), CapturaEntrada.capturarCadena("Introduce nombre del entrenador "+(i+1)), CapturaEntrada.capturarCadena("Introduce torneos participacion "+(i+1)), CapturaEntrada.capturarEntero("Cantidad de torneos ganados "+(i+1)), CapturaEntrada.capturarEntero("Cantidad de torneos perdidos "+(i+1)), jug);
          }

            Torneo torneo = new Torneo(CapturaEntrada.capturarCadena("Nombre de torneo"),CapturaEntrada.capturarCadena("Region"),CapturaEntrada.capturarEntero("Cantidad de equipos"), CapturaEntrada.capturarEntero("Cantidad de partidos jugados"),CapturaEntrada.capturarEntero("Cantidad de partidos pendientes"),equip);


        for (int i = 0; i < equip.length; i++) {
            System.out.println("Equipo "+(i+1));
            System.out.println("El nombre del equipo es: "+equip[i].getNombreEquipo());
            System.out.println("La division es: "+equip[i].getDivision());
            for (int j = 0; j < jug.length; j++) {
                System.out.println("Jugador "+(j+1));
                System.out.println("Numero de uniforme: "+jug[j].getNumeroUniforme());
                System.out.println("Nombre: "+jug[j].getNombre());
            }
        }

            System.out.println("Nombre de torneo: "+torneo.getNombreTorneo());
            System.out.println("Region: "+torneo.getRegion());
            int opcion=CapturaEntrada.capturarEntero("De que equipo quieres saber la cantidad? (dar el valor de el arreglo )");
                System.out.println(equip[opcion].cantJugadores());
            System.out.println("Partidos jugados: "+torneo.getPartidosJugados());
            System.out.println("Partidos pendientes: "+torneo.getPartidosPendientes());
            opcion=CapturaEntrada.capturarEntero("De que equipo quiere saber el puntaje?(dar el valor de el arreglo )");
            System.out.println(equip[opcion].sumarJugadoresE());


    }

}
