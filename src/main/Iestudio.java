package main;

import java.awt.Image;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NoeOGM
 */
public class Iestudio extends javax.swing.JInternalFrame {
    
    String imgConcepto; 
    Image img;
    String idSubtema;
    principal fmain;
    public Iestudio(principal fmain) {
        this.fmain= fmain;
        //Extraer la imagen del Concepto
//        imgConcepto = (String)fmain.getTBLsubtema().getValueAt(0,5);
          String pathImages="images/";
          imgConcepto = pathImages+"bg_blanco.png";
          initComponents();
        //Extraer ruta de la imagen desde la base de datos
        
        //Extraer el id del subtema desde el Iagendar por medio del constructor
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaConcepto = new javax.swing.JTextArea();
        panImgConcept = new background(this.imgConcepto);
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaPregunta = new javax.swing.JTextArea();
        pnlImgPreg = new javax.swing.JPanel();
        rbtnOpt1 = new javax.swing.JRadioButton();
        rbtnOpt2 = new javax.swing.JRadioButton();
        rbtnOpt3 = new javax.swing.JRadioButton();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                start(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        txtaConcepto.setBackground(java.awt.Color.lightGray);
        txtaConcepto.setColumns(20);
        txtaConcepto.setRows(5);
        jScrollPane1.setViewportView(txtaConcepto);

        javax.swing.GroupLayout panImgConceptLayout = new javax.swing.GroupLayout(panImgConcept);
        panImgConcept.setLayout(panImgConceptLayout);
        panImgConceptLayout.setHorizontalGroup(
            panImgConceptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );
        panImgConceptLayout.setVerticalGroup(
            panImgConceptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(panImgConcept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(148, 148, 148))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(panImgConcept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab(" ", jPanel1);

        txtaPregunta.setBackground(java.awt.Color.lightGray);
        txtaPregunta.setColumns(20);
        txtaPregunta.setRows(5);
        jScrollPane2.setViewportView(txtaPregunta);

        javax.swing.GroupLayout pnlImgPregLayout = new javax.swing.GroupLayout(pnlImgPreg);
        pnlImgPreg.setLayout(pnlImgPregLayout);
        pnlImgPregLayout.setHorizontalGroup(
            pnlImgPregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        pnlImgPregLayout.setVerticalGroup(
            pnlImgPregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );

        rbtnOpt1.setText("Opcion 1");

        rbtnOpt2.setText("Opcion 2");

        rbtnOpt3.setText("Opcion 3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jScrollPane2)
                .addGap(68, 68, 68))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(pnlImgPreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnOpt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbtnOpt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbtnOpt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(376, 376, 376)))
                .addGap(205, 205, 205))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlImgPreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(rbtnOpt1)
                .addGap(18, 18, 18)
                .addComponent(rbtnOpt2)
                .addGap(18, 18, 18)
                .addComponent(rbtnOpt3)
                .addGap(49, 49, 49))
        );

        jTabbedPane1.addTab(" ", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void start(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_start
    //Extraer titulo     
    //Extraer el concepto
        txtaConcepto.setText((String)fmain.getTBLsubtema().getValueAt(0,3)+"\n\n"+(String)fmain.getTBLsubtema().getValueAt(0,4));
        
        //Extraer pregunta
        //Eliminar la segunda inicializacion de dataPRegunta
        String dataPregunta= (String)fmain.getTBLsubtema().getValueAt(0,6);
        dataPregunta="lkjaslkdjflasdfl;asjdfalsd\n"
                + "opt1;alksjdfla\n"
                + "opt2lkjalsjdflajsdlfja\n"
                + "opt3ljljsdlkfasd\n";
        String lines[] = dataPregunta.split("\\r?\\n");
        String pregunta=lines[0];
        String opt1=lines[1];
        String opt2=lines[2];
        String opt3=lines[3];
        this.txtaPregunta.setText(pregunta);
        this.rbtnOpt1.setText(opt1);
        this.rbtnOpt2.setText(opt2);
        this.rbtnOpt3.setText(opt3);

    }//GEN-LAST:event_start


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panImgConcept;
    private javax.swing.JPanel pnlImgPreg;
    private javax.swing.JRadioButton rbtnOpt1;
    private javax.swing.JRadioButton rbtnOpt2;
    private javax.swing.JRadioButton rbtnOpt3;
    private javax.swing.JTextArea txtaConcepto;
    private javax.swing.JTextArea txtaPregunta;
    // End of variables declaration//GEN-END:variables
}
