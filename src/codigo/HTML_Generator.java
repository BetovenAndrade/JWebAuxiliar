/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author Betoven
 */
public class HTML_Generator {
    private String htmlBasico="";
    
    public String getHTML5(){
         htmlBasico+=("<HTML lang=\"pt-br\">\n");
         htmlBasico+=("     <HEAD>\n");
         htmlBasico+=("         <META charset=\"utf-8\" />\n");
         htmlBasico+=("         <TITLE></TITLE>\n");
         htmlBasico+=("     </HEAD>\n\n");
         
         htmlBasico+=("     <BODY>\n\n");
         htmlBasico+=("     </BODY>\n");
         htmlBasico+=("</HTML>");
        return htmlBasico.toString();
    }
    
    public String getHTML(){
         htmlBasico+=("<HTML>\n");
         htmlBasico+=("     <HEAD>\n");
         htmlBasico+=("         <TITLE></TITLE>\n");
         htmlBasico+=("     </HEAD>\n\n");
         
         htmlBasico+=("     <BODY>\n\n");
         htmlBasico+=("     </BODY>\n");
         htmlBasico+=("</HTML>");
        return htmlBasico.toString();
    }
}
