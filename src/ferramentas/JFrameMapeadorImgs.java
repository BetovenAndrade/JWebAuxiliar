/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JFrameMapeadorImgs.java
 *
 * Created on 19/03/2012, 00:07:17
 */
package ferramentas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Betoven
 */
public class JFrameMapeadorImgs extends javax.swing.JFrame {
    private static final String CIRCULO="circ";
    private static final String RETANGULO="rect";
    private static final String POLIGONO="poly";
    
    private String forma= CIRCULO;
    
    private int cordXinicial;
    private int cordYinicial;
    
    private int cordXfinal;
    private int cordYfinal;
    
    private String pathArqEscolhido="/imgs/2012_lamborghini_aventado_1.jpg";
    private String nomeImg="2012_lamborghini_aventado_1.jpg";
    Graphics g2d;
    
    private String mapInicio="<MAP id=\"\" name=\"nomeDoMapa\">\n";
    private String mapFinal="</MAP>";
    
    ArrayList pontosPoligono= new ArrayList();
    
        //Código usado para desenhar o polígono
        ArrayList<Integer> pontosXPoligono= new ArrayList<Integer>();
        ArrayList<Integer> pontosYPoligono= new ArrayList<Integer>();
        //Código usado para desenhar o polígono

    /** Creates new form JFrameMapeadorImgs */
    public JFrameMapeadorImgs() {
        initComponents();
        reconfigure();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFileChooserSelecImg = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabelConteiner = new javax.swing.JLabel();
        jButtonEscolherImg = new javax.swing.JButton();
        jButtonCirculo = new javax.swing.JButton();
        jButtonPolygon = new javax.swing.JButton();
        jButtonRetangulo = new javax.swing.JButton();
        jButtonCodigo = new javax.swing.JButton();
        jButtonLimparTudo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mapeador HTML de Imagens");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabelConteiner.setBackground(new java.awt.Color(153, 255, 153));
        jLabelConteiner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelConteiner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Background2.png"))); // NOI18N
        jLabelConteiner.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelConteiner.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelConteiner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelConteinerMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelConteinerMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelConteinerMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jLabelConteiner);

        jButtonEscolherImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/open_folder.png"))); // NOI18N
        jButtonEscolherImg.setToolTipText("<html><b>\nSelecione uma imagem<br>\npara mapear!\n</b>");
        jButtonEscolherImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEscolherImgActionPerformed(evt);
            }
        });

        jButtonCirculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dotted circle.png"))); // NOI18N
        jButtonCirculo.setToolTipText("<html><b>\nSelecione uma área circular:<br>\nClique no canto superior esquerdo<br>\nsegure e arraste até o canto inferior<br>\ndireito da área desejada.\n</b>");
        jButtonCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCirculoActionPerformed(evt);
            }
        });

        jButtonPolygon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/polygon.png"))); // NOI18N
        jButtonPolygon.setToolTipText("<html><b>\nSelecione uma área poligonal:<br>\nVá clicando nos pontos desejados.<br>\nO último ponto deve ser clicado com o<br>\n<s>botão direito</s> do mouse.\n</b>");
        jButtonPolygon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPolygonActionPerformed(evt);
            }
        });

        jButtonRetangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Rectangle.png"))); // NOI18N
        jButtonRetangulo.setToolTipText("<html><b>\nSelecione uma área retangular:<br>\nClique no canto superior esquerdo<br>\nsegure e arraste até o canto inferior<br>\ndireito da área desejada.\n</b>");
        jButtonRetangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetanguloActionPerformed(evt);
            }
        });

        jButtonCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/programmation.png"))); // NOI18N
        jButtonCodigo.setToolTipText("<html><b>\nCopie o código gerado\n</b>");
        jButtonCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCodigoActionPerformed(evt);
            }
        });

        jButtonLimparTudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/broom.png"))); // NOI18N
        jButtonLimparTudo.setToolTipText("<html><b>\nRetire todas as<br>\nmodificações\n</b>");
        jButtonLimparTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparTudoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEscolherImg)
                .addGap(33, 33, 33)
                .addComponent(jButtonCirculo)
                .addGap(18, 18, 18)
                .addComponent(jButtonRetangulo)
                .addGap(18, 18, 18)
                .addComponent(jButtonPolygon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jButtonLimparTudo)
                .addGap(18, 18, 18)
                .addComponent(jButtonCodigo)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(360, 360, 360)
                    .addComponent(jFileChooserSelecImg, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(361, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEscolherImg)
                    .addComponent(jButtonCodigo)
                    .addComponent(jButtonCirculo)
                    .addComponent(jButtonRetangulo)
                    .addComponent(jButtonPolygon)
                    .addComponent(jButtonLimparTudo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(242, 242, 242)
                    .addComponent(jFileChooserSelecImg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(242, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonEscolherImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEscolherImgActionPerformed
    try{
        jFileChooserSelecImg.setFileFilter(new MyFilter());
        jFileChooserSelecImg.showOpenDialog(this);
        File f= jFileChooserSelecImg.getSelectedFile();
        pathArqEscolhido= f.getAbsolutePath();
        nomeImg= f.getName();
        //JOptionPane.showMessageDialog(this,pathArqEscolhido);
         
               
        ImageIcon novaImg= new ImageIcon(f.toURL());
        jLabelConteiner.setIcon(novaImg);
        
        reconfigure();
        //mapInicio="<MAP id=\"\" name=\"#nomeDoMapa\">\n";
        //String mapFinal="</MAP>";
    }
    catch(NullPointerException e){
        
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e, "ERRO",JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_jButtonEscolherImgActionPerformed

private void jButtonCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCirculoActionPerformed
    forma= CIRCULO;
    desativeCirc();
}//GEN-LAST:event_jButtonCirculoActionPerformed

private void jButtonPolygonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPolygonActionPerformed
    forma= POLIGONO;
    desativePoly();
}//GEN-LAST:event_jButtonPolygonActionPerformed

private void jButtonRetanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetanguloActionPerformed
    forma= RETANGULO;
    desativeRect();
}//GEN-LAST:event_jButtonRetanguloActionPerformed

private void jLabelConteinerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConteinerMousePressed
    cordXinicial= evt.getX();
    cordYinicial= evt.getY();
    //System.out.println(cordXinicial+","+cordYinicial);
}//GEN-LAST:event_jLabelConteinerMousePressed

private void jLabelConteinerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConteinerMouseReleased
    cordXfinal= evt.getX();
    cordYfinal= evt.getY();
    //System.out.println(cordXfinal+","+cordYfinal);
        
     
    if(forma.equals(CIRCULO)){
        g2d= (Graphics2D) jLabelConteiner.getGraphics();
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.drawOval(cordXinicial, cordYinicial, Math.abs(cordXfinal-cordXinicial), Math.abs(cordXfinal-cordXinicial));
        String link= JOptionPane.showInputDialog("Digite o link");
        if(link!=null){
        int xCentral= (cordXfinal+cordXinicial)/2;
        int yCentral= (cordYfinal+cordYinicial)/2;
        int raio= Math.abs(xCentral-cordXinicial);
        mapInicio+="<AREA shape=\"circ\" coords=\""+(xCentral)+","+(yCentral)+","+(raio)+"\" href=\""+link+"\""+"/>\n";
        }
    }else
    if(forma.equals(RETANGULO)){
        g2d= (Graphics2D) jLabelConteiner.getGraphics();
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.drawRect(cordXinicial, cordYinicial, Math.abs(cordXfinal-cordXinicial), Math.abs(cordYfinal-cordYinicial));
        String link= JOptionPane.showInputDialog("Digite o link");
        if(link!=null){
        mapInicio+="<AREA shape=\"rect\" coords=\""+cordXinicial+","+cordYinicial+","+cordXfinal+","+cordYfinal+"\" href=\""+link+"\""+"/>\n";
        }
    }
       
}//GEN-LAST:event_jLabelConteinerMouseReleased

private void jButtonCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCodigoActionPerformed
    //JOptionPane.showMessageDialog(null,mapInicio+mapFinal);
    JFrameCodeMapHTML jfcmh= new JFrameCodeMapHTML();
    jfcmh.setVisible(true);
    
    String resultado="<IMG src=\""+nomeImg+"\" usemap=\"#nomeDoMapa\">\n"+mapInicio+mapFinal;
    
    jfcmh.jTextAreaCodigo.setText(resultado);
}//GEN-LAST:event_jButtonCodigoActionPerformed

