
package configuracoes;

import arquivo.GravarArquivo;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import jwebauxilar.MainGui;

public class ConfigFont {
    public void gravarLayout(String nome, String cor, String tamanho, String estilo){
        
        //Fonte é 1,2,3
        //Cor é o valor correspondente
        //Estilo é 1,2,3,4
        //Tamanho é o valor correspondente
    
        GravarArquivo ga= new GravarArquivo();
        ga.grave(nome+":"+cor+":"+estilo+":"+tamanho, "configFont.txt");
    }
    
    public void configurar() throws FileNotFoundException{
        
        File arquivo= new File("configFont.txt");
        Scanner entrada= new Scanner(arquivo);
        String linha= entrada.nextLine();
        
        String nome="Monospaced";
        int estilo=Font.PLAIN;
        int tamanho;
        int cor;
        
        String dados[]= linha.split(":");
        
        if ("1".equals(dados[0]))
            nome="Monospaced";
        else
        if("2".equals(dados[0]))
            nome="Verdana";
        else
        if("3".equals(dados[0]))    
            nome="Arial";
        
        cor=Integer.parseInt(dados[1]);
        
        if("1".equals(dados[2]))
            estilo=Font.PLAIN;
        else
        if("2".equals(dados[2]))
            estilo=Font.ITALIC;
        else
        if("3".equals(dados[2]))
            estilo=Font.BOLD;
        else
        if("4".equals(dados[2]))
            estilo=Font.BOLD+Font.ITALIC;
        
        tamanho= Integer.parseInt(dados[3]);
        
        
        MainGui.jTextAreaMain.setFont(new Font(nome,estilo,tamanho));
        MainGui.jTextAreaMain.setForeground(new Color(cor));
    }
}
