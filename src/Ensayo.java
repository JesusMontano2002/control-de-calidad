import java.util.Date;

public class Ensayo {
    //variables
    String id;
    String codigoJefe;
    Double medidas;
    Date fecha;
    String idProducto;
    String idCalidad;
    //metodo contructor

    public Ensayo(String id, String codigoJefe, Double medidas, Date fecha, String idProducto, String idCalidad) {
        this.id = id;
        this.codigoJefe = codigoJefe;
        this.medidas = medidas;
        this.fecha = fecha;
        this.idProducto = idProducto;
        this.idCalidad = idCalidad;
    }
}
