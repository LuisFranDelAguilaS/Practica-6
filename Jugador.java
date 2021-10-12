public class Jugador {

    private int numeroUniforme;
    private String nombre;
    private int puntosAnotados;
    private String posicion;
    private float estatura;

    public Jugador (int numeroUniforme, String nombre,int puntosAnotados, String posicion, float estatura){

        setNumeroUniforme(numeroUniforme);
        setNombre(nombre);
        setPuntosAnotados(puntosAnotados);
        setPosicion(posicion);
        setEstatura(estatura);

    }

    public int getNumeroUniforme() {
        return numeroUniforme;
    }

    public void setNumeroUniforme(int numeroUniforme) {
        this.numeroUniforme = numeroUniforme;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosAnotados() {
        return puntosAnotados;
    }

    public void setPuntosAnotados(int puntosAnotados) {
        this.puntosAnotados = puntosAnotados;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
}
