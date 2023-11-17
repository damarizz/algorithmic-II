public class Funcion {
    private String diaSemana;
    private String horaComienzo;
    String descuento = null;
    String descripcion = null;
    Pelicula pelicula;

    public Funcion (String diaSemana, String horaComienzo, Pelicula pelicula, String descuento, String descripcion) {
        this.pelicula = pelicula;
        this.diaSemana = diaSemana;
        this.horaComienzo = horaComienzo;
        this.descripcion = descripcion;
        this.descuento = descuento;
    }
    public Funcion(String diaSemana, String horaComienzo, Pelicula pelicula) {
        this.pelicula = pelicula;
        this.diaSemana = diaSemana;
        this.horaComienzo = horaComienzo;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getHoraComienzo() {
        return horaComienzo;
    }
}
