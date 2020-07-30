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

/**
 *
 * @author geng9516
 */
public class GradeAdd extends javax.swing.JFrame {

    /**
     * Creates new form GradeAdd
     */
    public GradeAdd() {
        initComponents();
    }

    //編集時のデータを各欄に表示する
    public void setGradeAdd(Grade grade) {
        jTextField1.setText(String.valueOf(grade.getStudentid()));
//        jTextField1.setEditable(false);

        //中間テストならjRadioButton1を選択、期末テストならjRadioButton2を選択
        if ("中間テスト".equals(grade.getTest())) {
            jRadioButton1.setSelected(true);
        } else if ("期末テスト".equals(grade.getTest())) {
            jRadioButton2.setSelected(true);
        }

        jTextField2.setText(String.valueOf(grade.getKokugo()));
        jTextField3.setText(String.valueOf(grade.getMath()));
        jTextField4.setText(String.valueOf(grade.getEnglish()));
        jTextField5.setText(String.valueOf(grade.getScience()));
        jTextField6.setText(String.valueOf(grade.getHistory()));
    }

    //新規時に学生IDを自動表示する
    public void setStudentId(String studentId) {
        jTextField1.setEditable(false);
        jTextField1.setText(studentId);

    }
//jLabel1にクラスか名前をset、判断用
    public void setStudentName(String name) {
        //クラス毎成績確認するとき、成績編集のID欄を編集できないようにする
        if (jTextField2.getText().isEmpty()) {
            jLabel1.setText(name);
            jLabel1.setVisible(false);
        } else {
            jTextField1.setEditable(false);
            jLabel1.setText(name);
            jLabel1.setVisible(false);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("成績追加/編集");

        jLabel2.setText("国語");

        jLabel3.setText("数学");

        jLabel4.setText("英語");

        jLabel5.setText("理科");

        jLabel6.setText("歴史");

        jLabel7.setForeground(new java.awt.Color(255, 51, 0));

        jLabel8.setText("生徒ID");

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

        jButton3.setText("キャンセル");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("中間テスト");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("期末テスト");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jRadioButton1)
                        .addGap(2, 2, 2)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    新規追加
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Grade grade = new Grade();
        GradeDate gd = new GradeDate();
        List<Student> list = new ArrayList<>();
        List<Grade> list2 = new ArrayList<>();

        Jdbc jdbc = new Jdbc();

        try {
            jdbc.getDbcom();

            if (!jLabel1.getText().contains("クラス")) {

                if (Integer.parseInt(jTextField1.getText().substring(1)) < 1000 || Integer.parseInt(jTextField1.getText().substring(1)) >= 10000) {
                    jLabel7.setText("生徒IDは1001〜9999以内です！");
                    return;
                } else {
                    grade.setStudentid(jTextField1.getText());
                }

                if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
                    jLabel7.setText("テストの種類を選んでください！");
                    return;
                }
                //このテストもう入力したかを判断
                if (jRadioButton1.isSelected()) {
                    if (jdbc.checkTestType(jRadioButton1.getText(), jTextField1.getText())) {
                        jLabel7.setText("中間テストのデータすでにあります！");
                        return;
                    } else {
                        grade.setTest(jRadioButton1.getText());
                    }

                } else {
                    if (jdbc.checkTestType(jRadioButton2.getText(), jTextField1.getText())) {
                        jLabel7.setText("期末テストのデータすでにあります！");
                        return;
                    } else {
                        grade.setTest(jRadioButton2.getText());
                    }
                }
                if (jTextField2.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField2.getText()) < 0 || Double.parseDouble(jTextField2.getText()) > 100) {
                    jLabel7.setText("国語の値は0～100以内です！");
                    return;
                } else {
                    grade.setKokugo(Double.parseDouble(jTextField2.getText()));
                }

                if (jTextField3.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField3.getText()) < 0 || Double.parseDouble(jTextField3.getText()) > 100) {
                    jLabel7.setText("数学の値は0～100以内です！");
                    return;
                } else {
                    grade.setMath(Double.parseDouble(jTextField3.getText()));
                }

