
package com.defence.defencesystemoop;

import java.util.ArrayList;
import java.util.List;



public class Maincontrol extends javax.swing.JFrame implements Subject{
    
    private List<Observer> observers = new ArrayList<>();
    
   Submarine subwindow;
   Tank tankwindow;
   Helicopter heliwindow;
   
    
   
public void attach(Observer o) {
    observers.add(o);
}


public void detach(Observer o) {
    observers.remove(o);
}

public void notifyObservers(String Areaclear) {
    for (Observer o : observers) {
        o.update(Areaclear); 
    }
}

public void updatemessagemainheli(String messagefromheli){
    jTextArea1.append("Helicopter : "+messagefromheli + "\n");
}

public void updatemessagemainsub(String messagefromsub){
    jTextArea1.append("Submarine : "+messagefromsub + "\n");
}

public void updatemessagemaintank(String messagefromtank){
    jTextArea1.append("Tank : "+messagefromtank + "\n");
}


    public Maincontrol() {
        initComponents();
        setTitle("Main Controller");
        
    slider1.setMinimum(0);                
    slider1.setMaximum(100);       
    slider1.setMajorTickSpacing(20);  
    slider1.setPaintTicks(true);     
    slider1.setPaintLabels(true);     
                    
        
        heliwindow = new Helicopter(this);
        attach(heliwindow);  
        heliwindow.setVisible(true);
        
        tankwindow = new Tank(this);
        attach(tankwindow);
        tankwindow.setVisible(true);
        
        subwindow = new Submarine(this);
        attach(subwindow);
        subwindow.setVisible(true);
        
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (jCheckBox1.isSelected()) {
            notifyObservers("AREA_CLEARED");  
        } else {
            notifyObservers("AREA_NOT_CLEARED");
        }
        }
        });
        
        slider1.setValue(0);
        
         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        slider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCheckBox1.setText("Area Cleared");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        slider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider1StateChanged(evt);
            }
        });

        jLabel1.setText("Position");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(slider1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String text = jTextField1.getText();
        subwindow.updatemessage(text);
        tankwindow.updatemessage(text);
        heliwindow.updatemessage(text);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void slider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider1StateChanged
        int value = slider1.getValue();
        if(value>=20){
            heliwindow.setenableshoot(true);
            subwindow.setenableshoot(true);
            tankwindow.setenableshoot(true);
            
        }else{
            heliwindow.setenableshoot(false);
            subwindow.setenableshoot(false);
            tankwindow.setenableshoot(false);
           
        }
        if(value>=60){
            heliwindow.setenablemissile(true);
            subwindow.setenablemissile(true);
            tankwindow.setenablemissile(true);
            
        }else{
            heliwindow.setenablemissile(false);
            subwindow.setenablemissile(false);
            tankwindow.setenablemissile(false);
           
        }
        if(value>=80){
            heliwindow.setenablebtn(true);
            subwindow.setenablebtn(true);
            tankwindow.setenablebtn(true);
            
        }else{
            heliwindow.setenablebtn(false);
            subwindow.setenablebtn(false);
            tankwindow.setenablebtn(false);
           
        }
         if(value==100){
            heliwindow.setenablebtn2(true);
            subwindow.setenablebtn2(true);
            tankwindow.setenablebtn2(true);
            
        }else{
            heliwindow.setenablebtn2(false);
            subwindow.setenablebtn2(false);
            tankwindow.setenablebtn2(false);
           
        }
        
    }//GEN-LAST:event_slider1StateChanged

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maincontrol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JSlider slider1;
    // End of variables declaration//GEN-END:variables
}
