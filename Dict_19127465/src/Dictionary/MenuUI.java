/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Dictionary;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author Long Phan
 */
public class MenuUI extends javax.swing.JFrame {
    ArrayList<String> keylogger = new ArrayList<>();
    File datafile = new File("resources/slang.txt");
    
    //Lưu lại dữ liệu để backup
    String backupData;
    
    //Lưu lại dữ liệu để sử dụng
    List<String> storeData;
    String[] slangPart;
    String[] defiPart;
    
    /**
     * Creates new form MenuUI
     */
    public MenuUI() {
        storeData();
        saveData();
        initComponents();
    }
    
    public boolean checkAvailability(String slangWord, ArrayList<String> list){
        for(int i=0; i<list.size(); i++){
            if(slangWord.equals(list.get(i))) {
                list.add(0, slangWord);
                list.remove(i+1);
                return true;
            }
        }
        return false;
    }
    
    public static void messageBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void saveData(){
        backupData = "";
        try {
            Scanner scanner = new Scanner(datafile);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(scanner.hasNextLine()){
                    backupData += line + "\n";
                }
                else backupData += line;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Không thể mở file");
        }
    }
    
    public void storeData() {
        storeData = new ArrayList<String>();
        try {
            Scanner scanner = new Scanner(datafile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                storeData.add(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            int index = 0;
            slangPart = new String[storeData.size()];
            defiPart = new String[storeData.size()];
            String[] SlangWordIndex = new String[2];
            for (String element : storeData) {
                SlangWordIndex = element.split("`");
                slangPart[index] = SlangWordIndex[0];
                defiPart[index] = SlangWordIndex[1];
                index = index + 1;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        historyButton = new javax.swing.JButton();
        processButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        randomButton = new javax.swing.JButton();
        GuessSlang = new javax.swing.JButton();
        GuessDefi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayBoard = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        searchItem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        searchBySlang = new javax.swing.JButton();
        searchByDefiButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        historyButton.setText("Hiển Thị History");
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });

        processButton.setText("Add\\Edit\\Delete");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        randomButton.setText("Random");
        randomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomButtonActionPerformed(evt);
            }
        });

