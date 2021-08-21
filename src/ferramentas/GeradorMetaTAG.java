package ferramentas;

/**
 *
 * @author Betoven
 */
public class GeradorMetaTAG {
    public String getMetaTAGs(String autor, String keywords, String descricao){
        
        String author="<META name=\"author\" content=\""+autor+"\"/>";
        String meta="<META name=\"description\" content=\""+descricao+"\"/>";
        String keys="<META name=\"keywords\" content=\""+keywords+"\"/>";
        String robots="<META name=\"robots\" content=\"index,follow\"/>";
        
        return author+"\n"+meta+"\n"+keys+"\n"+robots;
    }
}
