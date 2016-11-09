package svacee.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import svacee.model.DadosConsumo;

/**
 *
 * @author Bianca/ João D./ Vinicius
 *
 */
public class DadosConsumoCtrl {

    DadosConsumo dc = new DadosConsumo();
    private File arq;
    private String[] dados;
    private String vetor1[]= new String[2];
    private String vetor2[]= new String[2];
    

    public DadosConsumoCtrl() {

    }

    public void obterCsv(File arq) throws FileNotFoundException, IOException {
        setArq(arq);
        String linha = "";
        

        BufferedReader br = null;
        FileReader fr = new FileReader(arq);
        
        br = new BufferedReader(fr);
        
        
        while ((linha = br.readLine()) != null) {

            dados = linha.split(",");
            
            
                                  
        }
    }

    public void exibirTabela() {

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
     * @return the matriz
     */
    

    /**
     * @return the vetor1
     */
    public String[] getVetor1() {
        return vetor1;
    }
    public void setVetor1(String[] vetor1) {
        this.vetor1 = vetor1;
    }

    /**
     * @return the vetor2
     */
    public String[] getVetor2() {
        return vetor2;
    }

    /**
     * @param vetor2 the vetor2 to set
     */
    public void setVetor2(String[] vetor2) {
        this.vetor2 = vetor2;
    }

    /**
     * @return the dados
     */
    public String[] getDados() {
        return dados;
    }

    /**
     * @param dados the dados to set
     */
    public void setDados(String[] dados) {
        this.dados = dados;
    }

}
