package mp.com.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DatosEIS")
public class DatosEIS implements Serializable {

    private static final long serialVersionUID = -7916999698936005419L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable=false, unique=true)
    private Long id;

    @Column
    private String periodo;
    @Column
    private String atm;
    @Column
    private String emisor;
    @Column
    private String transaccion;
    @Column
    private String autorizador;
    @Column
    private String aprobadas;
    @Column
    private String rechazadasFacturables;
    @Column
    private String otrasRechazadas;
    @Column
    private String campo9;
    @Column
    private String campo10;

    public DatosEIS(String periodo, String atm, String emisor,
                    String transaccion, String autorizador, String aprobadas,
                    String rechazadasFacturables, String otrasRechazadas,
                    String campo9, String campo10) {
        super();
        this.periodo = periodo;
        this.atm = atm;
        this.emisor = emisor;
        this.transaccion = transaccion;
        this.autorizador = autorizador;
        this.aprobadas = aprobadas;
        this.rechazadasFacturables = rechazadasFacturables;
        this.otrasRechazadas = otrasRechazadas;
        this.campo9 = campo9;
        this.campo10 = campo10;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getAtm() {
        return atm;
    }

    public void setAtm(String atm) {
        this.atm = atm;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public String getAutorizador() {
        return autorizador;
    }

    public void setAutorizador(String autorizador) {
        this.autorizador = autorizador;
    }

    public String getAprobadas() {
        return aprobadas;
    }

    public void setAprobadas(String aprobadas) {
        this.aprobadas = aprobadas;
    }

    public String getRechazadasFacturables() {
        return rechazadasFacturables;
    }

    public void setRechazadasFacturables(String rechazadasFacturables) {
        this.rechazadasFacturables = rechazadasFacturables;
    }

    public String getOtrasRechazadas() {
        return otrasRechazadas;
    }

    public void setOtrasRechazadas(String otrasRechazadas) {
        this.otrasRechazadas = otrasRechazadas;
    }

    public String getCampo9() {
        return campo9;
    }

    public void setCampo9(String campo9) {
        this.campo9 = campo9;
    }

    public String getCampo10() {
        return campo10;
    }

    public void setCampo10(String campo10) {
        this.campo10 = campo10;
    }

}

