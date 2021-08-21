/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Betoven
 */
public class AbrirArquivo {
    
    public String abrir(String caminhoCompleto) throws FileNotFoundException{
        File arquivo= new File(caminhoCompleto);
        Scanner entrada= new Scanner(arquivo);
        
        String texto="";
        while(entrada.hasNext()){
            texto+= entrada.nextLine()+"\n";
        }
        
        return texto;
    }
    
}
