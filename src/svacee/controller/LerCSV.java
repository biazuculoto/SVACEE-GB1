
package svacee.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author Porca1 porca 2 Porca3
 * 
 */
public class LerCSV {
    
    public void run() {

        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ",";
        try {

            JFileChooser jfc = new JFileChooser();
            int retorno = jfc.showOpenDialog(null);
            if (retorno == JFileChooser.APPROVE_OPTION) {
                File arq = jfc.getSelectedFile();
                FileReader fr = new FileReader(arq);
                br = new BufferedReader(fr);
                while ((linha = br.readLine()) != null) {

                    String[] dados = linha.split(csvDivisor);

                    System.out.println("Nome: " + dados[0]
                            + " Valor:" + dados[1]);

                }
            } 

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


