/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Betoven
 */
public class GravarArquivo {
    public void grave(String textCodigo, String nomeArquivo){
	
		try{
		File arquivo= new File(nomeArquivo);
		FileWriter fw;
		BufferedWriter gravar;
			
		fw= new FileWriter(arquivo, false);
		gravar= new BufferedWriter(fw);
			
		gravar.write(textCodigo);
		gravar.flush();
		gravar.close();		
		}
		catch(Exception e){
	
		}
    }    
}
