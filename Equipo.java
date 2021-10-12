public class Equipo {

        private String nombreEquipo;
        private int division;
        private String nombreEntrenador;
        private String torneosParticipacion;
        private int torneosGanados;
        private int torneosPerdidos;
        Jugador jugador [] = new Jugador[10];

        public Equipo (String nombreEquipo,int division, String nombreEntrenador,String torneosParticipacion, int torneosGanados, int torneosPerdidos,Jugador[] jugador){

            setJugador(jugador);
            setNombreEquipo(nombreEquipo);
            setDivision(division);
            setNombreEntrenador(nombreEntrenador);
            setTorneosParticipacion(torneosParticipacion);
            setTorneosGanados(torneosGanados);
            setTorneosPerdidos(torneosPerdidos);
        }

    public Equipo(Jugador[] jugador) {
        this.jugador = jugador;
    }

    public Jugador[] getJugador() {
        return jugador;
    }

    public void setJugador(Jugador[] jugador) {
        this.jugador = jugador;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getTorneosParticipacion() {
        return torneosParticipacion;
    }

    public void setTorneosParticipacion(String torneosParticipacion) {
        this.torneosParticipacion = torneosParticipacion;
    }

    public int getTorneosGanados() {
        return torneosGanados;
    }

    public void setTorneosGanados(int torneosGanados) {
        this.torneosGanados = torneosGanados;
    }

    public int getTorneosPerdidos() {
        return torneosPerdidos;
    }

    public void setTorneosPerdidos(int torneosPerdidos) {
        this.torneosPerdidos = torneosPerdidos;
    }

//Metodos

    public int sumarJugadoresE(){
        int suma=0;
        int a;
            for (int i = 0; i < jugador.length; i++) {
                a = jugador[i].getPuntosAnotados();
                suma += a;

            }
        return suma;
    }

    public int cantJugadores(){
            return jugador.length;
    }


}
