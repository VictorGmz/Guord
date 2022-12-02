/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author victo
 */
public class Vista extends javax.swing.JFrame {


    public Vista() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelSliderV = new javax.swing.JPanel();
        PanelSliderH = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        PanelScrollBar = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PanelSliderVLayout = new javax.swing.GroupLayout(PanelSliderV);
        PanelSliderV.setLayout(PanelSliderVLayout);
        PanelSliderVLayout.setHorizontalGroup(
            PanelSliderVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        PanelSliderVLayout.setVerticalGroup(
            PanelSliderVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        getContentPane().add(PanelSliderV, java.awt.BorderLayout.PAGE_START);

        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);

        javax.swing.GroupLayout PanelSliderHLayout = new javax.swing.GroupLayout(PanelSliderH);
        PanelSliderH.setLayout(PanelSliderHLayout);
        PanelSliderHLayout.setHorizontalGroup(
            PanelSliderHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSliderHLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(863, Short.MAX_VALUE))
            .addGroup(PanelSliderHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelSliderHLayout.createSequentialGroup()
                    .addGap(252, 252, 252)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(145, Short.MAX_VALUE)))
        );
        PanelSliderHLayout.setVerticalGroup(
            PanelSliderHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSliderHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(PanelSliderHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelSliderHLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(395, Short.MAX_VALUE)))
        );

        getContentPane().add(PanelSliderH, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout PanelScrollBarLayout = new javax.swing.GroupLayout(PanelScrollBar);
        PanelScrollBar.setLayout(PanelScrollBarLayout);
        PanelScrollBarLayout.setHorizontalGroup(
            PanelScrollBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelScrollBarLayout.createSequentialGroup()
                .addContainerGap(829, Short.MAX_VALUE)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        PanelScrollBarLayout.setVerticalGroup(
            PanelScrollBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelScrollBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(PanelScrollBar, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelScrollBar;
    private javax.swing.JPanel PanelSliderH;
    private javax.swing.JPanel PanelSliderV;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    // End of variables declaration//GEN-END:variables
}