private void jLabelConteinerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConteinerMouseClicked
    if(forma.equals(POLIGONO)){
        g2d= (Graphics2D) jLabelConteiner.getGraphics();
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.fillRect(evt.getX(), evt.getY(), 3, 3);
        
        String parCoord= evt.getX()+","+evt.getY()+",";
        pontosPoligono.add(parCoord);
        pontosXPoligono.add(evt.getX());
        pontosYPoligono.add(evt.getY());
        
        if(evt.getButton() == MouseEvent.BUTTON3){
            Object pontos[]= pontosPoligono.toArray();
            pontosPoligono.clear();
            
            //Código para desenhar o polígono
            int pXpoly[]= new int[pontosXPoligono.size()];
            int pYpoly[]= new int[pontosYPoligono.size()];
            
            
            for(int i=0; i<pXpoly.length; ++i){
                pXpoly[i]= pontosXPoligono.get(i);
                pYpoly[i]= pontosYPoligono.get(i);
                
            }
            g2d= (Graphics2D) jLabelConteiner.getGraphics();
            g2d.setColor(Color.LIGHT_GRAY);
            g2d.drawPolygon(new Polygon(pXpoly,pYpoly,pXpoly.length));
            pontosXPoligono.clear();
            pontosYPoligono.clear();
            //Fim do código para desenhar o polígono
            
            
            String resultado="";
            
            for(int i=0; i<pontos.length;++i){
               
                resultado+=pontos[i];
            }
            //tirando a última vírgula
            resultado= resultado.substring(0, resultado.length()-2);
            
            String link= JOptionPane.showInputDialog("Digite o link");
            if(link!=null){
            mapInicio+="<AREA shape=\"poly\" coords=\""+resultado+"\" href=\""+link+"\""+"/>\n";
            }
            
        }
    }
}//GEN-LAST:event_jLabelConteinerMouseClicked

private void jButtonLimparTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparTudoActionPerformed
    int op= JOptionPane.showConfirmDialog(this, "Tem certeza que deseja descartar\n o mapeamento atual? ", "Deseja descartar?", 2, JOptionPane.QUESTION_MESSAGE);
    if(op==0)
    reconfigure();
}//GEN-LAST:event_jButtonLimparTudoActionPerformed

private void desativeCirc(){
    jButtonCirculo.setEnabled(false);
    jButtonRetangulo.setEnabled(true);
    jButtonPolygon.setEnabled(true);
}

private void desativePoly(){
    jButtonCirculo.setEnabled(true);
    jButtonRetangulo.setEnabled(true);
    jButtonPolygon.setEnabled(false);
}

private void desativeRect(){
    jButtonCirculo.setEnabled(true);
    jButtonRetangulo.setEnabled(false);
    jButtonPolygon.setEnabled(true);
}

//restaura a inicialização de variáveis, etc.
private void reconfigure(){
    mapInicio="<MAP id=\"\" name=\"nomeDoMapa\">\n";
    mapFinal="</MAP>";
    
    forma= CIRCULO;
    desativeCirc();
    
    pontosPoligono.clear();
    pontosXPoligono.clear();
    pontosYPoligono.clear();
    repaint();
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameMapeadorImgs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMapeadorImgs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMapeadorImgs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMapeadorImgs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JFrameMapeadorImgs().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCirculo;
    private javax.swing.JButton jButtonCodigo;
    private javax.swing.JButton jButtonEscolherImg;
    private javax.swing.JButton jButtonLimparTudo;
    private javax.swing.JButton jButtonPolygon;
    private javax.swing.JButton jButtonRetangulo;
    private javax.swing.JFileChooser jFileChooserSelecImg;
    private javax.swing.JLabel jLabelConteiner;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    class MyFilter extends javax.swing.filechooser.FileFilter {
        
        @Override
            public boolean accept(File file) {
                String filename = file.getName();
                return filename.toUpperCase().endsWith(".PNG") ||
                       filename.toUpperCase().endsWith(".JPG")||
                       filename.toUpperCase().endsWith(".GIF") ||
                       file.isDirectory();
            }
        @Override
            public String getDescription() {
                return "*.png, *.jpg, *.gif";
            }
    }
}
