/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pos.layerd.view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pos.layerd.controller.CustomerController;
import pos.layerd.dto.CustomerDto;
import java.util.AbstractList;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hiran
 */
public class CustomerPanel extends javax.swing.JPanel {
private CustomerController customerController;
    /**
     * Creates new form CustomerPanel
     */
    public CustomerPanel() {
        customerController = new CustomerController();
        initComponents();
        loadAllCustomers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerlabel = new javax.swing.JLabel();
        fromPanel = new javax.swing.JPanel();
        custidLabel = new javax.swing.JLabel();
        custidText = new javax.swing.JTextField();
        custtitleLabel1 = new javax.swing.JLabel();
        custTitleText = new javax.swing.JTextField();
        custnameLabel = new javax.swing.JLabel();
        custNameText = new javax.swing.JTextField();
        custdobLabel = new javax.swing.JLabel();
        custDobText = new javax.swing.JTextField();
        custaddressLabel = new javax.swing.JLabel();
        custAddressText = new javax.swing.JTextField();
        custCityText = new javax.swing.JTextField();
        custcityLabel = new javax.swing.JLabel();
        custProvinceText = new javax.swing.JTextField();
        custprovinceLabel = new javax.swing.JLabel();
        custPostcodeText = new javax.swing.JTextField();
        custpostcodeLabel = new javax.swing.JLabel();
        addbotton = new javax.swing.JButton();
        deletebotton = new javax.swing.JButton();
        updatebotton = new javax.swing.JButton();
        custSalaryLabel = new javax.swing.JLabel();
        custSalaryText = new javax.swing.JTextField();
        tablepanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        basePanel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        headerlabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        headerlabel.setText(" Manage Customer");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        fromPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custidLabel.setText("Customer Id ");
        fromPanel.add(custidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, -1, 22));

