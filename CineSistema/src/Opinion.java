public class Opinion {
    private int id;
    private String nombrePersona;
    private int edad;
    private String fecha;
    private String calificacion;
    private String comentario;

    public Opinion(int id, String nombrePersona, int edad, String fecha, String calificacion, String comentario) {
        this.id = id;
        this.nombrePersona = nombrePersona;
        this.edad = edad;
        this.fecha = fecha;
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    public int getId() {
        return id;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public int getEdad() {
        return edad;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public String getComentario() {
        return comentario;
    }
}
