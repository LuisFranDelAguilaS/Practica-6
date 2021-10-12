public class Torneo {

    private String nombreTorneo;
    private String region;
    private int cantidadEquipos;
    private int partidosJugados;
    private int partidosPendientes;
    Equipo equipo[] = new Equipo[5];

    public Torneo(String nombreTorneo,String region,int cantidadEquipos, int partidosJugados,int partidosPendientes,Equipo[] equipo){
        setEquipo(equipo);
        setRegion(region);
        setNombreTorneo(nombreTorneo);
        setCantidadEquipos(cantidadEquipos);
        setPartidosJugados(partidosJugados);
        setPartidosPendientes(partidosPendientes);
    }

    public Equipo[] getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo[] equipo) {
        this.equipo = equipo;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getCantidadEquipos() {
        return cantidadEquipos;
    }

    public void setCantidadEquipos(int cantidadEquipos) {
        this.cantidadEquipos = cantidadEquipos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosPendientes() {
        return partidosPendientes;
    }

    public void setPartidosPendientes(int partidosPendientes) {
        this.partidosPendientes = partidosPendientes;
    }

}