        custidText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custidTextActionPerformed(evt);
            }
        });
        fromPanel.add(custidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 15, 103, -1));

        custtitleLabel1.setText("Customer Title ");
        fromPanel.add(custtitleLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 43, -1, 22));

        custTitleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custTitleTextActionPerformed(evt);
            }
        });
        fromPanel.add(custTitleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 43, 103, -1));

        custnameLabel.setText("Customer Name");
        fromPanel.add(custnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 43, -1, 22));

        custNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNameTextActionPerformed(evt);
            }
        });
        fromPanel.add(custNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 43, 292, -1));

        custdobLabel.setText("Customer DOB");
        fromPanel.add(custdobLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 71, -1, 22));
        fromPanel.add(custDobText, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 71, 109, -1));

        custaddressLabel.setText("Address");
        fromPanel.add(custaddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 99, -1, 22));
        fromPanel.add(custAddressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 99, 570, -1));
        fromPanel.add(custCityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 127, 84, -1));

        custcityLabel.setText("City");
        fromPanel.add(custcityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 127, 79, 22));

        custProvinceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custProvinceTextActionPerformed(evt);
            }
        });
        fromPanel.add(custProvinceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 127, 110, -1));

        custprovinceLabel.setText("Province");
        fromPanel.add(custprovinceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 127, -1, 22));

        custPostcodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custPostcodeTextActionPerformed(evt);
            }
        });
        fromPanel.add(custPostcodeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 167, 84, -1));

        custpostcodeLabel.setText("Post Code");
        fromPanel.add(custpostcodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 167, -1, 22));

        addbotton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addbotton.setText("Save customer");
        addbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbottonActionPerformed(evt);
            }
        });
        fromPanel.add(addbotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 201, -1, -1));

        deletebotton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deletebotton.setText("Delete customer");
        deletebotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebottonActionPerformed(evt);
            }
        });
        fromPanel.add(deletebotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 201, -1, -1));

        updatebotton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updatebotton.setText("Update customer");
        updatebotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebottonActionPerformed(evt);
            }
        });
        fromPanel.add(updatebotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 201, -1, -1));

        custSalaryLabel.setText("Salary");
        fromPanel.add(custSalaryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 167, -1, 22));

        custSalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custSalaryTextActionPerformed(evt);
            }
        });
        fromPanel.add(custSalaryText, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 167, 110, -1));

        customerTable.setBackground(new java.awt.Color(204, 204, 255));
        customerTable.setBorder(new javax.swing.border.MatteBorder(null));
        customerTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        customerTable.setForeground(new java.awt.Color(0, 0, 0));
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        javax.swing.GroupLayout tablepanelLayout = new javax.swing.GroupLayout(tablepanel);
        tablepanel.setLayout(tablepanelLayout);
        tablepanelLayout.setHorizontalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablepanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        tablepanelLayout.setVerticalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        fromPanel.add(tablepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 242, 710, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hiran\\Desktop\\ijse\\online-shopping-e-commerce-concept-wooden-block-icon-cart-standing-computer-keyboard-viewed-44905065.jpg")); // NOI18N
        fromPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 750, 490));

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fromPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fromPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void custNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custNameTextActionPerformed

    private void custProvinceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custProvinceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custProvinceTextActionPerformed

    private void custPostcodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custPostcodeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custPostcodeTextActionPerformed

    private void addbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbottonActionPerformed
    try {
        // TODO add your handling code here:
        addCustomer();
    } catch (Exception ex) {
        Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_addbottonActionPerformed

    private void deletebottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebottonActionPerformed
        // TODO add your handling code here:
        delectCustomer();
    }//GEN-LAST:event_deletebottonActionPerformed

    private void updatebottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebottonActionPerformed
        // TODO add your handling code here:
       updateCustomer();
    }//GEN-LAST:event_updatebottonActionPerformed

    private void custSalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custSalaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custSalaryTextActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        // TODO add your handling code here:
        searchCustomer();
    }//GEN-LAST:event_customerTableMouseClicked

    private void custidTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custidTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custidTextActionPerformed

    private void custTitleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custTitleTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custTitleTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbotton;
    private javax.swing.JPanel basePanel;
    private javax.swing.JTextField custAddressText;
    private javax.swing.JTextField custCityText;
    private javax.swing.JTextField custDobText;
    private javax.swing.JTextField custNameText;
    private javax.swing.JTextField custPostcodeText;
    private javax.swing.JTextField custProvinceText;
    private javax.swing.JLabel custSalaryLabel;
    private javax.swing.JTextField custSalaryText;
    private javax.swing.JTextField custTitleText;
    private javax.swing.JLabel custaddressLabel;
    private javax.swing.JLabel custcityLabel;
    private javax.swing.JLabel custdobLabel;
    private javax.swing.JLabel custidLabel;
    private javax.swing.JTextField custidText;
    private javax.swing.JLabel custnameLabel;
    private javax.swing.JTable customerTable;
    private javax.swing.JLabel custpostcodeLabel;
    private javax.swing.JLabel custprovinceLabel;
    private javax.swing.JLabel custtitleLabel1;
    private javax.swing.JButton deletebotton;
    private javax.swing.JPanel fromPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel tablepanel;
    private javax.swing.JButton updatebotton;
    // End of variables declaration//GEN-END:variables

    private void addCustomer() throws Exception {
       
        try{
        CustomerDto customerDto = new CustomerDto(custidText.getText(),
                custTitleText.getText(),
                custNameText.getText(),
                custDobText.getText(),
                Double.parseDouble(custSalaryText.getText()),
                custAddressText.getText(),
                custCityText.getText(),
                custProvinceText.getText(),
                custPostcodeText.getText());
        
        
        String result =customerController.addCustomer(customerDto);
        JOptionPane.showMessageDialog(this, result);
        clear();
        loadAllCustomers();
    }catch(NumberFormatException ex){
        
        JOptionPane.showMessageDialog(this, "ENTER CORRECT VALUE");
        clear();
    }catch(Exception e){
    
     JOptionPane.showMessageDialog(this, e);
        clear();
    }
    }
    
      private void clear(){
            
            custidText.setText("");
            custTitleText.setText("");
            custNameText.setText("");
            custDobText.setText("");
            custSalaryText.setText("");
            custAddressText.setText("");
            custCityText.setText("");
            custProvinceText.setText("");
            custPostcodeText.setText("");
                 
        }
      
       private void loadAllCustomers() {
        try {
            String[] collumns = {"Id", "Name", "Address", "Salary", "Postal Code"};
            DefaultTableModel dtm = new DefaultTableModel(collumns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            customerTable.setModel(dtm);

            ArrayList<CustomerDto> customers = customerController.getAllCustomers();

            for (CustomerDto customer : customers) {
                Object[] rowData = {customer.getCustId(), customer.getTitle() + " " + customer.getNames(), customer.getAddress() + ", " + customer.getCity(), customer.getSalary(), customer.getZip()};
                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
        private void searchCustomer() {
        try {
            String custId = customerTable.getValueAt(customerTable.getSelectedRow(), 0).toString();
            CustomerDto customerDto = customerController.searchCustomer(custId);
            
            if (customerDto != null) {
                custidText.setText(customerDto.getCustId());
                custTitleText.setText(customerDto.getTitle());
                custNameText.setText(customerDto.getNames());
                custDobText.setText(customerDto.getDob());
                custSalaryText.setText(Double.toString(customerDto.getSalary()));
                custAddressText.setText(customerDto.getAddress());
                custCityText.setText(customerDto.getCity());
                custProvinceText.setText(customerDto.getProvince());
                custPostcodeText.setText(customerDto.getZip());
            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    private void updateCustomer() {
    try {
        CustomerDto customerDto = new CustomerDto(custidText.getText(),
                custTitleText.getText(),
                custNameText.getText(),
                custDobText.getText(),
                Double.parseDouble(custSalaryText.getText()),
                custAddressText.getText(),
                custCityText.getText(),
                custProvinceText.getText(),
                custPostcodeText.getText());
        
        
        String result =customerController.updateCustomer(customerDto);
        JOptionPane.showMessageDialog(this, result);
        clear();
        loadAllCustomers();
    } catch (Exception ex) {
        Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    private void delectCustomer() {
    try {
        String custId = custidText.getText();
        
        String resp = customerController.delectCustomer(custId);
        JOptionPane.showMessageDialog(this, resp);
        clear();
        loadAllCustomers();
    } catch (Exception ex) {
        Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    }