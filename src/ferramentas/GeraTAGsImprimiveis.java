/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

/**
 *
 * @author Betoven
 */
public class GeraTAGsImprimiveis {
    private int alinhamento;
    private String corImpares;
    private String corPares;
    
    public GeraTAGsImprimiveis()
    {
        alinhamento=0;
        corImpares="#CCDDCC";
        corPares="#FDFDFD";
    }
    
    public GeraTAGsImprimiveis(int alinhe, String impar, String par)
    {
        alinhamento= alinhe;
        corImpares=impar;
        corPares=par;
    }
    
    public String converterTAGs(String TAGs)
    {
        char array[]= TAGs.toCharArray();
        String texto[]= new String[array.length];
        String resultado="";
        //usado para fechar ou abrir os DIV a cada quebra de linha
        int divs=1;
        
        //Passando para um array de Strings
        for(int i=0; i<texto.length; ++i)
        {
            texto[i]= ""+array[i];
        }
        
        //Substituindo < e > por &lt; &gt;
        for(int i=0; i<texto.length; ++i)
        {
            if(texto[i].equals("<"))
            texto[i]= "&lt;";
            else
            if(texto[i].equals(">"))    
            texto[i]= "&gt;";
        }
        
        //Colocando os DIVs com CSS da cor por linha
        for(int j=0; j<texto.length; ++j)
        {
            if(texto[j].equals("\n") && divs==1){
                texto[j]= "</DIV>\n<DIV style=\"background-color:"+corPares+";\">\n";
                divs=2;
            }
            else
            if(texto[j].equals("\n") && divs==2){
                texto[j]= "</DIV>\n<DIV style=\"background-color:"+corImpares+";\">\n";
                divs=1;
            }
            resultado+= texto[j];
        }
        
        //add o alinhamento
        String alinhe="";
        
        if(alinhamento==0)
            alinhe=" text-align:center;";
        else
            if(alinhamento==1)
                alinhe=" text-align:left;";
        else
            if(alinhamento==2)    
                alinhe=" text-align:right;";
        
        return "<DIV style=\"background-color:"+corImpares+";"+alinhe+"\">\n"+
                "<DIV>"+resultado+"</DIV>\n"+
                "</DIV>";
    }
    
    public String converterTAGsemFormatacao(String TAGs){
        char array[]= TAGs.toCharArray();
        String texto[]= new String[array.length];
        String resultado="";
        
        //Passando para um array de Strings
        for(int i=0; i<texto.length; ++i)
        {
            texto[i]= ""+array[i];
        }
        
        //Substituindo < e > por &lt; &gt;
        for(int i=0; i<texto.length; ++i)
        {
            if(texto[i].equals("<"))
            texto[i]= "&lt;";
            else
            if(texto[i].equals(">"))    
            texto[i]= "&gt;";
            
           resultado+=texto[i]; 
        }
        
        
        return resultado;
    }
    
    public void corImpares(String cor)
    {
        corImpares= cor;
    }
    
    public void corPares(String cor)
    {
        corPares= cor;
    }
    
    public void alinhamento(int alinhe)
    {
        alinhamento= alinhe;
    }
    
}
