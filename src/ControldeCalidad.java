import java.util.Date;

public class ControldeCalidad {
    //variables
    String id;
    Date fechaVencimiento;
    String eficiencia;
    String idLaboratorio;
    //metodo constructor

    public ControldeCalidad(String id, Date fechaVencimiento, String eficiencia, String idLaboratorio) {
        this.id = id;
        this.fechaVencimiento = fechaVencimiento;
        this.eficiencia = eficiencia;
        this.idLaboratorio = idLaboratorio;
    }
}
