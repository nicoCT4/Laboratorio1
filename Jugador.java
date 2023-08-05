class Jugador {
    private String nombre;
    private int puntosTotales;
    private int puntosRonda;

    public Jugador(String nombre, int puntosTotales, int puntosRonda) {
        this.nombre = nombre;
        this.puntosTotales = puntosTotales;
        this.puntosRonda = puntosRonda;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(int puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    public int getPuntosRonda() {
        return puntosRonda;
    }

    public void setPuntosRonda(int puntosRonda) {
        this.puntosRonda = puntosRonda;
    }
}
