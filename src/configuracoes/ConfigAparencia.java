package configuracoes;

import arquivo.GravarArquivo;
import java.awt.Window;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import jwebauxilar.MainGui;

public class ConfigAparencia {
    
    public void gravarLayout(int i){
        String lookFeel="";
        
        if(i==1)
            lookFeel="javax.swing.plaf.metal.MetalLookAndFeel";
        else if(i==2)
            lookFeel="com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
        else if(i==3)
            lookFeel="com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        else if(i==4)
            lookFeel="com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
        
        GravarArquivo ga= new GravarArquivo();
        ga.grave(lookFeel, "configLook.txt");
    }
    
    public String retorneLook() throws FileNotFoundException{
        File arquivo= new File("configLook.txt");
        Scanner entrada= new Scanner(arquivo);
        String linha= entrada.nextLine();
        
       return linha;
    }
}
