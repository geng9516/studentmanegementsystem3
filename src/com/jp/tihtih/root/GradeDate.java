/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.tihtih.root;

import com.jp.tihtih.login.Jdbc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class GradeDate extends javax.swing.JFrame {

    /**
     * Creates new form GradeDate
     */
    public GradeDate() {
        initComponents();
    }

    //生徒一人の成績を表示できる
    public void showGrade(List<Grade> list) {
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        for (Grade grade : list) {
            tableModel.addRow(new Object[]{grade.getStudentid(), grade.getTest(),
                grade.getKokugo(), grade.getMath(), grade.getEnglish(), grade.getScience(), grade.getHistory(), grade.getSum()});
        }

    }

    //画面の学生IDと名前を表示するため
    public void showStudentDate(String studentId, String name) {
        jLabel3.setText(name);
        jLabel7.setText(studentId);

    }

    //クラスごとの成績を表示する際にそのクラス名も表示
    public void showClassName(String className) {
        jLabel7.setText(className);
    }

    //追加した生徒成績を一覧に表示
    public void readGrade(String studentid) {
        jLabel7.setVisible(false);
        jLabel6.setVisible(false);
        jTextField1.setVisible(false);
        jButton5.setVisible(false);
        Jdbc jdbc = new Jdbc();

        List<Grade> list = new ArrayList<>();

        try {
            jdbc.getDbcom();

            list = jdbc.selectGrade(studentid);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GradeDate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                jdbc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(GradeDate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        for (Grade grade : list) {
            tableModel.addRow(new Object[]{grade.getStudentid(), grade.getTest(), grade.getKokugo(), grade.getMath(), grade.getEnglish(), grade.getScience(), grade.getHistory(), grade.getSum()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("成績確認");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "生徒ID", "試験別", "国語", "数学", "英語", "理科", "歴史", "合計"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jButton1.setText("新規");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("編集");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("閉じる");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("名前");

        jButton4.setText("削除");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("キーワード");

        jButton5.setText("検索");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1)
                .addGap(59, 59, 59)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(79, 79, 79)
                .addComponent(jButton3)
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5)))
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    閉じる
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        if(!jLabel3.getText().isEmpty()){
            AllStudentsDate asd = new AllStudentsDate();
            this.dispose();
            asd.setVisible(true);
        }else if(jLabel7.getText().contains("クラス")){
            TeachersDate td = new TeachersDate();
            this.dispose();
            td.setVisible(true);
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed
    /*
    新規
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GradeAdd ga = new GradeAdd();
        //jLabel3に名前
        if (!jLabel3.getText().isEmpty()) {

            ga.setStudentName(jLabel3.getText());
            //成績新規画面の学生IDを自動表示するため
            ga.setStudentId(jLabel7.getText());
            this.dispose();
            ga.setVisible(true);
        } else if (jLabel7.getText().contains("クラス")) {
            ga.setStudentName(jLabel7.getText());
            this.dispose();
            ga.setVisible(true);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    /*
    編集
    選択したデータ内容をGradeAddの各項目に表示
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        GradeAdd ga = new GradeAdd();
        Grade grade = new Grade();

        if (jTable1.getSelectedColumn() != -1) {
            if (!jLabel3.getText().isEmpty()) {
                grade.setStudentid(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                grade.setTest(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                grade.setKokugo(Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString()));
                grade.setMath(Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString()));
                grade.setEnglish(Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString()));
                grade.setScience(Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString()));
                grade.setHistory(Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString()));

                ga.setStudentName(jLabel3.getText());
                ga.setGradeAdd(grade);

                this.dispose();
                ga.setVisible(true);
            } else if (jLabel7.getText().contains("クラス")) {
                grade.setStudentid(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                grade.setTest(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                grade.setKokugo(Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString()));
                grade.setMath(Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString()));
                grade.setEnglish(Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString()));
                grade.setScience(Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString()));
                grade.setHistory(Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString()));

                ga.setStudentName(jLabel7.getText());
                ga.setGradeAdd(grade);

                this.dispose();
                ga.setVisible(true);
            }

        } else {
            jLabel1.setText("データを選択してください！");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    /*
    削除
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Jdbc jdbc = new Jdbc();

        try {
            jdbc.getDbcom();

            if (jTable1.getSelectedColumn() != -1) {
                // //成績をテスト別に削除
                jdbc.deleteGrade(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());

                //成績画面データ更新
                readGrade(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            } else {
                jLabel1.setText("データを選択してください！");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GradeDate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GradeDate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                jdbc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(GradeDate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    /**
     * 検索
     *
     * @param evt
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Jdbc jdbc = new Jdbc();
        Teacher teacher = new Teacher();
        List<Student> list = new ArrayList<>();
        List<Grade> list2 = new ArrayList<>();
        //String型をint型にフォーマット
        Pattern p = Pattern.compile("^-?[1-9]\\d*$");
//        Matcher m = p.matcher(num);
        try {
            jdbc.getDbcom();

            if (!jTextField1.getText().isEmpty()) {
                jLabel1.setText("");
                //Stringが数値かを判断
                if (p.matcher((jTextField1.getText())).find()) {
                    if (Integer.parseInt(jTextField1.getText()) >= 0 && Integer.parseInt(jTextField1.getText()) <= 100) {
                        list2 = jdbc.searchGrade(Integer.parseInt(jTextField1.getText()));
                        showGrade(list2);
                    } else {
                        jLabel1.setText("データが長すぎます！");
                        return;
                    }
                } else {
                    //名前、科目、性別（あいまいと特定検索）
                    list2 = jdbc.searchTesttype(jTextField1.getText());
                    showGrade(list2);
                }
                // 空欄のときクラスのすべての生徒の成績を一覧に
            } else {

                list = jdbc.selectClass(jLabel7.getText());
                for (Student student : list) {
                    list2 = jdbc.selectGrade(student.getId());
                }
                showGrade(list2);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeachersDate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TeachersDate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (jdbc != null) {
                try {
                    jdbc.closeDbcom();
                } catch (SQLException ex) {
                    Logger.getLogger(TeachersDate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(GradeDate.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeDate.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeDate.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeDate.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeDate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
