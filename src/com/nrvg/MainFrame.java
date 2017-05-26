package com.nrvg;

import javax.swing.*;
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
        txtSupFunct = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSuperpos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnFindSuperpos = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDNFSuper = new javax.swing.JTextArea();
        columnNames = new String [] {
                "X1", "F1"
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Superposition");

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Количество переменных:");

        txtNumOfX.setText("0");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Количество функций:");

        jLabel6.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 13)); // NOI18N
        jLabel6.setText("Количество строк суперпозиции:");

        txtNumOfFunctions.setText("0");

        txtSupFunct.setText("0");

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

        tblSuperpos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSuperposMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnInitTable, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNumOfX)
                                                .addComponent(txtNumOfFunctions, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                .addComponent(txtSupFunct)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNumOfX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtNumOfFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSupFunct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInitTable))
        );

        jScrollPane3.setBorder(null);

        tblSuperpos.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "F1", "F2"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblSuperpos);

        jLabel4.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Система булевых функций");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Суперпозиция");

        jLabel7.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Полученная ДНФ суперпозиции");

        txtDNFSuper.setText("F* = ?");

        btnFindSuperpos.setText("Найти");
        btnFindSuperpos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindSuperposActionPerformed(evt);
            }
        });

        txtDNFSuper.setColumns(20);
        txtDNFSuper.setRows(5);
        txtDNFSuper.setLineWrap(true);
        txtDNFSuper.setFont(txtDNFSuper.getFont().deriveFont(14f));
        jScrollPane4.setViewportView(txtDNFSuper);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnFindSuperpos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(9, 9, 9))
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                                        .addComponent(jScrollPane4))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(btnFindSuperpos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane4)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)))
        );

        pack();
    }

    private void btnInitTableActionPerformed(java.awt.event.ActionEvent evt) {
        generateTable(Integer.parseInt(txtNumOfX.getText()), Integer.parseInt(txtNumOfFunctions.getText()));
        generateSuperposTable(Integer.parseInt(txtNumOfFunctions.getText()), Integer.parseInt(txtSupFunct.getText()));
    }

    private void btnFindSuperposActionPerformed(java.awt.event.ActionEvent evt) {
        //generateGrayMatrix(Integer.parseInt(txtNumOfX.getText()));
        toDNF(jTable1, Integer.parseInt(txtNumOfX.getText()));
    }

    private void toDNF(JTable table, int numOfX) {
        TableModel model = table.getModel();
        int rows = model.getRowCount() - 1;
        int columns = model.getColumnCount() - 1;

        Vector F = new Vector(rows);
        Vector notF = new Vector(rows);
        for (int i = numOfX; i <= columns; i++) {
            String string = "", notString = "";
            for (int j = 0; j < rows + 1; j++) {
                if (Integer.parseInt(String.valueOf(model.getValueAt(j, i))) == 1) {
                    for (int k = 0; k <= numOfX - 1; k++) {
                        if (Integer.parseInt(String.valueOf(model.getValueAt(j, k))) == 1)
                            string += "X" + (k + 1);
                        else  {
                            string += "!X" + (k + 1);
                        }
                    }

                    string += " ⋁ ";
                } else {
                    for (int k = 0; k <= numOfX - 1; k++) {
                        if (Integer.parseInt(String.valueOf(model.getValueAt(j, k))) == 1)
                            notString += "X" + (k + 1);
                        else  {
                            notString += "!X" + (k + 1);
                        }
                    }

                    notString += " ⋁ ";
                }
            }
            if (string.length() > 0) {
                string = string.substring(0, string.length() - 3);
                notString = notString.substring(0, notString.length() - 3);
            }
            F.add(string);
            notF.add(notString);
        }

        toSuperpos(F, notF);
    }

    private void toSuperpos(Vector F, Vector notF) {
        TableModel model = tblSuperpos.getModel();
        int rows = model.getRowCount() - 1;
        int columns = model.getColumnCount() - 1;

        String superposition = "";
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= columns; j++) {
                if ((String.valueOf(model.getValueAt(i, j)).equals("-")) == true) {
                } else {
                    if (Integer.parseInt(String.valueOf(model.getValueAt(i, j))) == 1) {
                        superposition += F.get(j) + " ⋀ ";
                    }
                    if (Integer.parseInt(String.valueOf(model.getValueAt(i, j))) == 0) {
                        superposition += notF.get(j) + " ⋀ ";
                    }
                }
            }
            superposition = superposition.substring(0, superposition.length() - 3);
            superposition += " ⋁ ";
        }
        superposition = superposition.substring(0, superposition.length() - 3);
        txtDNFSuper.setText("F* = " + superposition);
    }

    private void generateGrayMatrix(int numOfX) {
        int column, row, var;
        var = numOfX / 2;
        row = (int) Math.pow(2, var);
        column = (int) Math.pow(2, numOfX - var);

        TableModel tableModel = jTable1.getModel();
        /*int arr[][] = new int[row - 1][column - 1];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = 1;
            }
        }*/

        Boolean canEdit[] = new Boolean[column];
        Vector Col = new Vector(column);
        for (int i = 0; i < column; i++) {
            Col.add("X" + (i + 1));
        }

        Vector data = new Vector();
        Vector Row = new Vector();

        for (int i = 0; i < row; i++) {
            Row = new Vector(column);
            for (int j = column - 1; j >= 0; j--) {
                if (numOfX == 3) {
                    Row.add(0, "*");
                } else {
                    Row.add("Х");
                }
            }

            data.add(Row);
        }

        for (int e = 0; e < column; e++) {
            canEdit[e] = false;
        }
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        changeFunValue(jTable1);
    }

    private void tblSuperposMouseClicked(java.awt.event.MouseEvent evt) {
        changeFunValue(tblSuperpos);
    }

    private void changeFunValue(JTable table) {
        TableModel model = table.getModel();
        String value = model.getValueAt(table.getSelectedRow(), table.getSelectedColumn()).toString();
        switch (value) {
            case "0" :
                model.setValueAt("1", table.getSelectedRow(), table.getSelectedColumn());
                break;
            case "1" :
                model.setValueAt("-", table.getSelectedRow(), table.getSelectedColumn());
                break;
            case "-" :
                model.setValueAt("0", table.getSelectedRow(), table.getSelectedColumn());
                break;
        }
    }

    private void generateSuperposTable(int numOfFunctions, int numOfSup) {
        Boolean canEdit[] = new Boolean[numOfFunctions];
        Vector Col = new Vector(numOfFunctions);
        for (int i = 0; i < numOfFunctions; i++) {
            Col.add("F" + (i + 1));
        }

        Vector data = new Vector();
        Vector Row = new Vector();

        for (int i = 0; i < numOfSup; i++) {
            Row = new Vector(numOfFunctions);
            for (int j = numOfFunctions - 1; j >= 0; j--) {
                Row.add(0);
            }

            data.add(Row);
        }

        for (int e = 0; e < numOfFunctions; e++) {
            canEdit[e] = false;
        }

        tblSuperpos.setModel(new DefaultTableModel(data, Col){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }

        });
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

    private javax.swing.JButton btnFindSuperpos;
    private javax.swing.JButton btnInitTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblSuperpos;
    private javax.swing.JTextArea txtDNFSuper;
    private javax.swing.JTextField txtNumOfFunctions;
    private javax.swing.JTextField txtNumOfX;
    private javax.swing.JTextField txtSupFunct;
    private String[] columnNames;



}