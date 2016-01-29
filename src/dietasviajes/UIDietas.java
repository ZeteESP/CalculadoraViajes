/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dietasviajes;

import java.text.DecimalFormat;

/**
 *
 * @author AGRAUL
 */
public class UIDietas extends javax.swing.JFrame {

    /**
     * Creates new form UIDietas
     */
    public UIDietas() {
        initComponents();
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
        desplegablePais = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        duracion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        personas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cAloj = new javax.swing.JLabel();
        cManu = new javax.swing.JLabel();
        cTotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Coste Viajes");

        desplegablePais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "España", "Reino Unido", "Alemania", "Francia", "Italia", "Estados Unidos", "Suecia", "Suiza", "Austria", "Noruega", "Países Bajos", "Polonia", "Portugal", "Canadá", "Finlandia", "China", "Japón", "India", "Irlanda", "Dinamarca", "Bélgica", "Luxemburgo", "Mexico", "Andorra", "Angola", "Arabia Saudita", "Argelia", "Argentina", "Australia", "Bolivia", "Bosnia-Herzegovina", "Brasil", "Bulgaria", "Camerún", "Chile", "Colombia", "Corea", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "R.Dominicana", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eslovaquia", "Etiopía", "Filipinas", "Gabón", "Ghana", "Grecia", "Guatemala", "Guinea Ecuatorial", "Haití", "Honduras", "Hong Kong", "Hungría", "Indonesia", "Irak", "Iran", "Israel", "Italia", "Jamaica", "Jordania", "Kenia", "Kuwait", "Líbano", "Libia", "Malasia", "Malta", "Marruecos", "Mauritania", "Mozambique", "Nicaragua", "Nigeria", "Nueva Zelanda", "Pakistán", "Panamá", "Paraguay", "Perú", "República Checa", "Rumania", "Rusia", "Senegal", "Singapur", "Siria", "Sudáfrica", "Tailandia", "Taiwán", "Tanzania", "Túnez", "Turquía", "Uruguay", "Venezuela", "Yemen", "Yugoslavia", "Zaire/Congo", "Zimbawe", "Resto del Mundo" }));

        jLabel1.setText("Indique duración viaje en días:");

        jLabel2.setText("Seleccione país de destino:");

        duracion.setText("1");
        duracion.setMinimumSize(new java.awt.Dimension(30, 20));
        duracion.setPreferredSize(new java.awt.Dimension(30, 25));

        jLabel3.setText("Indique nº de personas:");

        personas.setText("1");
        personas.setMinimumSize(new java.awt.Dimension(30, 20));
        personas.setPreferredSize(new java.awt.Dimension(30, 25));

        jButton1.setText("Calcular Coste");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Calculadora Coste Viajes Investigación");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\agraul\\Documents\\NetBeansProjects\\DietasViajes\\images\\logo_FCRB.gif")); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\agraul\\Documents\\NetBeansProjects\\DietasViajes\\images\\Idibaps.jpg")); // NOI18N

        cAloj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cAloj.setText("jLabel7");

        cManu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cManu.setText("jLabel8");

        cTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cTotal.setText("jLabel9");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("Datos del Real Decreto 462/2002 a fecha de 30/10/2015 dev A.Grau v1.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cTotal)
                    .addComponent(cManu)
                    .addComponent(cAloj)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(desplegablePais, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(personas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(jLabel4))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(desplegablePais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(personas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cAloj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cManu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double icAloj = 0;
        double icManu = 0;
        DecimalFormat df = new DecimalFormat("#.##");

        switch (desplegablePais.getSelectedIndex()) {

            case 0:
                //España
                icAloj = 65.97;
                icManu = 37.40;
                break;
            case 1:
                //Reino Unido
                icAloj = 156.86;
                icManu = 82.94;
                break;

            case 2:
                //Alemania
                icAloj = 132.82;
                icManu = 59.50;
                break;
            case 3:
                //Francia
                icAloj = 122.61;
                icManu = 65.51;
                break;
            case 4:
                //Italia
                icAloj = 131.02;
                icManu = 63.11;
                break;
            case 5:
                //Estados Unidos
                icAloj = 143.04;
                icManu = 69.72;
                break;
            case 6:
                //Suecia
                icAloj = 147.25;
                icManu = 75.13;
                break;
            case 7:
                //Suiza
                icAloj = 148.45;
                icManu = 61.30;
                break;
            case 8:
                //Austria
                icAloj = 95.56;
                icManu = 58.9;
                break;
            case 9:
                //Noruega
                icAloj = 132.82;
                icManu = 80.54;
                break;
            case 10:
                //Países Bajos
                icAloj = 126.81;
                icManu = 64.31;
                break;
            case 11:
                //Polonia
                icAloj = 99.77;
                icManu = 42.67;
                break;
            case 12:
                //Portugal
                icAloj = 97.36;
                icManu = 43.87;
                break;
            case 13:
                //Canada
                icAloj = 94.36;
                icManu = 51.09;
                break;
            case 14:
                //Finlandia
                icAloj = 114.79;
                icManu = 65.51;
                break;
            case 15:
                //China
                icAloj = 71.52;
                icManu = 46.28;
                break;
            case 16:
                //Japón
                icAloj = 159.87;
                icManu = 96.76;
                break;
            case 17:
                //India
                icAloj = 99.77;
                icManu = 38.46;
                break;
            case 18:
                //Irlanda
                icAloj = 93.16;
                icManu = 48.08;
                break;
            case 19:
                //Dinamarca
                icAloj = 122.61;
                icManu = 64.91;
                break;
            case 20:
                //Belgica
                icAloj = 148.45;
                icManu = 82.94;
                break;
            case 21:
                //Luxemburgo
                icAloj = 135.93;
                icManu = 55.89;
                break;
            case 22:
                //Mexico
                icAloj = 81.74;
                icManu = 43.27;
                break;
            case 23:
                //Andorra
                icAloj = 46.88;
                icManu = 37.86;
                break;
            case 24:
                //Angola
                icAloj = 135.23;
                icManu = 59.50;
                break;
            case 25:
                //Arabia Saudita
                icAloj = 73.92;
                icManu = 54.09;
                break;
            case 26:
                //Argelia
                icAloj = 101.57;
                icManu = 44.47;
                break;
            case 27:
                //Argentina
                icAloj = 111.19;
                icManu = 55.29;
                break;
            case 28:
                //Australia
                icAloj = 81.14;
                icManu = 51.09;
                break;
            case 29:
                //Bolivia
                icAloj = 51.09;
                icManu = 36.66;
                break;
            case 30:
                //Bosnia Herzegovina
                icAloj = 72.72;
                icManu = 49.88;
                break;
            case 31:
                //Brasil
                icAloj = 128.02;
                icManu = 79.33;
                break;
            case 32:
                //Bulgaria
                icAloj = 53.49;
                icManu = 37.86;
                break;
            case 33:
                //Camerun
                icAloj = 88.35;
                icManu = 48.68;
                break;
            case 34:
                //Chile
                icAloj = 102.17;
                icManu = 50.49;
                break;
            case 35:
                //Colombia
                icAloj = 123.81;
                icManu = 78.13;
                break;
            case 36:
                //Corea
                icAloj = 102.17;
                icManu = 55.29;
                break;
            case 37:
                //Costa de Marfil
                icAloj = 61.30;
                icManu = 49.28;
                break;
            case 38:
                //Costa Rica
                icAloj = 65.51;
                icManu = 44.47;
                break;
            case 39:
                //Croacia
                icAloj = 72.72;
                icManu = 49.88;
                break;
            case 40:
                //Cuba
                icAloj = 56.50;
                icManu = 36.06;
                break;
            case 41:
                //Republica Dominicana
                icAloj = 64.31;
                icManu = 36.66;
                break;
            case 42:
                //Ecuador
                icAloj = 64.91;
                icManu = 43.27;
                break;
            case 43:
                //Egipto
                icAloj = 91.35;
                icManu = 39.07;
                break;
            case 44:
                //El Salvador
                icAloj = 66.11;
                icManu = 43.27;
                break;
            case 45:
                //Emitaros Arabes Unidos
                icAloj = 101.57;
                icManu = 56.50;
                break;
            case 46:
                //Eslovaquia
                icAloj = 75.73;
                icManu = 43.27;
                break;
            case 47:
                //Etiopia
                icAloj = 119.60;
                icManu = 37.86;
                break;
            case 48:
                //Filipinas
                icAloj = 71.52;
                icManu = 39.67;
                break;
            case 49:
                //Gabon
                icAloj = 100.37;
                icManu = 52.89;
                break;
            case 50:
                //Ghana
                icAloj = 66.71;
                icManu = 37.26;
                break;
            case 51:
                //Grecia
                icAloj = 69.12;
                icManu = 39.07;
                break;
            case 52:
                //Guatemala
                icAloj = 89.55;
                icManu = 42.67;
                break;
            case 53:
                //Guinea Ecuatorial
                icAloj = 87.75;
                icManu = 50.49;
                break;
            case 54:
                //Haití
                icAloj = 45.08;
                icManu = 37.86;
                break;
            case 55:
                //Honduras
                icAloj = 69.72;
                icManu = 42.07;
                break;
            case 56:
                //Hong Kong
                icAloj = 121.40;
                icManu = 51.69;
                break;
            case 57:
                //Hungría
                icAloj = 115.39;
                icManu = 46.28;
                break;
            case 58:
                //Indonesia
                icAloj = 102.17;
                icManu = 42.67;
                break;
            case 59:
                //Irak
                icAloj = 66.11;
                icManu = 39.07;
                break;
            case 60:
                //Iran
                icAloj = 80.54;
                icManu = 44.47;
                break;
            case 61:
                //Israel
                icAloj = 92.56;
                icManu = 56.50;
                break;
            case 62:
                //Italia
                icAloj = 131.02;
                icManu = 63.11;
                break;
            case 63:
                //Jamaica
                icAloj = 76.93;
                icManu = 46.28;
                break;
            case 64:
                //Jordania
                icAloj = 93.16;
                icManu = 42.67;
                break;
            case 65:
                //Kenia
                icAloj = 82.34;
                icManu = 39.67;
                break;
            case 66:
                //Kuwait
                icAloj = 122.61;
                icManu = 44.47;
                break;
            case 67:
                //Libano
                icAloj = 115.39;
                icManu = 34.86;
                break;
            case 68:
                //Libia
                icAloj = 102.17;
                icManu = 54.69;
                break;
            case 69:
                //Malasia
                icAloj = 91.95;
                icManu = 34.26;
                break;
            case 70:
                //Malta
                icAloj = 46.28;
                icManu = 31.85;
                break;
            case 71:
                //Marruecos
                icAloj = 99.17;
                icManu = 39.67;
                break;
            case 72:
                //Muritania
                icAloj = 49.28;
                icManu = 39.07;
                break;
            case 73:
                //Mozambique
                icAloj = 67.31;
                icManu = 42.67;
                break;
            case 74:
                //Nicaragua
                icAloj = 94.36;
                icManu = 52.89;
                break;
            case 75:
                //Nigeria
                icAloj = 117.80;
                icManu = 46.88;
                break;
            case 76:
                //Nueva Zelanda
                icAloj = 65.51;
                icManu = 40.27;
                break;
            case 77:
                //Pakistan
                icAloj = 58.30;
                icManu = 37.26;
                break;
            case 78:
                //Panama
                icAloj = 64.91;
                icManu = 36.66;
                break;
            case 79:
                //Paraguay
                icAloj = 45.68;
                icManu = 33.06;
                break;
            case 80:
                //Peru
                icAloj = 79.93;
                icManu = 43.27;
                break;
            case 81:
                //Republica Checa
                icAloj = 101.57;
                icManu = 43.27;
                break;
            case 82:
                //Rumania
                icAloj = 126.81;
                icManu = 38.46;
                break;
            case 83:
                //Rusia
                icAloj = 227.78;
                icManu = 73.32;
                break;
            case 84:
                //Senegal
                icAloj = 67.91;
                icManu = 45.08;
                break;
            case 85:
                //Singapur
                icAloj = 85.34;
                icManu = 48.08;
                break;
            case 86:
                //Siria
                icAloj = 83.54;
                icManu = 46.28;
                break;
            case 87:
                //Sudáfrica
                icAloj = 64.31;
                icManu = 48.08;
                break;
            case 88:
                //Tailandia
                icAloj = 69.12;
                icManu = 39.07;
                break;
            case 89:
                //Taiwan
                icAloj = 81.74;
                icManu = 48.68;
                break;
            case 90:
                //Tanzania
                icAloj = 76.93;
                icManu = 30.05;
                break;
            case 91:
                //Túnez
                icAloj = 51.69;
                icManu = 46.28;
                break;
            case 92:
                //Turquía
                icAloj = 61.30;
                icManu = 39.07;
                break;
            case 93:
                //Uruguay
                icAloj = 57.70;
                icManu = 41.47;
                break;
            case 94:
                //Venezuela
                icAloj = 78.13;
                icManu = 36.06;
                break;
            case 95:
                //Yemen
                icAloj = 132.82;
                icManu = 43.27;
                break;
            case 96:
                //Yogoslavia
                icAloj = 98.57;
                icManu = 49.88;
                break;
            case 97:
                //Zire-Congo
                icAloj = 101.57;
                icManu = 54.09;
                break;
            case 98:
                //Zimbawe
                icAloj = 76.93;
                icManu = 39.07;
                break;
            case 99:
                //Resto del Mundo
                icAloj = 108.78;
                icManu = 40.87;
                break;
        }

        DietasViajes viaje = new DietasViajes(icAloj, icManu, Integer.parseInt(duracion.getText()), Integer.parseInt(personas.getText()));

        cAloj.setText("El coste máximo de Alojamiento es de " + df.format(viaje.calculaCosteAloj()) + " € ");
        cManu.setText("El coste máximo de Manutención es de " + df.format(viaje.calculaCosteManu()) + " € ");
        cTotal.setText("El coste máximo del Viaje es de " + df.format(viaje.calculaCoste()) + " € ");

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UIDietas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIDietas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIDietas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIDietas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIDietas().setVisible(true);
            }
        });
    }
