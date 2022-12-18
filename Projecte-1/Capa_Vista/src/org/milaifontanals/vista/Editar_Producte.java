/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.milaifontanals.vista;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import org.milaifontanals.model.Album;
import org.milaifontanals.model.Artista;
import org.milaifontanals.model.ArtistaIndividual;
import org.milaifontanals.model.Estil;
import org.milaifontanals.model.Producte;
import org.milaifontanals.persistencia.CapaPersistencia;
import org.milaifontanals.persistencia.GestorBDEmpresaException;

/**
 *
 * @author isard
 */
public class Editar_Producte extends javax.swing.JDialog {

    /**
     * Creates new form Editar_Producte
     */
    
    private CapaPersistencia cBD = null;
    ButtonGroup bG = new ButtonGroup();
    Producte prod = null;
    int hores=0;
    int minuts=0;
    int segons=0;
    double durada =0;
    int any=0;
    
    
    
    public Editar_Producte(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Nom_field = new javax.swing.JTextField();
        Estil_combo = new javax.swing.JComboBox<>();
        Actiu_RB = new javax.swing.JRadioButton();
        Inactiu_RB = new javax.swing.JRadioButton();
        Any_SP = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        Hores_SP = new javax.swing.JSpinner();
        Minuts_SP = new javax.swing.JSpinner();
        Segons_SP = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Contingut_BT = new javax.swing.JButton();
        Desar_BT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nom:");

        jLabel2.setText("Estil: ");

        jLabel3.setText("Estat:");

        jLabel4.setText("Any de creació: ");

        Actiu_RB.setText("Actiu");

        Inactiu_RB.setText("Inactiu");

        Any_SP.setModel(new javax.swing.SpinnerNumberModel(2000, 1900, 2500, 1));

        jLabel5.setText("Durada: ");

        Hores_SP.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));

        Minuts_SP.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        Segons_SP.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        jLabel6.setText("Hores");

        jLabel7.setText("Minuts");

        jLabel8.setText("Segons");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Afegir Contingut Àlbum/Llista"));

        Contingut_BT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/milaifontanals/Imatges/icons8-edit-16.png"))); // NOI18N
        Contingut_BT.setText("Editar Contingut");
        Contingut_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contingut_BTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Contingut_BT)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Contingut_BT)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        Desar_BT.setText("Desar Canvis");
        Desar_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Desar_BTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(Actiu_RB)
                                .addGap(32, 32, 32)
                                .addComponent(Inactiu_RB))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Hores_SP, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Minuts_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Any_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Segons_SP, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Estil_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(Nom_field, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(Desar_BT)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Desar_BT)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(Nom_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Estil_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Actiu_RB)
                    .addComponent(Inactiu_RB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Any_SP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Hores_SP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Minuts_SP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Segons_SP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       ConfigurarSpiners();
       CarregarComboBox();
   InserirInformacio();
       ConfigurarElementsOpcionals();
    }//GEN-LAST:event_formWindowOpened

    private void Contingut_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contingut_BTActionPerformed
       
        
        String tipus=prod.getTp().toString();
        
        switch(tipus){
            case ("A"):
                Contingut_Album dialog = new Contingut_Album (new javax.swing.JFrame(), true);
       dialog.setConnexio(cBD);
      
       
       dialog.pasarProducte(prod);
       dialog.setVisible(true);
     
       
        dialog.addWindowListener(new WindowAdapter(){
           @Override
           public void windowClosed(WindowEvent e) {
               
               //Actualitzem la informació una vegada hem canviat el contingut 
              double durada= dialog.getDuarada();
              ActulitzarDurada(durada);
              
           }
           
           
       });
                
                
            break;
            
            case("L"):
                
                Contingut_Llista dialog2 = new Contingut_Llista (new javax.swing.JFrame(), true);
       dialog2.setConnexio(cBD);
      
       
       dialog2.pasarProducte(prod);
       dialog2.setVisible(true);
     
       
        dialog2.addWindowListener(new WindowAdapter(){
           @Override
           public void windowClosed(WindowEvent e) {
               
               //Actualitzem la informació una vegada hem canviat el contingut 
              double durada= dialog2.getDuarada();
              ActulitzarDurada(durada);
              
           }
                
           });
            break;
        }
        
      
        
        
        
    }//GEN-LAST:event_Contingut_BTActionPerformed

    private void Desar_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Desar_BTActionPerformed
       String tipus = prod.getTp().toString();
       String estat=null;
       if(Actiu_RB.isSelected()){
           estat="Actiu";
       }else if(Inactiu_RB.isSelected()){
           estat="Inactiu";
       }
       
       Estil estil= new Estil(Estil_combo.getSelectedItem().toString());
       
       durada=ConvertirTemps(hores,minuts,segons);
       
       if(Nom_field.getText().length()<1){
             JOptionPane.showMessageDialog(this, "El titol de la cançó ha de tenir com a mínim un caràcter");
       }else{
        try {
            cBD.updateProducte(Nom_field.getText(),prod.getId(),durada,prod.getTp().toString(),estat,estil,any);
            JOptionPane.showMessageDialog(this, "Canvis desats");
            
            
            
            
        } catch (GestorBDEmpresaException ex) {
            Logger.getLogger(Editar_Producte.class.getName()).log(Level.SEVERE, null, ex);
        }
       } 
    }//GEN-LAST:event_Desar_BTActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_Producte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_Producte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_Producte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_Producte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Editar_Producte dialog = new Editar_Producte(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Actiu_RB;
    private javax.swing.JSpinner Any_SP;
    private javax.swing.JButton Contingut_BT;
    private javax.swing.JButton Desar_BT;
    private javax.swing.JComboBox<String> Estil_combo;
    private javax.swing.JSpinner Hores_SP;
    private javax.swing.JRadioButton Inactiu_RB;
    private javax.swing.JSpinner Minuts_SP;
    private javax.swing.JTextField Nom_field;
    private javax.swing.JSpinner Segons_SP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    void setConnexio(CapaPersistencia conn) {
    cBD=conn;
    }

    void pasarProducte(Producte pr) {
    
        prod = pr;
    
    }

   
     private void ConfigurarSpiners() {
    
        bG.add(Actiu_RB);
        bG.add(Inactiu_RB);
        
        
        if(prod.getActiu()){
            Actiu_RB.setSelected(true);
        }else if(!prod.getActiu()){
            Inactiu_RB.setSelected(true);
        }
    }

    private void CarregarComboBox() {
     
    //ESTILS
     List<Estil> estils = new ArrayList<Estil>();
        
        
        try {
            estils = cBD.getEstils();
                Estil_combo.addItem("Tots");
            for(int i =0; i<estils.size();i++){
                Estil_combo.addItem(estils.get(i).getNom());
            }
   
        } catch (GestorBDEmpresaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Ups, ha hagut un error!", JOptionPane.ERROR_MESSAGE);
      
        }
    
    
    
    }

    private void InserirInformacio() {
        Nom_field.setText(prod.getTitol());
        Estil_combo.setSelectedItem(prod.getEstil().getNom());
        
        try {
            durada= cBD.getDurada(prod.getId());
            CalcularTemps(durada);
            Hores_SP.setValue(hores);
            Minuts_SP.setValue(minuts);
            Segons_SP.setValue(segons);
            
             any=cBD.getAny(prod.getId());
            
            Any_SP.setValue(any);
        } catch (GestorBDEmpresaException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage(),"Ups, ha hagut un error!", JOptionPane.ERROR_MESSAGE);
        }
        
        
    
    }

    private void ConfigurarElementsOpcionals() {
        String tipus = prod.getTp().toString();
       
        
        if(tipus.equals("C")){
            Contingut_BT.setEnabled(false);
        }else if(tipus.equals("A") || tipus.equals("L")){
            Hores_SP.setEnabled(false);
            Minuts_SP.setEnabled(false);
            Segons_SP.setEnabled(false);
        }
       
    }
    
    private void CalcularTemps(double durada) {
            double calcul;
            calcul= durada/60;
            hores=(int)calcul;
            calcul=calcul-hores;
            calcul=calcul*60;
            minuts=(int)calcul;
            calcul=calcul-minuts;
            calcul=calcul*60;
            segons=(int)calcul;
            
    }
    
    
     private long ConvertirTemps(int hores, int minuts, int segons) {
    long resultat=0;
    long hores_m;
    long segons_m;
    
    hores_m= hores*60;
    segons_m=segons /60;
    resultat=minuts+hores_m+segons_m;
    
    return resultat;
    }
    

     
     
     private void ActulitzarDurada(double durada){
        CalcularTemps(durada);
         Hores_SP.setValue(hores);
         Minuts_SP.setValue(minuts);
         Segons_SP.setValue(segons);
         
     }
     
     
 }