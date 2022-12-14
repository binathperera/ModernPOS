/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.modernPOS.view;

/**
 *
 * @author Binath Perera
 */
public class MainFrame extends javax.swing.JFrame {
    private static StartPannel sp;
    private static MainPannel mp;
    private static SystemSettingsPannel ssp;
    private static ManageCustomersPannel mcp;
    private static ManageItemsPannel mip;
    private static PlaceOrderPannel pop;
    private static ViewOrdersPannel vop;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        sp=new StartPannel();
        mp=new MainPannel();
        ssp=new SystemSettingsPannel();
        mcp=new ManageCustomersPannel();
        mip=new ManageItemsPannel();
        vop = new ViewOrdersPannel();
        pop=new PlaceOrderPannel();
        this.add(sp).setVisible(true);
        this.add(mp).setVisible(false);
        this.add(ssp).setVisible(false);
        this.add(mcp).setVisible(false);
        this.add(mip).setVisible(false);
        this.add(vop).setVisible(false);
        this.add(pop).setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(760, 720));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    /**
     * @return the sp
     */
    public static StartPannel getSp() {
        return sp;
    }

    
    public static MainPannel getMp() {
        return mp;
    }

    

    /**
     * @return the ssp
     */
    public static SystemSettingsPannel getSsp() {
        return ssp;
    }

  

    /**
     * @return the mcp
     */
    public static ManageCustomersPannel getMcp() {
        return mcp;
    }

   
    /**
     * @return the mip
     */
    public static ManageItemsPannel getMip() {
        return mip;
    }

    /**
     * @return the pop
     */
    public static PlaceOrderPannel getPop() {
        return pop;
    }

    /**
     * @return the vop
     */
    public static ViewOrdersPannel getVop() {
        return vop;
    }

}
