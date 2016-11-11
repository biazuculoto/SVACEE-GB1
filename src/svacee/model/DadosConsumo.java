package svacee.model;

import java.sql.Timestamp;

/**
 *
 * @author Bianca/ João D./ Vinicius
 */
public class DadosConsumo {

    private Timestamp dataHora;
    private String pontoColeta;
    private float valorKwh;

    public DadosConsumo() {

    }

    /**
     * @return the dataHora
     */
    public Timestamp getDataHora() {
        return dataHora;
    }

    /**
     * @param dataHora the dataHora to set
     */
    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }

    /**
     * @return the pontoColeta
     */
    public String getPontoColeta() {
        return pontoColeta;
    }

    /**
     * @param pontoColeta the pontoColeta to set
     */
    public void setPontoColeta(String pontoColeta) {
        this.pontoColeta = pontoColeta;
    }

    /**
     * @return the valorKwh
     */
    public float getValorKwh() {
        return valorKwh;
    }

    /**
     * @param valorKwh the valorKwh to set
     */
    public void setValorKwh(float valorKwh) {
        this.valorKwh = valorKwh;
    }

}
