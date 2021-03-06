/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainGui.java
 *
 * Created on 07/02/2012, 21:39:31
 */
package jwebauxilar;

import arquivo.AbrirArquivo;
import arquivo.GravarArquivo;
import codigo.HTML_Generator;
import codigo.JFrameCSS_Generator;
import configuracoes.JFrameFont;
import ferramentas.JFrameGeradorFavicon;
import ferramentas.JFrameGeradorMetaTAG;
import ferramentas.JFrameSeletorCores;
import ferramentas.JFrameTAGsImprimiveis;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import com.sun.java.swing.*;
import configuracoes.ConfigAparencia;
import configuracoes.ConfigFont;
import ferramentas.JFrameMapeadorImgs;
import ferramentas.JFrameTestaCor;
import sobre.JFrameAjuda;
import sobre.JFrameContate;


/**
 *
 * @author Betoven
 */
public class MainGui extends javax.swing.JFrame {

    /** Creates new form MainGui */
    public MainGui() {
        initComponents();
        this.setVisible(true);
        configuracoesSalvas();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMain = new javax.swing.JTextArea();
        jFileChooserSalvar = new javax.swing.JFileChooser();
        jFileChooserOpenHTMLouCSS = new javax.swing.JFileChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemAbrir = new javax.swing.JMenuItem();
        jMenuItemSalvarComo = new javax.swing.JMenuItem();
        jMenuCopiar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuCodigo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemHtml5 = new javax.swing.JMenuItem();
        jMenuItemCss = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemCriaCor = new javax.swing.JMenuItem();
        jMenuItemTestadorCor = new javax.swing.JMenuItem();
        jMenuItemGeraMeta = new javax.swing.JMenuItem();
        jMenuItemGeraIcon = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItemMapeador = new javax.swing.JMenuItem();
        jMenuConfig = new javax.swing.JMenu();
        jMenuItemFonte = new javax.swing.JMenuItem();
        jMenuItemQuebraLinha = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItemOjetivo = new javax.swing.JMenuItem();
        jMenuItemCreditos = new javax.swing.JMenuItem();
        jMenuItemAjuda = new javax.swing.JMenuItem();
        jMenuItemContate = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JWebAuxiliar");

        jTextAreaMain.setColumns(20);
        jTextAreaMain.setFont(new java.awt.Font("Monospaced", 0, 18));
        jTextAreaMain.setForeground(new java.awt.Color(51, 51, 255));
        jTextAreaMain.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMain);

        jScrollPane2.setViewportView(jScrollPane1);

        jMenuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/disc.png"))); // NOI18N
        jMenuArquivo.setMnemonic('A');
        jMenuArquivo.setText("Arquivo");
        jMenuArquivo.setFont(new java.awt.Font("Segoe UI", 0, 18));

        jMenuItemAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAbrir.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItemAbrir.setText("Abrir");
        jMenuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemAbrir);

        jMenuItemSalvarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSalvarComo.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItemSalvarComo.setText("Salvar Como");
        jMenuItemSalvarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalvarComoActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSalvarComo);

        jMenuCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMenuCopiar.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuCopiar.setText("Copiar Tudo");
        jMenuCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCopiarActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuCopiar);
        jMenuArquivo.add(jSeparator2);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemSair.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSair);

        jMenuBar1.add(jMenuArquivo);

        jMenuCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/programmation.png"))); // NOI18N
        jMenuCodigo.setMnemonic('C');
        jMenuCodigo.setText("C??digo");
        jMenuCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCodigoActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItem1.setText("Inserir HTML B??sico");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCodigo.add(jMenuItem1);

        jMenuItemHtml5.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItemHtml5.setText("Inserir HTML 5 B??sico");
        jMenuItemHtml5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHtml5ActionPerformed(evt);
            }
        });
        jMenuCodigo.add(jMenuItemHtml5);

        jMenuItemCss.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItemCss.setText("Inserir CSS B??sico");
        jMenuItemCss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCssActionPerformed(evt);
            }
        });
        jMenuCodigo.add(jMenuItemCss);

        jMenuBar1.add(jMenuCodigo);

        jMenuFerramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/confer.png"))); // NOI18N
        jMenuFerramentas.setMnemonic('f');
        jMenuFerramentas.setText("Ferramentas");
        jMenuFerramentas.setFont(new java.awt.Font("Segoe UI", 0, 18));

        jMenuItemCriaCor.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItemCriaCor.setText("Seletor de Cores");
        jMenuItemCriaCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCriaCorActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemCriaCor);

        jMenuItemTestadorCor.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItemTestadorCor.setText("Testador de Cores");
        jMenuItemTestadorCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTestadorCorActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTestadorCor);

        jMenuItemGeraMeta.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItemGeraMeta.setText("Gerador de Meta TAGs");
        jMenuItemGeraMeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGeraMetaActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemGeraMeta);

        jMenuItemGeraIcon.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItemGeraIcon.setText("Gerador de Favicon");
        jMenuItemGeraIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGeraIconActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemGeraIcon);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItem2.setText("Gerador de TAGs imprim??veis");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItem2);

        jMenuItemMapeador.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItemMapeador.setText("Mapeador HTML de Imagens");
        jMenuItemMapeador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMapeadorActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemMapeador);

        jMenuBar1.add(jMenuFerramentas);

        jMenuConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/astuces.png"))); // NOI18N
        jMenuConfig.setMnemonic('O');
        jMenuConfig.setText("Configura????es");
        jMenuConfig.setFont(new java.awt.Font("Segoe UI", 0, 18));

        jMenuItemFonte.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItemFonte.setText("Fonte");
        jMenuItemFonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFonteActionPerformed(evt);
            }
        });
        jMenuConfig.add(jMenuItemFonte);

        jMenuItemQuebraLinha.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItemQuebraLinha.setText("Quebra Linha");
        jMenuItemQuebraLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuebraLinhaActionPerformed(evt);
            }
        });
        jMenuConfig.add(jMenuItemQuebraLinha);
        jMenuConfig.add(jSeparator1);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItem3.setText("Apar??ncia Metal");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuConfig.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItem4.setText("Apar??ncia Windows Classic");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuConfig.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItem5.setText("Apar??ncia Windows");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuConfig.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItem6.setText("Apar??ncia Nimbus");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenuConfig.add(jMenuItem6);

        jMenuBar1.add(jMenuConfig);

        jMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/card.png"))); // NOI18N
        jMenuSobre.setMnemonic('S');
        jMenuSobre.setText("Sobre");
        jMenuSobre.setFont(new java.awt.Font("Segoe UI", 0, 18));

        jMenuItemOjetivo.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItemOjetivo.setText("Objetivo");
        jMenuItemOjetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOjetivoActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItemOjetivo);

        jMenuItemCreditos.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItemCreditos.setText("Cr??ditos");
        jMenuItemCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCreditosActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItemCreditos);

        jMenuItemAjuda.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItemAjuda.setText("Ajuda");
        jMenuItemAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAjudaActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItemAjuda);

        jMenuItemContate.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jMenuItemContate.setText("Contate");
        jMenuItemContate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemContateActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItemContate);

        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jMenuCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCodigoActionPerformed
    
}//GEN-LAST:event_jMenuCodigoActionPerformed

private void jMenuItemHtml5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHtml5ActionPerformed
    /*HTML_Generator h= new HTML_Generator();
    jTextAreaMain.setText(h.getHTML5());*/
    
    if(!jTextAreaMain.getText().isEmpty()){
        int cond= JOptionPane.showConfirmDialog(this, "Deseja substituir o texto existente?", "ATEN????O", 2, JOptionPane.QUESTION_MESSAGE);
        if(cond==0){
            HTML_Generator h= new HTML_Generator();
            jTextAreaMain.setText(h.getHTML5());
        }
    }
    else{
        HTML_Generator h= new HTML_Generator();
        jTextAreaMain.setText(h.getHTML5());
    }
}//GEN-LAST:event_jMenuItemHtml5ActionPerformed

