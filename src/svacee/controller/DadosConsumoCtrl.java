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
    private int verificaArquivo = 1;
    private List<DadosConsumo> dados = new ArrayList<>();
    private List<String> listaPontosColeta = new ArrayList<>();
    private List<DadosConsumo> dataSet = new ArrayList<>();

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

            linhas = linha.split(";");

            for (String v : linhas) {

                colunas = v.split(",");

                dc = new DadosConsumo();

                dc.setDataHora(Timestamp.valueOf(colunas[0]));
                dc.setPontoColeta(colunas[1].replace("\"", ""));
                dc.setValorKwh(Float.parseFloat(colunas[2]));

                getDados().add(dc);
            }                      
        }
        setVerificaArquivo(2);
    }

    public void obterPontosColeta() {

        for (DadosConsumo dc : getDados()) {
            if (!listaPontosColeta.contains(dc.getPontoColeta())) {
                listaPontosColeta.add(dc.getPontoColeta());
            } else {                
            }
        }
    }

    public void dataSet(String item) {
        for (DadosConsumo dc : getDados()) {
            if (dc.getPontoColeta().equalsIgnoreCase(item)) {
                dc.getDataHora();
                dc.getValorKwh();

                dataSet.add(dc);
            }
        }
    }

    public File getArq() {
        return arq;
    }
    public void setArq(File arq) {
        this.arq = arq;
    }

    public DadosConsumo getDc() {
        return dc;
    }
    public void setDc(DadosConsumo dc) {
        this.dc = dc;
    }

    public List<DadosConsumo> getDados() {
        return dados;
    }
    public void setDados(List<DadosConsumo> dados) {
        this.dados = dados;
    }

    public List<String> getListaPontosColeta() {
        return listaPontosColeta;
    }
    public void setListaPontosColeta(List<String> listaPontosColeta) {
        this.listaPontosColeta = listaPontosColeta;
    }

    public List<DadosConsumo> getDataSet() {
        return dataSet;
    }
    public void setDataSet(List<DadosConsumo> dataSet) {
        this.dataSet = dataSet;
    }

    public int getVerificaArquivo() {
        return verificaArquivo;
    }
    public void setVerificaArquivo(int verificaArquivo) {
        this.verificaArquivo = verificaArquivo;
    }
}
