/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.tihtih.teacher;

import com.jp.tihtih.root.*;
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
public class StudentsDate extends javax.swing.JFrame {

    /**
     * Creates new form Students
     */
    public StudentsDate() {
        initComponents();
//        readeStudents();
    }

    /*
    すべての生徒を一覧に表示する
     */
    public void readeStudents(List<Student> list) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        for (Student student : list) {
            tableModel.addRow(new Object[]{student.getId(), student.getAclass(), student.getName(), student.getPass(), student.getSex()});
        }
    }

    //すべての生徒を一覧に表示
    public void readeStudents() {
        Jdbc jdbc = new Jdbc();

        List<Student> list = new ArrayList<>();

        try {
            jdbc.getDbcom();

            list = jdbc.getAllStudents();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentsDate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentsDate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (jdbc != null) {
                try {
                    jdbc.closeDbcom();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentsDate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        for (Student student : list) {
            tableModel.addRow(new Object[]{student.getId(), student.getAclass(), student.getName(), student.getPass(), student.getSex()});
        }
    }

    //担当クラスを表示
    public void readClassDb(List<Aclass> list) {
        //一旦jComboBox内のデータを空にする
        jComboBox1.removeAllItems();
        for (Aclass aclass : list) {
            jComboBox1.addItem(aclass.getClassName());
        }
    }

    //画面にIDと名前を表示
    public void showTeacherId(String teacherId, String name) {
        jLabel5.setText(teacherId);
        jLabel7.setText(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("生徒一覧");

        jButton5.setText("検索");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("キーワード");

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

        jButton3.setText("削除");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("戻る");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 51, 0));

        jButton6.setText("多行削除");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "学生ID", "クラス", "名前", "パスワード", "性別"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton7.setText("成績");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setText("クラス別");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel4.setText("先生ID");

        jLabel6.setText("名前");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton5)
                                        .addGap(45, 45, 45)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton9))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton1)
                        .addComponent(jButton3)
                        .addComponent(jButton6))
                    .addComponent(jButton7)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    新規追加画面へ
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        StudentAdd3 sa = new StudentAdd3();
        sa.setClassName(jComboBox1.getSelectedItem().toString());
        sa.setTeacherDate(jLabel5.getText(), jLabel7.getText());
        this.dispose();
        sa.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed
    /*
    編集
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        //Jtable表を値を取得し、編集画面に入れる
        Student student = new Student();

        //getSelectedColumn() 如果未选择行就返回-1
        if (jTable1.getSelectedColumn() != -1) {
            student.setId(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            student.setAclass(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            student.setName(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            student.setPass(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            student.setSex(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());

            StudentAdd3 sa = new StudentAdd3();

            sa.setTeacherDate(jLabel5.getText(), jLabel7.getText());

            sa.setDate(student);

            this.dispose();

            sa.setVisible(true);

        } else {
            jLabel2.setText("データを選択してください！");
        }

    }//GEN-LAST:event_jButton2ActionPerformed
    /*
    管理者画面へ戻る
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        TeachersMeru tm = new TeachersMeru();
        tm.setTeacher(jLabel5.getText(), jLabel7.getText());
        this.dispose();
        tm.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
    /*
    生徒一人一人の成績確認へ
     */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Jdbc jdbc = new Jdbc();
        List<Grade> list = new ArrayList<>();
        GradeDate gd = new GradeDate();

        try {
            jdbc.getDbcom();

            if (jTable1.getSelectedColumn() != -1) {

                list = jdbc.getGrade(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());

                gd.showGrade(list);
                gd.showStudentId(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());

                gd.setVisible(true);

            } else {
                jLabel2.setText("データを選択してください！");
                return;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentsDate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentsDate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (jdbc != null) {
                try {
                    jdbc.closeDbcom();
                } catch (SQLException ex) {
                    Logger.getLogger(TeachersDate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }//GEN-LAST:event_jButton7ActionPerformed
    /*
    削除
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        Jdbc jdbc = new Jdbc();

        try {
            jdbc.getDbcom();

            //学生情報と成績情報を一緒に削除
            jdbc.deleteStudent(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            jdbc.deleteGrade(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            jdbc.deleteStudentUser(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());

            readeStudents();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentsDate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentsDate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (jdbc != null) {
                try {
                    jdbc.closeDbcom();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentsDate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    /*
    生徒一覧でクラス別の生徒を表示
     */
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Jdbc jdbc = new Jdbc();

        List<Student> list = new ArrayList<>();
        try {
            jdbc.getDbcom();

            list = jdbc.selectClass(jComboBox1.getSelectedItem().toString());

            readeStudents(list);

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
    }//GEN-LAST:event_jButton9ActionPerformed
    /*
    検索
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Jdbc jdbc = new Jdbc();
        Student student = new Student();
        List<Student> list = new ArrayList<>();
        //String型をint型にフォーマット
        Pattern p = Pattern.compile("^-?[1-9]\\d*$");
//        Matcher m = p.matcher(num);
        try {
            jdbc.getDbcom();

            if (!jTextField1.getText().isEmpty()) {
                jLabel2.setText("");
                //Stringが数値かを判断
                if (p.matcher((jTextField1.getText())).find()) {
                    if (Integer.parseInt(jTextField1.getText()) >= 0 && Integer.parseInt(jTextField1.getText()) < 10000) {
                        list = jdbc.searchStudentId(Integer.parseInt(jTextField1.getText()));
                        readeStudents(list);
                    } else {
                        jLabel2.setText("IDが長すぎます！");
                        return;
                    }
                } else {
                    //名前、科目、性別（あいまいと特定検索）
                    list = jdbc.searchStudentName(jTextField1.getText());
                    readeStudents(list);
                }

            } else {
                jLabel2.setText("キーワードを入力してください！");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeachersDate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AllStudentsDate.class.getName()).log(Level.SEVERE, null, ex);
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
    /*
    多行削除
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        Jdbc jdbc = new Jdbc();
        try {
            jdbc.getDbcom();

            int[] selection = jTable1.getSelectedRows();
            for (int i = selection.length - 1; i >= 0; i--) {
                jdbc.deleteStudentUser(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentsDate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentsDate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (jdbc != null) {
                try {
                    jdbc.closeDbcom();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentsDate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentsDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsDate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
