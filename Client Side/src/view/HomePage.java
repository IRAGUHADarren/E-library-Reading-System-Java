/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author ZIPTECH LTD
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        DesktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        addbooks = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        addbook = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        users = new javax.swing.JMenu();
        usersinfo = new javax.swing.JMenuItem();
        publishers = new javax.swing.JMenu();
        publisher = new javax.swing.JMenuItem();
        Report = new javax.swing.JMenu();
        reports = new javax.swing.JMenuItem();
        userreport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME TO YOUR DASHBOARD");

        DesktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopPaneLayout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPaneLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        jMenu1.setText("Home");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        addbooks.add(jMenu1);

        jMenu2.setText("Books");

        addbook.setText("Add Books");
        addbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbookActionPerformed(evt);
            }
        });
        jMenu2.add(addbook);

        jMenuItem2.setText("Modify Books");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        addbooks.add(jMenu2);

        users.setText("Users");

        usersinfo.setText("Users");
        usersinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersinfoActionPerformed(evt);
            }
        });
        users.add(usersinfo);

        addbooks.add(users);

        publishers.setText("Publishers");

        publisher.setText("Publisher");
        publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisherActionPerformed(evt);
            }
        });
        publishers.add(publisher);

        addbooks.add(publishers);

        Report.setText("Report");

        reports.setText("Reports");
        reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsActionPerformed(evt);
            }
        });
        Report.add(reports);

        userreport.setText("User Report");
        userreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userreportActionPerformed(evt);
            }
        });
        Report.add(userreport);

        addbooks.add(Report);

        setJMenuBar(addbooks);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:     
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void addbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbookActionPerformed
        // TODO add your handling code here:
        ADDSbook cPage = new ADDSbook();
        DesktopPane.add(cPage);
        cPage.setVisible(true);
    }//GEN-LAST:event_addbookActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        ViewBooks cPage = new ViewBooks();
        DesktopPane.add(cPage);
        cPage.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void publisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisherActionPerformed
        // TODO add your handling code here:
        Publishers cPage = new Publishers();
        DesktopPane.add(cPage);
        cPage.setVisible(true);
    }//GEN-LAST:event_publisherActionPerformed

    private void reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsActionPerformed
        // TODO add your handling code here:
        Report cPage = new Report();
        DesktopPane.add(cPage);
        cPage.setVisible(true);       
        
    }//GEN-LAST:event_reportsActionPerformed

    private void usersinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersinfoActionPerformed
        // TODO add your handling code here:
         UsersInfo cPage = new UsersInfo();
        DesktopPane.add(cPage);
        cPage.setVisible(true);
    }//GEN-LAST:event_usersinfoActionPerformed

    private void userreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userreportActionPerformed
        // TODO add your handling code here:
        UserReport cPage = new UserReport();
        DesktopPane.add(cPage);
        cPage.setVisible(true);
    }//GEN-LAST:event_userreportActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenu Report;
    private javax.swing.JMenuItem addbook;
    private javax.swing.JMenuBar addbooks;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem publisher;
    private javax.swing.JMenu publishers;
    private javax.swing.JMenuItem reports;
    private javax.swing.JMenuItem userreport;
    private javax.swing.JMenu users;
    private javax.swing.JMenuItem usersinfo;
    // End of variables declaration//GEN-END:variables
}
