package svacee.controller;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import svacee.model.DadosConsumo;

/**
 *
 * @author Bianca/ João D./ Vinicius
 *
 */
public class DadosConsumoCtrl {

    private DadosConsumo dc = new DadosConsumo();
    private File arq;
    private List<DadosConsumo> dados = new ArrayList<>();
    

    public DadosConsumoCtrl() {

    }

    public void obterCsv(File arq) throws FileNotFoundException, IOException {
        setArq(arq);
        String linha = "";
        String[] linhas;
        String[] colunas;

        BufferedReader br = null;
        FileReader fr = new FileReader(arq);
        
        br = new BufferedReader(fr);
        
        DadosConsumo dc;
        
        while ((linha = br.readLine()) != null) {

            linhas = linha.split(",");
            
            for(String v:linhas){
                
                colunas = v.split(";");
                
                dc = new DadosConsumo();
                
                dc.setDataHora(Timestamp.valueOf(colunas[0]));
                dc.setPontoColeta(colunas[1]);
                dc.setValorKwh(Float.parseFloat(colunas[2]));
                
                getDados().add(dc);
            }                       
        }
    }

    /**
     * @return the arq
     */
    public File getArq() {
        return arq;
    }

    /**
     * @param arq the arq to set
     */
    public void setArq(File arq) {
        this.arq = arq;
    }

    /**
     * @return the dc
     */
    public DadosConsumo getDc() {
        return dc;
    }

    /**
     * @param dc the dc to set
     */
    public void setDc(DadosConsumo dc) {
        this.dc = dc;
    }

    /**
     * @return the dados
     */
    public List<DadosConsumo> getDados() {
        return dados;
    }

    /**
     * @param dados the dados to set
     */
    public void setDados(List<DadosConsumo> dados) {
        this.dados = dados;
    }
}