private void jMenuItemFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFonteActionPerformed
    JFrameFont x= new JFrameFont();
    x.setVisible(true);
}//GEN-LAST:event_jMenuItemFonteActionPerformed

private void jMenuItemSalvarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalvarComoActionPerformed
    try{
    
            jFileChooserSalvar.showSaveDialog(this);
            File f= jFileChooserSalvar.getSelectedFile();
            
            
            //Definindo a extens??o
            String extensao=(jTextAreaMain.getText().contains("</HTML>")||jTextAreaMain.getText().contains("</html>"))? ".html" : ".css";  
            
            File novo= new File(f.getAbsolutePath()+extensao);
            
            if (!novo.getAbsoluteFile().exists()){
                String path= f.getAbsolutePath()+extensao;
                
                GravarArquivo gravar= new GravarArquivo();
                gravar.grave(jTextAreaMain.getText(), path);
                JOptionPane.showMessageDialog(this,"Gravado com Sucesso!","Gravado",JOptionPane.PLAIN_MESSAGE);
            }
            else
            {
                int opcao= JOptionPane.showConfirmDialog(this, "J?? existe um arquivo com mesmo nome \n"+ 
                                                    "no diret??rio especificado. \n"+
                                                    "\nDeseja Substituir?", "ADVERT??NCIA", 2, JOptionPane.WARNING_MESSAGE);
                
                if(opcao==0){
                String path= f.getAbsolutePath()+extensao;
                
                GravarArquivo gravar= new GravarArquivo();
                gravar.grave(jTextAreaMain.getText(), path);
                JOptionPane.showMessageDialog(this,"Gravado com Sucesso!","Gravado",JOptionPane.PLAIN_MESSAGE);
                }
                    
            }
    }
    catch(NullPointerException e){
        
    }
    catch(Exception e){
       JOptionPane.showMessageDialog(this,""+e,"ERRO!",JOptionPane.ERROR_MESSAGE); 
    }
}//GEN-LAST:event_jMenuItemSalvarComoActionPerformed

private void jMenuItemCssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCssActionPerformed
    //JFrameCSS_Generator css= new JFrameCSS_Generator();
    //css.setVisible(true);
    
    if(!jTextAreaMain.getText().isEmpty()){
        int cond= JOptionPane.showConfirmDialog(this, "Deseja substituir o texto existente?", "ATEN????O", 2, JOptionPane.QUESTION_MESSAGE);
        if(cond==0){
            JFrameCSS_Generator css= new JFrameCSS_Generator();
            css.setVisible(true);
        }
    }
    else{
            JFrameCSS_Generator css= new JFrameCSS_Generator();
            css.setVisible(true);
    }
}//GEN-LAST:event_jMenuItemCssActionPerformed

private void jMenuItemCriaCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCriaCorActionPerformed
    JFrameSeletorCores jfsc= new JFrameSeletorCores();
    jfsc.setVisible(true);
}//GEN-LAST:event_jMenuItemCriaCorActionPerformed

private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
    int x= JOptionPane.showConfirmDialog(this, "Tem certeza que deseja sair?", "Confirma????o de Sa??da!", 2);
    if(x==0)
    System.exit(0);
}//GEN-LAST:event_jMenuItemSairActionPerformed

private void jMenuItemGeraMetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGeraMetaActionPerformed
    JFrameGeradorMetaTAG g= new JFrameGeradorMetaTAG();
    g.setVisible(true);
}//GEN-LAST:event_jMenuItemGeraMetaActionPerformed

