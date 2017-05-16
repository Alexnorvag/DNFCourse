package com.nrvg;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Vector;

/**
 * Created by norvag on 15.05.2017.
 */
public class MainFrame extends javax.swing.JFrame {
    public MainFrame() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumOfX = new javax.swing.JTextField();
        btnInitTable = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNumOfFunctions = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGrayMatrix = new javax.swing.JTable();
        columnNames = new String [] {
                "X1", "F1"
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Количество переменных:");

        txtNumOfX.setText("0");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Количество функций:");

        txtNumOfFunctions.setText("0");

        jScrollPane1.setBorder(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null}
                },
                columnNames
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }

        } );
        jScrollPane1.setViewportView(jTable1);

        btnInitTable.setText("Построить");
        btnInitTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitTableActionPerformed(evt);
            }
        });

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtNumOfX)
                                                        .addComponent(txtNumOfFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(btnInitTable))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNumOfX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtNumOfFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnInitTable)
                                .addContainerGap())
        );

        jScrollPane2.setBorder(null);

        tblGrayMatrix.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "Title 1", "Title 2"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGrayMatrix.setName(""); // NOI18N
        tblGrayMatrix.setTableHeader(null);
        jScrollPane2.setViewportView(tblGrayMatrix);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(477, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }
    private void btnInitTableActionPerformed(java.awt.event.ActionEvent evt) {
        generateTable(Integer.parseInt(txtNumOfX.getText()), Integer.parseInt(txtNumOfFunctions.getText()));
        generateGrayMatrix(Integer.parseInt(txtNumOfX.getText()));
    }

    private void generateGrayMatrix(int numOfX) {
        int column, row;
        row = numOfX / 2;
        column = numOfX - row;
        System.out.println("column: " + column * 2 + ", row: " + row * 2);

        Boolean canEdit[] = new Boolean[column];
        Vector Col = new Vector(column);
        for (int i = 0; i < column; i++) {
            Col.add("X" + (i + 1));
        }

        Vector data = new Vector();
        Vector Row = new Vector();

        for (int i = 0; i < ((int) Math.pow(2, row)); i++) {
            Row = new Vector(column);
            for (int j = column - 1; j >= 0; j--) {
                Row.add((i/(int) Math.pow(2, j))%2);
            }

            data.add(Row);
        }

        for (int e = 0; e < column; e++) {
            canEdit[e] = false;
        }

        tblGrayMatrix.setModel(new DefaultTableModel(data, Col){


            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }

        });
        jScrollPane2.setViewportView(tblGrayMatrix);

    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        changeFunValue();
    }

    private void changeFunValue() {
        TableModel model = jTable1.getModel();
        String value = model.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn()).toString();
        System.out.println("value: " + value + ", column: " + (jTable1.getSelectedColumn() + 1) + ", row: " + (jTable1.getSelectedRow() + 1));
        switch (value) {
            case "0" :
                model.setValueAt("1", jTable1.getSelectedRow(), jTable1.getSelectedColumn());
                break;
            case "1" :
                model.setValueAt("-", jTable1.getSelectedRow(), jTable1.getSelectedColumn());
                break;
            case "-" :
                model.setValueAt("0", jTable1.getSelectedRow(), jTable1.getSelectedColumn());
                break;
        }
        /*model.isCellEditable(3, 4);
        jTable1.setModel(model);
        System.out.println(jTable1.isCellEditable(jTable1.getSelectedRow(), jTable1.getSelectedColumn()));*/
    }

    private void generateTable(int numOfX, int numOfFunctions) {
        Boolean canEdit[] = new Boolean[numOfX + numOfFunctions];
        Vector Col = new Vector(numOfX + numOfFunctions);
        for (int i = 0; i < numOfX; i++) {
            Col.add("X" + (i + 1));
        }
        for (int i = 0; i < numOfFunctions; i++) {
            Col.add("F" + (i + 1));
        }

        Vector data = new Vector();
        Vector Row = new Vector();

        for (int i = 0; i < ((int) Math.pow(2, numOfX)); i++) {
            Row = new Vector(numOfX);
            for (int j = numOfX - 1; j >= 0; j--) {
                Row.add((i/(int) Math.pow(2, j))%2);
            }
            for (int k = 0; k < numOfFunctions; k++)
            {
                Row.add("0");
            }

            data.add(Row);
        }

        for (int e = 0; e < numOfX + numOfFunctions; e++) {
            canEdit[e] = false;
        }

        jTable1.setModel(new DefaultTableModel(data, Col){


            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }

        });
        jScrollPane1.setViewportView(jTable1);
    }

    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnInitTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblGrayMatrix;
    private javax.swing.JTextField txtNumOfFunctions;
    private javax.swing.JTextField txtNumOfX;
    private String[] columnNames;
}