                if (jTextField4.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField4.getText()) < 0 || Double.parseDouble(jTextField4.getText()) > 100) {
                    jLabel7.setText("英語の値は0～100以内です！");
                    return;
                } else {
                    grade.setEnglish(Double.parseDouble(jTextField4.getText()));
                }

                if (jTextField5.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField5.getText()) < 0 || Double.parseDouble(jTextField5.getText()) > 100) {
                    jLabel7.setText("理科の値は0～100以内です！");
                    return;
                } else {
                    grade.setScience(Double.parseDouble(jTextField5.getText()));
                }

                if (jTextField6.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField6.getText()) < 0 || Double.parseDouble(jTextField6.getText()) > 100) {
                    jLabel7.setText("歴史の値は0～100以内です！");
                    return;
                } else {
                    grade.setHistory(Double.parseDouble(jTextField6.getText()));
                }

                //成績を挿入
                jdbc.insertGrade(grade);

                if (!jLabel1.getText().contains("クラス")) {

                    gd.readGrade(jTextField1.getText());

                    gd.showStudentDate(jTextField1.getText(), jLabel1.getText());
                    this.dispose();
                    gd.setVisible(true);
                } else if (jLabel1.getText().contains("クラス")) {
                    list = jdbc.selectClass(jLabel1.getText());
                    for (Student student : list) {
                        list2 = jdbc.selectGrade(student.getId());
                    }
                    gd.showGrade(list2);
                    //クラス名を返す
                    gd.showClassName(jLabel1.getText());
                    this.dispose();
                    gd.setVisible(true);
                }

                //クラス毎のほう
            } else if (jLabel1.getText().contains("クラス")) {

                if (jLabel1.getText().substring(0, 1) != jTextField1.getText().substring(0, 1)) {
                    jLabel7.setText(jLabel1.getText() + "の生徒IDを入力してください！");
                    return;
                } else if (Integer.parseInt(jTextField1.getText().substring(1)) < 1000 || Integer.parseInt(jTextField1.getText().substring(1)) >= 10000) {
                    jLabel7.setText("生徒IDは1001〜9999以内です！");
                    return;
                } else {
                    grade.setStudentid(jTextField1.getText());
                }

                if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
                    jLabel7.setText("テストの種類を選んでください！");
                    return;
                }
                //このテストもう入力したかを判断
                if (jRadioButton1.isSelected()) {
                    if (jdbc.checkTestType(jRadioButton1.getText(), jTextField1.getText())) {
                        jLabel7.setText("中間テストのデータすでにあります！");
                        return;
                    } else {
                        grade.setTest(jRadioButton1.getText());
                    }

                } else {
                    if (jdbc.checkTestType(jRadioButton2.getText(), jTextField1.getText())) {
                        jLabel7.setText("期末テストのデータすでにあります！");
                        return;
                    } else {
                        grade.setTest(jRadioButton2.getText());
                    }
                }
                if (jTextField2.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField2.getText()) < 0 || Double.parseDouble(jTextField2.getText()) > 100) {
                    jLabel7.setText("国語の値は0～100以内です！");
                    return;
                } else {
                    grade.setKokugo(Double.parseDouble(jTextField2.getText()));
                }

                if (jTextField3.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField3.getText()) < 0 || Double.parseDouble(jTextField3.getText()) > 100) {
                    jLabel7.setText("数学の値は0～100以内です！");
                    return;
                } else {
                    grade.setMath(Double.parseDouble(jTextField3.getText()));
                }

                if (jTextField4.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField4.getText()) < 0 || Double.parseDouble(jTextField4.getText()) > 100) {
                    jLabel7.setText("英語の値は0～100以内です！");
                    return;
                } else {
                    grade.setEnglish(Double.parseDouble(jTextField4.getText()));
                }

                if (jTextField5.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField5.getText()) < 0 || Double.parseDouble(jTextField5.getText()) > 100) {
                    jLabel7.setText("理科の値は0～100以内です！");
                    return;
                } else {
                    grade.setScience(Double.parseDouble(jTextField5.getText()));
                }

                if (jTextField6.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField6.getText()) < 0 || Double.parseDouble(jTextField6.getText()) > 100) {
                    jLabel7.setText("歴史の値は0～100以内です！");
                    return;
                } else {
                    grade.setHistory(Double.parseDouble(jTextField6.getText()));
                }
                //成績を挿入
                jdbc.insertGrade(grade);
                list = jdbc.selectClass(jLabel1.getText());
                for (Student student : list) {
                    list2 = jdbc.selectGrade(student.getId());
                }
                gd.showGrade(list2);
                //クラス名を返す
                gd.showClassName(jLabel1.getText());
                this.dispose();
                gd.setVisible(true);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GradeAdd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GradeAdd.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (jdbc != null) {
                try {
                    jdbc.closeDbcom();
                } catch (SQLException ex) {
                    Logger.getLogger(TeachersDate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed
    /*
    編集grade
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Grade grade = new Grade();
        GradeDate gd = new GradeDate();
        List<Student> list = new ArrayList<>();
        List<Grade> list2 = new ArrayList<>();

        Jdbc jdbc = new Jdbc();

        try {
            jdbc.getDbcom();

            if (!jLabel1.getText().contains("クラス")) {

                if (Integer.parseInt(jTextField1.getText().substring(1)) < 1000 || Integer.parseInt(jTextField1.getText().substring(1)) >= 10000) {
                    jLabel7.setText("生徒IDは1001〜9999以内です！");
                    return;
                } else {
                    grade.setStudentid(jTextField1.getText());
                }

                if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
                    jLabel7.setText("テストの種類を選んでください！");
                    return;
                }
                if (jRadioButton1.isSelected()) {
                    grade.setTest(jRadioButton1.getText());

                } else {
                    grade.setTest(jRadioButton2.getText());

                }

                if (jTextField2.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField2.getText()) < 0 || Double.parseDouble(jTextField2.getText()) > 100) {
                    jLabel7.setText("国語の値は0～100以内です！");
                    return;
                } else {
                    grade.setKokugo(Double.parseDouble(jTextField2.getText()));
                }

                if (jTextField3.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField3.getText()) < 0 || Double.parseDouble(jTextField3.getText()) > 100) {
                    jLabel7.setText("数学の値は0～100以内です！");
                    return;
                } else {
                    grade.setMath(Double.parseDouble(jTextField3.getText()));
                }

                if (jTextField4.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField4.getText()) < 0 || Double.parseDouble(jTextField4.getText()) > 100) {
                    jLabel7.setText("英語の値は0～100以内です！");
                    return;
                } else {
                    grade.setEnglish(Double.parseDouble(jTextField4.getText()));
                }

                if (jTextField5.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField5.getText()) < 0 || Double.parseDouble(jTextField5.getText()) > 100) {
                    jLabel7.setText("理科の値は0～100以内です！");
                    return;
                } else {
                    grade.setScience(Double.parseDouble(jTextField5.getText()));
                }

                if (jTextField6.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField6.getText()) < 0 || Double.parseDouble(jTextField6.getText()) > 100) {
                    jLabel7.setText("歴史の値は0～100以内です！");
                    return;
                } else {
                    grade.setHistory(Double.parseDouble(jTextField6.getText()));
                }

                jdbc.updateGrade(grade);

                //成績画面を更新
                gd.readGrade(jTextField1.getText());
                //名前
                gd.showStudentDate(jTextField1.getText(), jLabel1.getText());

                this.dispose();
                gd.setVisible(true);

            } else if (jLabel1.getText().contains("クラス")) {

                if (Integer.parseInt(jTextField1.getText().substring(1)) < 1000 || Integer.parseInt(jTextField1.getText().substring(1)) >= 10000) {
                    jLabel7.setText("生徒IDは1001〜9999以内です！");
                    return;
                } else {
                    grade.setStudentid(jTextField1.getText());
                }

                if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
                    jLabel7.setText("テストの種類を選んでください！");
                    return;
                }
                if (jRadioButton1.isSelected()) {
                    grade.setTest(jRadioButton1.getText());

                } else {
                    grade.setTest(jRadioButton2.getText());

                }

                if (jTextField2.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField2.getText()) < 0 || Double.parseDouble(jTextField2.getText()) > 100) {
                    jLabel7.setText("国語の値は0～100以内です！");
                    return;
                } else {
                    grade.setKokugo(Double.parseDouble(jTextField2.getText()));
                }

                if (jTextField3.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField3.getText()) < 0 || Double.parseDouble(jTextField3.getText()) > 100) {
                    jLabel7.setText("数学の値は0～100以内です！");
                    return;
                } else {
                    grade.setMath(Double.parseDouble(jTextField3.getText()));
                }

                if (jTextField4.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField4.getText()) < 0 || Double.parseDouble(jTextField4.getText()) > 100) {
                    jLabel7.setText("英語の値は0～100以内です！");
                    return;
                } else {
                    grade.setEnglish(Double.parseDouble(jTextField4.getText()));
                }

                if (jTextField5.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField5.getText()) < 0 || Double.parseDouble(jTextField5.getText()) > 100) {
                    jLabel7.setText("理科の値は0～100以内です！");
                    return;
                } else {
                    grade.setScience(Double.parseDouble(jTextField5.getText()));
                }

                if (jTextField6.getText().isEmpty()) {
                    jLabel7.setText("データ入力してください！");
                    return;
                } else if (Double.parseDouble(jTextField6.getText()) < 0 || Double.parseDouble(jTextField6.getText()) > 100) {
                    jLabel7.setText("歴史の値は0～100以内です！");
                    return;
                } else {
                    grade.setHistory(Double.parseDouble(jTextField6.getText()));
                }

                jdbc.updateGrade(grade);
                list = jdbc.selectClass(jLabel1.getText());
                for (Student student : list) {
                    list2 = jdbc.selectGrade(student.getId());
                }
                gd.showGrade(list2);
                //クラス名を返す
                gd.showClassName(jLabel1.getText());
                this.dispose();
                gd.setVisible(true);

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GradeAdd.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(GradeAdd.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (jdbc != null) {
                try {
                    jdbc.closeDbcom();

                } catch (SQLException ex) {
                    Logger.getLogger(TeachersDate.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    /*
    キャンセル
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Jdbc jdbc = new Jdbc();
        List<Student> list = new ArrayList<>();
        List<Grade> list2 = new ArrayList<>();
        try {
            jdbc.getDbcom();
            //クラスを含まないなら
            if (!jLabel1.getText().contains("クラス")) {
                GradeDate gd = new GradeDate();
                gd.readGrade(jTextField1.getText());
                //名前と生徒IDを返す
                gd.showStudentDate(jTextField1.getText(), jLabel1.getText());
                this.dispose();
                gd.setVisible(true);
                //クラスを含むなら
            } else if (jLabel1.getText().contains("クラス")) {
                GradeDate gd = new GradeDate();
                //クラスごとの生徒データを取得
                list = jdbc.selectClass(jLabel1.getText());
                for (Student student : list) {
                    list2 = jdbc.selectGrade(student.getId());
                }
                gd.showGrade(list2);
                //クラス名を返す
                gd.showClassName(jLabel1.getText());
                this.dispose();
                gd.setVisible(true);

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GradeAdd.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(GradeAdd.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (jdbc != null) {
                try {
                    jdbc.closeDbcom();

                } catch (SQLException ex) {
                    Logger.getLogger(TeachersDate.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(GradeAdd.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeAdd.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeAdd.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeAdd.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}
