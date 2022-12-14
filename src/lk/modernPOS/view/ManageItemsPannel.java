/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.modernPOS.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.modernPOS.controller.ItemController;
import lk.modernPOS.dto.ItemDTO;

/**
 *
 * @author Binath Perera
 */
public class ManageItemsPannel extends javax.swing.JPanel {

    /**
     * Creates new form ManageItemPannel
     */
    public ManageItemsPannel() {
        
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
        jLabel5 = new javax.swing.JLabel();
        descriptionText = new javax.swing.JTextField();
        unitPriceText = new javax.swing.JTextField();
        qtyOnHandText = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        itemCodeText = new javax.swing.JTextField();
        buttonPanel1 = new javax.swing.JPanel();
        newCustomerLabel = new javax.swing.JLabel();
        deleteItemButton = new javax.swing.JButton();
        updateItemButton = new javax.swing.JButton();
        buttonPanel2 = new javax.swing.JPanel();
        AddItemButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Manage Item Form");
        add(jLabel1);
        jLabel1.setBounds(200, 0, 470, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Item code");
        add(jLabel2);
        jLabel2.setBounds(100, 130, 130, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Description");
        add(jLabel3);
        jLabel3.setBounds(100, 180, 140, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Unit price");
        add(jLabel4);
        jLabel4.setBounds(100, 240, 99, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Qty On Hand");
        add(jLabel5);
        jLabel5.setBounds(100, 300, 151, 29);

        descriptionText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add(descriptionText);
        descriptionText.setBounds(250, 180, 310, 40);

        unitPriceText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add(unitPriceText);
        unitPriceText.setBounds(250, 230, 170, 40);

        qtyOnHandText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add(qtyOnHandText);
        qtyOnHandText.setBounds(250, 290, 170, 40);
        add(jSeparator2);
        jSeparator2.setBounds(-100, 70, 920, 10);

        itemCodeText.setEditable(false);
        itemCodeText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add(itemCodeText);
        itemCodeText.setBounds(250, 120, 160, 40);

        buttonPanel1.setLayout(null);

        newCustomerLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newCustomerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/modernPOS/icons/add.png"))); // NOI18N
        newCustomerLabel.setText("New Item");
        newCustomerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newCustomerLabelMousePressed(evt);
            }
        });
        buttonPanel1.add(newCustomerLabel);
        newCustomerLabel.setBounds(20, 90, 170, 25);

        deleteItemButton.setText("Delete");
        deleteItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemButtonActionPerformed(evt);
            }
        });
        buttonPanel1.add(deleteItemButton);
        deleteItemButton.setBounds(20, 50, 130, 30);

        updateItemButton.setText("Update");
        updateItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemButtonActionPerformed(evt);
            }
        });
        buttonPanel1.add(updateItemButton);
        updateItemButton.setBounds(20, 10, 130, 30);

        add(buttonPanel1);
        buttonPanel1.setBounds(500, 230, 190, 120);

        buttonPanel2.setLayout(null);

        AddItemButton.setText("Add Item");
        AddItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemButtonActionPerformed(evt);
            }
        });
        buttonPanel2.add(AddItemButton);
        AddItemButton.setBounds(10, 10, 100, 40);

        add(buttonPanel2);
        buttonPanel2.setBounds(440, 110, 120, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/modernPOS/images/white background.jpg"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(20, 80, 680, 280);
        add(jSeparator1);
        jSeparator1.setBounds(0, 380, 820, 20);

        itemTable.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 204)));
        itemTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Code", "Description", "Unit price", "qty on hand"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemTable.setRowHeight(30);
        itemTable.getTableHeader().setReorderingAllowed(false);
        itemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                itemTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(itemTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 400, 710, 270);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(20, 10, 100, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/modernPOS/images/ManageItemForm background.jpg"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLabel6.setMinimumSize(new java.awt.Dimension(1280, 720));
        jLabel6.setPreferredSize(new java.awt.Dimension(1280, 720));
        add(jLabel6);
        jLabel6.setBounds(1, 0, 960, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void AddItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemButtonActionPerformed
        boolean stat2 = validateCode(itemCodeText.getText());
        if(stat2==false){
            itemCodeText.setText(generateItemCode());
            return;
        }
        boolean stat = validateFields();
        if(stat==false)return;
        
        int con = JOptionPane.showConfirmDialog(this, "Add this item into the list ?", "Add new Item confirmation. ", 1);
        if(con!=0){return;}
        boolean addItem=false;
        try {
            addItem=new ItemController().addItem(new ItemDTO(itemCodeText.getText(),descriptionText.getText(),Double.parseDouble(unitPriceText.getText()),Integer.parseInt(qtyOnHandText.getText())));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageItemsPannel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageItemsPannel.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(addItem){
            JOptionPane.showMessageDialog(this, "Item Added !");
            loadAllItems();
        }else{
            JOptionPane.showMessageDialog(this, "Item adding faliure !");
        }

    }//GEN-LAST:event_AddItemButtonActionPerformed

    private void itemTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTableMousePressed
        if(buttonPanel2.isVisible()){
            buttonPanel1.setVisible(true);
            buttonPanel2.setVisible(false);
            itemCodeText.setEditable(false);
        }
        DefaultTableModel dtm=(DefaultTableModel) itemTable.getModel();
        int selectedRow = itemTable.getSelectedRow();
        itemCodeText.setText(String.valueOf(dtm.getValueAt(selectedRow, 0)));
        descriptionText.setText(String.valueOf(dtm.getValueAt(selectedRow, 1)));
        unitPriceText.setText(String.valueOf(dtm.getValueAt(selectedRow, 2)));
        qtyOnHandText.setText(String.valueOf(dtm.getValueAt(selectedRow, 3)));
    }//GEN-LAST:event_itemTableMousePressed

    private void deleteItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemButtonActionPerformed
        if(itemCodeText.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please select an item to delete.");
            return;
        }   
        int con = JOptionPane.showConfirmDialog(this, "Delete item "+itemCodeText.getText()+" ","Item updation",1);
        if(con!=0){return;}
        try {
            boolean c =new ItemController().deleteItem(itemCodeText.getText());
            if(c){
                loadAllItems();
                JOptionPane.showMessageDialog(this,"Item deleted");
            }else{
                JOptionPane.showMessageDialog(this,"Delete failed");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageItemsPannel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteItemButtonActionPerformed

    private void updateItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemButtonActionPerformed
        if(itemCodeText.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please select an item to update.");
            return;
        }       
        if(validateFields()){
            int con = JOptionPane.showConfirmDialog(this, "Update Item "+itemCodeText.getText()+" with this information Provided?","Item updation ",1);
            if(con!=0){return;}
        
            try {
                boolean c = new ItemController().updateItem(new ItemDTO(itemCodeText.getText(),descriptionText.getText(),Double.parseDouble(unitPriceText.getText()),Integer.parseInt(qtyOnHandText.getText())));
                if(c){
                    loadAllItems();
                    JOptionPane.showMessageDialog(this,"Item updated ");
                }else{
                    JOptionPane.showMessageDialog(this,"Update failed");
                }
            } catch (Exception ex) {
                Logger.getLogger(ManageItemsPannel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_updateItemButtonActionPerformed

    private void newCustomerLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newCustomerLabelMousePressed
        
        clearAllFields();
        itemCodeText.setText(generateItemCode());
        buttonPanel2.setVisible(true);
        buttonPanel1.setVisible(false);
        itemCodeText.setEditable(true);
        descriptionText.requestFocus();
    }//GEN-LAST:event_newCustomerLabelMousePressed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainFrame.getMp().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddItemButton;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel buttonPanel1;
    private javax.swing.JPanel buttonPanel2;
    private javax.swing.JButton deleteItemButton;
    private javax.swing.JTextField descriptionText;
    private javax.swing.JTextField itemCodeText;
    private javax.swing.JTable itemTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel newCustomerLabel;
    private javax.swing.JTextField qtyOnHandText;
    private javax.swing.JTextField unitPriceText;
    private javax.swing.JButton updateItemButton;
    // End of variables declaration//GEN-END:variables

    private void loadAllItems() {
        try {
            ArrayList<ItemDTO> ar = new ItemController().getAllItems();
            DefaultTableModel dtm=(DefaultTableModel) itemTable.getModel();
            dtm.setRowCount(0);
            for(ItemDTO it:ar){
                dtm.addRow(new Object[]{it.getCode(),it.getDescription(),it.getUnitPrice(),it.getQtyOnHand()});
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageItemsPannel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageItemsPannel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearAllFields() {
        itemCodeText.setText(null);
        descriptionText.setText(null);
        unitPriceText.setText(null);
        qtyOnHandText.setText(null);
    }
    
    private String generateItemCode() {
            
        Random r=new Random();
        while(true){
            int num=r.nextInt(1000);
            String a=String.format("%c%03d",(char)r.nextInt(26)+65,num);
            boolean stat=validateCode(a);
            if(stat){
                return a;
            }
        }
    }
    
    private boolean validateCode(String id) {
        try {
            String[] allItemCodes = new ItemController().getAllItemCodes();
            for(String i:allItemCodes){
                if(id.equals(i)){
                    JOptionPane.showMessageDialog(this, "There is already a Item with this Code.\n It is recomended to assign the Code given by the system.");
                    return false;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageCustomersPannel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageCustomersPannel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    private boolean validateFields(){
        String description=descriptionText.getText().trim();
        String sunitPrice=unitPriceText.getText().trim();
        String sqty=qtyOnHandText.getText().trim();
        
        if(description.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter an item description");
            descriptionText.requestFocus();
            return false;

        }
        if(sunitPrice.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter the unit price");
            unitPriceText.requestFocus();
            return false;
        }
        if(sqty.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter the quantity");
            qtyOnHandText.requestFocus();
            return false;
        }
        double unitPrice;
        int qty;
        try{
            unitPrice=Double.parseDouble(sunitPrice);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please enter a valid unit price");
            unitPriceText.requestFocus();
            unitPriceText.selectAll();
            return false;
        }
        try{
            qty=Integer.parseInt(sqty);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please enter a valid quantity");
            qtyOnHandText.requestFocus();
            qtyOnHandText.selectAll();
            return false;
        }
        return true;
    }

    public void initialise() {
        try{
            loadAllItems();
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "Please check your connection properties");
            MainFrame.getMp().setVisible(true);
            return;
        }
        this.setVisible(true);
        MainFrame.getMp().setVisible(false);
        buttonPanel1.setVisible(true);
        buttonPanel2.setVisible(false);
        itemCodeText.setText("");
        itemCodeText.setEditable(false);
    }
}