private void jMenuItemQuebraLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuebraLinhaActionPerformed
    if(jMenuItemQuebraLinha.getText().equals("Quebra Linha")){
        jMenuItemQuebraLinha.setText("-Quebra Linha");
        jTextAreaMain.setLineWrap(true);
    }
    else
    if(jMenuItemQuebraLinha.getText().equals("-Quebra Linha")){
        jMenuItemQuebraLinha.setText("Quebra Linha");
        jTextAreaMain.setLineWrap(false);
    }    
}//GEN-LAST:event_jMenuItemQuebraLinhaActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    if(!jTextAreaMain.getText().isEmpty()){
        int cond= JOptionPane.showConfirmDialog(this, "Deseja substituir o texto existente?", "ATEN????O", 2, JOptionPane.QUESTION_MESSAGE);
        if(cond==0){
            HTML_Generator h= new HTML_Generator();
            jTextAreaMain.setText(h.getHTML());
        }
    }
    else{
        HTML_Generator h= new HTML_Generator();
        jTextAreaMain.setText(h.getHTML());
    }
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItemGeraIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGeraIconActionPerformed
    JFrameGeradorFavicon jfgf= new JFrameGeradorFavicon();
    jfgf.setVisible(true);
}//GEN-LAST:event_jMenuItemGeraIconActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    JFrameTAGsImprimiveis jftp= new JFrameTAGsImprimiveis();
    jftp.setVisible(true);
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    try{
        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        SwingUtilities.updateComponentTreeUI(this);
        
        ConfigAparencia ca= new ConfigAparencia();
        ca.gravarLayout(1);
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, "ERRO: "+e);
    }
}//GEN-LAST:event_jMenuItem3ActionPerformed

private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    try{
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        SwingUtilities.updateComponentTreeUI(this);
        
        ConfigAparencia ca= new ConfigAparencia();
        ca.gravarLayout(2);
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, "ERRO: "+e);
    }
}//GEN-LAST:event_jMenuItem4ActionPerformed

private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    try{
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        SwingUtilities.updateComponentTreeUI(this);
        
        ConfigAparencia ca= new ConfigAparencia();
        ca.gravarLayout(3);
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, "ERRO: "+e);
    }
}//GEN-LAST:event_jMenuItem5ActionPerformed

private void atualizarAparencia(String lookAndFeel){
    try{
        UIManager.setLookAndFeel(lookAndFeel);
        SwingUtilities.updateComponentTreeUI(this);
        
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, "ERRO: "+e);
    }
}

private void configuracoesSalvas(){
    File f= new File("configFont.txt");
        if(f.exists()){
            ConfigFont cf= new ConfigFont();
            try {
                cf.configurar();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        File f2= new File("configLook.txt");
        if(f2.exists()){
            ConfigAparencia ca= new ConfigAparencia();
            try {
                this.atualizarAparencia(ca.retorneLook());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}

private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    try{
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        SwingUtilities.updateComponentTreeUI(this);
        
        ConfigAparencia ca= new ConfigAparencia();
        ca.gravarLayout(4);
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, "ERRO: "+e);
    }
}//GEN-LAST:event_jMenuItem6ActionPerformed

private void jMenuCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCopiarActionPerformed
    jTextAreaMain.selectAll();
    jTextAreaMain.copy();
}//GEN-LAST:event_jMenuCopiarActionPerformed

private void jMenuItemTestadorCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTestadorCorActionPerformed
    JFrameTestaCor jftc= new JFrameTestaCor();
    jftc.setVisible(true);
}//GEN-LAST:event_jMenuItemTestadorCorActionPerformed

private void jMenuItemOjetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOjetivoActionPerformed
    ImageIcon icone= new javax.swing.ImageIcon(getClass().getResource("/imgs/Objetivo_1.png"));
    
    JOptionPane.showMessageDialog(this, "Este aplicativo foi desenvolvido com o objetivo\n"+
                                        "de auxiliar aprendizes em desenvolvimento WEB que\n"+
                                        "est??o come??ando a trabalhar com HTML e CSS\n\n"+
                                        "O intuito ?? reduzir o tempo gasto pelo estudante\n"+
                                        "em tarefas repetitivas para que possa aplicar\n"+
                                        "esse tempo no aprofundamento dos estudos",
            "Objetivo", JOptionPane.INFORMATION_MESSAGE, icone);
}//GEN-LAST:event_jMenuItemOjetivoActionPerformed

private void jMenuItemCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCreditosActionPerformed
    ImageIcon icone= new javax.swing.ImageIcon(getClass().getResource("/imgs/card.png"));
    
    JOptionPane.showMessageDialog(this, "Desenvolvido por Betoven Oliveira de Andrade\n"+
                                        "formando em Licenciatura Plena em Computa????o pela\n"+
                                        "Universidade Estadual da Para??ba",
            "Cr??ditos", JOptionPane.INFORMATION_MESSAGE, icone);
}//GEN-LAST:event_jMenuItemCreditosActionPerformed

