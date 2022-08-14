package Vista;

import Controlador.ReportesControlador;
import Modelo.Informe1vo;
import Modelo.Informe2vo;
import Modelo.Informe3vo;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GUI extends javax.swing.JFrame {
    public static final ReportesControlador controlador= new ReportesControlador();

    public GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Salir = new javax.swing.JButton();
        Informe1 = new javax.swing.JButton();
        Informe2 = new javax.swing.JButton();
        Informe3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));
        setUndecorated(true);

        Salir.setBackground(new java.awt.Color(255, 0, 0));
        Salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Informe1.setBackground(new java.awt.Color(0, 0, 0));
        Informe1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Informe1.setForeground(new java.awt.Color(255, 255, 255));
        Informe1.setText("Informe 1");
        Informe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Informe1ActionPerformed(evt);
            }
        });

        Informe2.setBackground(new java.awt.Color(0, 0, 0));
        Informe2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Informe2.setForeground(new java.awt.Color(255, 255, 255));
        Informe2.setText("Informe 2");
        Informe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Informe2ActionPerformed(evt);
            }
        });

        Informe3.setBackground(new java.awt.Color(0, 0, 0));
        Informe3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Informe3.setForeground(new java.awt.Color(255, 255, 255));
        Informe3.setText("Informe 3");
        Informe3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Informe3ActionPerformed(evt);
            }
        });

        Area1.setColumns(20);
        Area1.setRows(5);
        jScrollPane1.setViewportView(Area1);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Reto 5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Salir)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Informe1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(Informe2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(Informe3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Salir))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Informe1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Informe2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Informe3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void Informe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Informe1ActionPerformed
        try {
            List<Informe1vo> proyectos=controlador.ListaInforme1();
            String salida="Informe 1\n\nID\tNOMBRE\tAPELLIDO\tCIUDAD";
            for(Informe1vo proyecto : proyectos){
                salida+="\n";
                salida+=proyecto.getID();
                salida+="\t";
                salida+=proyecto.getNOMBRE();
                salida+="\t";
                salida+=proyecto.getAPELLIDO();
                salida+="\t";
                salida+=proyecto.getCIUDAD();
                
            }
           Area1.setText(salida);
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_Informe1ActionPerformed

    private void Informe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Informe2ActionPerformed
        try {
            List<Informe2vo> proyectos=controlador.ListaInforme2();
            String salida="Informe 2\n\nID\tCONSTRUCTORA\tHABITACIONES\tCIUDAD";
            for(Informe2vo proyecto : proyectos){
                salida+="\n";
                salida+=proyecto.getID();
                salida+="\t";
                salida+=proyecto.getCONSTRUCTORA();
                salida+="\t";
                salida+=proyecto.getHABITACIONES();
                salida+="\t";
                salida+=proyecto.getCIUDAD();
                
            }
           Area1.setText(salida);
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Informe2ActionPerformed

    private void Informe3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Informe3ActionPerformed
        try {
            List<Informe3vo> proyectos=controlador.ListaInforme3();
            String salida="Informe 3\n\nID\tCONSTRUCTORA\tBANCO";
            for(Informe3vo proyecto : proyectos){
                salida+="\n";
                salida+=proyecto.getID();
                salida+="\t";
                salida+=proyecto.getCONSTRUCTORA();
                salida+="\t";
                salida+=proyecto.getBANCO();
                
            }
           Area1.setText(salida);
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Informe3ActionPerformed


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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area1;
    private javax.swing.JButton Informe1;
    private javax.swing.JButton Informe2;
    private javax.swing.JButton Informe3;
    private javax.swing.JButton Salir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
