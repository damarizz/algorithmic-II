import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pelicula {
    protected int id;
    protected String tituloDistribucion;
    protected String tituloOriginal;
    protected String genero;
    protected String idiomaOriginal;
    protected boolean subtitulos;
    protected String pais;
    protected int añoProduccion;
    protected String sitioWeb;
    protected String duracion;
    protected String calificacion;
    protected Date fechaEstreno;
    protected String resumen;
    protected List<Staff> staff = new ArrayList<>();

    public Pelicula(int id, String tituloDistribucion, String tituloOriginal, String genero, String idiomaOriginal, boolean subtitulos, String pais, int añoProduccion, String sitioWeb, String duracion, String calificacion, Date fechaEstreno, String resumen) {
        this.id = id;
        this.tituloDistribucion = tituloDistribucion;
        this.tituloOriginal = tituloOriginal;
        this.genero = genero;
        this.idiomaOriginal = idiomaOriginal;
        this.subtitulos = subtitulos;
        this.pais = pais;
        this.añoProduccion = añoProduccion;
        this.sitioWeb = sitioWeb;
        this.duracion = duracion;
        this.calificacion = calificacion;
        this.fechaEstreno = fechaEstreno;
        this.resumen = resumen;
    }

    public int getId() {
        return id;
    }

    public String getTituloDistribucion() {
        return tituloDistribucion;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public String getGenero() {
        return genero;
    }

    public String getIdiomaOriginal() {
        return idiomaOriginal;
    }

    public boolean isSubtitulos() {
        return subtitulos;
    }

    public String getPais() {
        return pais;
    }

    public int getAñoProduccion() {
        return añoProduccion;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public String getResumen() {
        return resumen;
    }
}