private void jMenuItemContateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemContateActionPerformed
    JFrameContate jfc= new JFrameContate();
    jfc.setVisible(true);
}//GEN-LAST:event_jMenuItemContateActionPerformed

private void jMenuItemMapeadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMapeadorActionPerformed
    JFrameMapeadorImgs jfmi= new JFrameMapeadorImgs();
    jfmi.setVisible(true);
}//GEN-LAST:event_jMenuItemMapeadorActionPerformed

private void jMenuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirActionPerformed
    //jFileChooserOpen
    try{
        if(!jTextAreaMain.getText().isEmpty()){
            
            jFileChooserOpenHTMLouCSS.setFileFilter(new FilterHTMLouCSS());
            jFileChooserOpenHTMLouCSS.showOpenDialog(this);
        
            File f= jFileChooserOpenHTMLouCSS.getSelectedFile();
            String arqHTMLCSSescolhido= f.getAbsolutePath();
            
            int opcao=
            JOptionPane.showConfirmDialog(this, "Deseja Substituir o texto existente?", "ATEN????O!", 2, JOptionPane.QUESTION_MESSAGE);
        
                if(opcao==0){
                AbrirArquivo aa= new AbrirArquivo();
                jTextAreaMain.setText(aa.abrir(arqHTMLCSSescolhido));
                }
        }
        else
        {
            jFileChooserOpenHTMLouCSS.setFileFilter(new FilterHTMLouCSS());
            jFileChooserOpenHTMLouCSS.showOpenDialog(this);
        
            File f= jFileChooserOpenHTMLouCSS.getSelectedFile();
            String arqHTMLCSSescolhido= f.getAbsolutePath();
        
            AbrirArquivo aa= new AbrirArquivo();
            jTextAreaMain.setText(aa.abrir(arqHTMLCSSescolhido));
        }
           
    }
    catch(NullPointerException e){
        
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, ""+e, "ERRO",JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_jMenuItemAbrirActionPerformed

private void jMenuItemAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjudaActionPerformed
    JFrameAjuda jfa= new JFrameAjuda();
    jfa.setVisible(true);    
}//GEN-LAST:event_jMenuItemAjudaActionPerformed

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
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooserOpenHTMLouCSS;
    private javax.swing.JFileChooser jFileChooserSalvar;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCodigo;
    private javax.swing.JMenu jMenuConfig;
    private javax.swing.JMenuItem jMenuCopiar;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemAbrir;
    private javax.swing.JMenuItem jMenuItemAjuda;
    private javax.swing.JMenuItem jMenuItemContate;
    private javax.swing.JMenuItem jMenuItemCreditos;
    private javax.swing.JMenuItem jMenuItemCriaCor;
    private javax.swing.JMenuItem jMenuItemCss;
    private javax.swing.JMenuItem jMenuItemFonte;
    private javax.swing.JMenuItem jMenuItemGeraIcon;
    private javax.swing.JMenuItem jMenuItemGeraMeta;
    private javax.swing.JMenuItem jMenuItemHtml5;
    private javax.swing.JMenuItem jMenuItemMapeador;
    private javax.swing.JMenuItem jMenuItemOjetivo;
    private javax.swing.JMenuItem jMenuItemQuebraLinha;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSalvarComo;
    private javax.swing.JMenuItem jMenuItemTestadorCor;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    public static javax.swing.JTextArea jTextAreaMain;
    // End of variables declaration//GEN-END:variables


    class FilterHTMLouCSS extends javax.swing.filechooser.FileFilter {
        
        @Override
            public boolean accept(File file) {
                String filename = file.getName();
                return filename.toUpperCase().endsWith(".HTML") ||
                       filename.toUpperCase().endsWith(".HTM") ||
                       filename.toUpperCase().endsWith(".CSS") ||
                        file.isDirectory();
            }
        @Override
            public String getDescription() {
                return "*.htm, *.html, *.css";
            }
    }
}