        GuessSlang.setText("Đoán Tìm Từ Slang");
        GuessSlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuessSlangActionPerformed(evt);
            }
        });

        GuessDefi.setText("Đoán Tìm Định Nghĩa");
        GuessDefi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuessDefiActionPerformed(evt);
            }
        });

        jLabel1.setText("Đố Vui");

        displayBoard.setColumns(20);
        displayBoard.setRows(5);
        jScrollPane1.setViewportView(displayBoard);

        jLabel2.setText("Chương Trình Từ Điển");

        jLabel3.setText("Nhập từ Slang Hoặc Định Nghĩa(Definition)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(searchItem)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(randomButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(historyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(GuessDefi)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(GuessSlang)
                        .addGap(104, 104, 104))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(historyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetButton)
                        .addGap(18, 18, 18)
                        .addComponent(randomButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GuessSlang)
                            .addComponent(GuessDefi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        searchBySlang.setText("Tìm theo từ Slang");
        searchBySlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBySlangActionPerformed(evt);
            }
        });

        searchByDefiButton.setText("Tìm theo định nghĩa");
        searchByDefiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByDefiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchBySlang, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(searchByDefiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBySlang)
                    .addComponent(searchByDefiButton))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        displayBoard.setText("");
        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter(datafile, false));
            bw.write(backupData);
            bw.close();
            messageBox("Reset Thành Công!!", "Thông Báo");
        }
        catch (IOException e){
            System.out.println("Không thể ghi file");
        }
    }//GEN-LAST:event_resetButtonActionPerformed

    //Đoán Slang Word dựa trên Definition
    private void GuessSlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuessSlangActionPerformed
        // TODO add your handling code here:

        storeData();
        Random num = new Random();
        try {
            int size = storeData.size();
            int[] index = new int[4];
            for (int i = 0; i < 4; i++) {
                index[i] = num.nextInt(size);
            }

            String[] resultChoice = new String[4];
            for (int i = 0; i < 4; i++) {
                resultChoice[i] = storeData.get(index[i]);
            }

            String[] slangPart = new String[4];
            String[] defiPart = new String[4];

            //Tách Slang với Defi thành 2 phần riêng biệt
            for (int i = 0; i < 4; i++) {
                String[] SlangWordIndex = resultChoice[i].split("`");
                slangPart[i] = SlangWordIndex[0];
                defiPart[i] = SlangWordIndex[1];
            }

            //Chọn 1 đáp án đúng
            Random correctChoiceRand = new Random();
            int correctChoice = correctChoiceRand.nextInt(4);
            String slangCorrectChoice = slangPart[correctChoice];
            String defiCorrectChoice = defiPart[correctChoice];

            //Xáo Trộn Đáp án
            List<String> slangPartList = Arrays.asList(slangPart);
            Collections.shuffle(slangPartList);

            //Nhập Đáp Án vào ô trắc nghiệm
            String[] options = new String[4];
            options[0] = slangPartList.get(0);
            options[1] = slangPartList.get(1);
            options[2] = slangPartList.get(2);
            options[3] = slangPartList.get(3);

            int result = JOptionPane.showOptionDialog(this.getContentPane(), "Định Nghĩa của " + defiCorrectChoice + "?", "Chọn Đáp Án Đúng.",
                    0,
                    JOptionPane.INFORMATION_MESSAGE, null, options, null);
            if (result == 0) {
                if (options[0].equals(slangCorrectChoice)) {
                    JOptionPane.showMessageDialog(rootPane, "Câu Trả Lời Đúng!!!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Câu Trả Lời Sai!!!");
                }
            }
            if (result == 1) {
                if (options[1].equals(slangCorrectChoice)) {
                    JOptionPane.showMessageDialog(rootPane, "Câu Trả Lời Đúng!!!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Câu Trả Lời Sai!!!");
                }
            }
            if (result == 2) {
                if (options[2].equals(slangCorrectChoice)) {
                    JOptionPane.showMessageDialog(rootPane, "Câu Trả Lời Đúng!!!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Câu Trả Lời Sai!!!");
                }
            }
            if (result == 3) {
                if (options[3].equals(slangCorrectChoice)) {
                    JOptionPane.showMessageDialog(rootPane, "Câu Trả Lời Đúng!!!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Câu Trả Lời Sai!!!");
                }
            }

        } catch (Exception e) {
            System.out.println("Mở file không thành công!!");
        }

    }//GEN-LAST:event_GuessSlangActionPerformed

    //Tìm theo Slang Word
    private void searchBySlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBySlangActionPerformed
        // TODO add your handling code here:
        double calculateStartTime = System.currentTimeMillis();
        storeData();
        String checkWord = searchItem.getText();
        displayBoard.setText("");

        if (keylogger.isEmpty()) {
            keylogger.add(0, checkWord);
        } else {
            if (!checkAvailability(checkWord, keylogger)) {
                keylogger.add(0, checkWord);
            }
        }

        for (int i = 0; i < slangPart.length; i++) {

            //Lấy phần slang kiểm tra
            if (slangPart[i].toLowerCase().contains(checkWord.toLowerCase())) {
                String line = storeData.get(i);
                displayBoard.append(line + "\n");
            }
        }

        double calculateEndTime = System.currentTimeMillis();
        double calculateTotalTime = (calculateEndTime - calculateStartTime) / 1000;

        String timeResult = String.valueOf(calculateTotalTime);
        MenuUI.messageBox(timeResult + " seconds", "Thời gian chạy:");

        searchItem.setText("");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("history.txt", false));
            for (String key : keylogger) {
                bw.write(key + System.lineSeparator());
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Không thể ghi file");
        }

    }//GEN-LAST:event_searchBySlangActionPerformed

    //Tìm theo Definition
    private void searchByDefiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByDefiButtonActionPerformed
        // TODO add your handling code here
        double calculateStartTime = System.currentTimeMillis();
        storeData();
        String checkWord = searchItem.getText();
        displayBoard.setText("");

        if (keylogger.isEmpty()) {
            keylogger.add(0, checkWord);
        } else {
            if (!checkAvailability(checkWord, keylogger)) {
                keylogger.add(0, checkWord);
            }
        }

        for (int i = 0; i < defiPart.length; i++) {

            //Lấy phần slang kiểm tra
            if (defiPart[i].toLowerCase().contains(checkWord.toLowerCase())) {
                String line = storeData.get(i);
                displayBoard.append(line + "\n");
            }
        }

        double calculateEndTime = System.currentTimeMillis();
        double calculateTotalTime = (calculateEndTime - calculateStartTime) / 1000;

        String timeResult = String.valueOf(calculateTotalTime);
        MenuUI.messageBox(timeResult + " seconds", "Thời gian chạy:");

        searchItem.setText("");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("history.txt", false));
            for (String key : keylogger) {
                bw.write(key + System.lineSeparator());
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Không thể ghi file");
        }
    }//GEN-LAST:event_searchByDefiButtonActionPerformed

    //Chuyển qua menu chỉnh sửa Slang
    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        // TODO add your handling code here:
        new dictProcess().setVisible(true);
        displayBoard.setText("");
    }//GEN-LAST:event_processButtonActionPerformed

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
        // TODO add your handling code here:
        double calculateStartTime = System.currentTimeMillis();
        displayBoard.setText("Keylogger: \n");
        int index = 0;
        for (String s : keylogger) {
            index++;
            displayBoard.append(index + ": " + s + "\n");
        }
        double calculateEndTime = System.currentTimeMillis();
        double calculateTotalTime = (calculateEndTime - calculateStartTime) / 1000;

        String timeResult = String.valueOf(calculateTotalTime);
        MenuUI.messageBox(timeResult + " seconds", "Thời gian chạy:");
    }//GEN-LAST:event_historyButtonActionPerformed

    //Tạo random slang word
    private void randomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomButtonActionPerformed
        // TODO add your handling code here:
        storeData();
        double calculateStartTime = System.currentTimeMillis();
        Random num = new Random();
        try {
            int size = storeData.size();
            int randomNum = num.nextInt(size);

            String result = storeData.get(randomNum);
            displayBoard.setText("");

            displayBoard.append(result + "\n");

        } catch (Exception e) {
            System.out.println("Mở file không thành công!!");
        }
        double calculateEndTime = System.currentTimeMillis();
        double calculateTotalTime = (calculateEndTime - calculateStartTime) / 1000;

        String timeResult = String.valueOf(calculateTotalTime);
        MenuUI.messageBox(timeResult + " seconds", "Thời gian chạy:");
    }//GEN-LAST:event_randomButtonActionPerformed

    //Đoán definition dựa theo Slang word
    private void GuessDefiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuessDefiActionPerformed
        // TODO add your handling code here:
        storeData();
        Random num = new Random();
        try {
            int size = storeData.size();
            int[] index = new int[4];
            for(int i = 0; i < 4; i++){
                index[i] = num.nextInt(size);
            }
            
            String[] resultChoice = new String[4];
            for(int i = 0; i < 4; i++){
                resultChoice[i] = storeData.get(index[i]);
            }
            

            String[] slangPart = new String[4];
            String[] defiPart = new String[4];
            
            //Tách Slang với Defi thành 2 phần riêng biệt
            for(int i = 0; i < 4; i++){
                String[] SlangWordIndex = resultChoice[i].split("`");
                slangPart[i] = SlangWordIndex[0];
                defiPart[i] = SlangWordIndex[1];
            }
            
            
            //Chọn 1 đáp án đúng
            Random correctChoiceRand = new Random();
            int correctChoice = correctChoiceRand.nextInt(4);
            String slangCorrectChoice = slangPart[correctChoice];
            String defiCorrectChoice = defiPart[correctChoice];
            
            //Xáo Trộn Đáp án
            List<String> defiPartList = Arrays.asList(defiPart);
            Collections.shuffle(defiPartList);
            
            //Nhập Đáp Án vào ô trắc nghiệm
            String[] options = new String[4];
            options[0] = defiPartList.get(0);
            options[1] = defiPartList.get(1);
            options[2] = defiPartList.get(2);
            options[3] = defiPartList.get(3);
            
            
            int result = JOptionPane.showOptionDialog(this.getContentPane(),"Định Nghĩa của " + slangCorrectChoice + "?", "Chọn Đáp Án Đúng.",
                    0,
                    JOptionPane.INFORMATION_MESSAGE, null, options, null);
            if(result == 0){
                  if(options[0].equals(defiCorrectChoice)){
                      JOptionPane.showMessageDialog(rootPane, "Câu Trả Lời Đúng!!!");
                  }
                  else JOptionPane.showMessageDialog(rootPane, "Câu Trả Lời Sai!!!");
            }
            if(result == 1){
                  if(options[1].equals(defiCorrectChoice)){
                      JOptionPane.showMessageDialog(rootPane, "Câu Trả Lời Đúng!!!");
                  }
                  else JOptionPane.showMessageDialog(rootPane, "Câu Trả Lời Sai!!!");
            }
            if(result == 2){
                  if(options[2].equals(defiCorrectChoice)){
                      JOptionPane.showMessageDialog(rootPane, "Câu Trả Lời Đúng!!!");
                  }
                  else JOptionPane.showMessageDialog(rootPane, "Câu Trả Lời Sai!!!");
            }
            if(result == 3){
                  if(options[3].equals(defiCorrectChoice)){
                      JOptionPane.showMessageDialog(rootPane, "Câu Trả Lời Đúng!!!");
                  }
                  else JOptionPane.showMessageDialog(rootPane, "Câu Trả Lời Sai!!!");
            }
            
            } catch (Exception e) {
                System.out.println("Mở file không thành công!!");
            }
    }//GEN-LAST:event_GuessDefiActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuessDefi;
    private javax.swing.JButton GuessSlang;
    private javax.swing.JTextArea displayBoard;
    private javax.swing.JButton historyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processButton;
    private javax.swing.JButton randomButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton searchByDefiButton;
    private javax.swing.JButton searchBySlang;
    private javax.swing.JTextField searchItem;
    // End of variables declaration//GEN-END:variables
}