//        Esta parte del codigo es por si quieres imprimir en consola el array de paises    
//        String [] paises1 = { "España", "Reino Unido", "Alemania", "Francia", "Italia", "Estados Unidos", "Suecia", "Suiza", "Austria", "Noruega", "Países Bajos", "Polonia", "Portugal", "Canadá", "Finlandia", "China", "Japón", "India", "Irlanda", "Dinamarca", "Bélgica", "Luxemburgo", "Mexico", "Andorra", "Angola", "Arabia Saudita", "Argelia", "Argentina", "Australia", "Bolivia", "Bosnia-Herzegovina", "Brasil", "Bulgaria", "Camerún", "Chile", "Colombia", "Corea", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "R.Dominicana", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eslovaquia", "Etiopía", "Filipinas", "Gabón", "Ghana", "Grecia", "Guatemala", "Guinea Ecuatorial", "Haití", "Honduras", "Hong Kong", "Hungría", "Indonesia", "Irak", "Iran", "Israel", "Italia", "Jamaica", "Jordania", "Kenia", "Kuwait", "Líbano", "Libia", "Malasia", "Malta", "Marruecos", "Mauritania", "Mozambique", "Nicaragua", "Nigeria", "Nueva Zelanda", "Pakistán", "Panamá", "Paraguay", "Perú", "República Checa", "Rumania", "Rusia", "Senegal", "Singapur", "Siria", "Sudáfrica", "Tailandia", "Taiwán", "Tanzania", "Túnez", "Turquía", "Uruguay", "Venezuela", "Yemen", "Yugoslavia", "Zaire/Congo", "Zimbawe", "Resto del Mundo" };
//         
//         for (int i=0; i<paises1.length;i++){
//             
//             System.out.println(i+" "+paises1[i]);
//         }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cAloj;
    private javax.swing.JLabel cManu;
    private javax.swing.JLabel cTotal;
    private javax.swing.JComboBox desplegablePais;
    private javax.swing.JTextField duracion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField personas;
    // End of variables declaration//GEN-END:variables
}
