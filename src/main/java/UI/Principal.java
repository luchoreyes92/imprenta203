package UI;

import Logica.Simular;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lucho
 */
public class Principal extends javax.swing.JFrame {

    private Object[] filaAnterior = new Object[15];
    private Object[] filaNueva = new Object[15];
    private Integer dia;

    private final Integer[] probTipos = new Integer[2];

    public Principal() {
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

        btn_Simular = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        totalSemana = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        desdeDia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hastaDia = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        demoraDesde = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        demoraHasta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        descartar2 = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        probabilidades = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        utilidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        utilidadSin2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        conclusion = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        principal = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Simular.setText("Simular");
        btn_Simular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SimularActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imprenta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Total Semanas:");

        totalSemana.setText("100");
        totalSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalSemanaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Desde Día:");

        desdeDia.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Hasta Día:");

        hastaDia.setText("700");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(49, 49, 49)
                        .addComponent(hastaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(desdeDia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(totalSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(totalSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(desdeDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hastaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Variables Sistema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Demora Trabajo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        demoraDesde.setText("2");
        demoraDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoraDesdeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Desde (dias)");

        demoraHasta.setText("5");
        demoraHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoraHastaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Hasta (dias)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(demoraHasta)
                    .addComponent(demoraDesde, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(demoraDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(demoraHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        descartar2.setText("Descartar Tipo 2");
        descartar2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                descartar2StateChanged(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipos Trabajo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        probabilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"TIPO 1", "0.5", "0", "49", "400"},
                {"TIPO 2", "0.2", "50", "69", "200"},
                {"NO TRABAJO", "0.3", "70", "99", "-"}
            },
            new String [] {
                "Tipo", "Probabilidad", "Desde", "Hasta", "Utilidad ($)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(probabilidades);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(descartar2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(descartar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(88, 88, 88))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salidas Sistema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        utilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilidadActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Utilidad obtenida ($) :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Utilidad obtenida s/tipo 2 ($) :");

        utilidadSin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilidadSin2ActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conclusión", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        conclusion.setEditable(false);
        conclusion.setColumns(20);
        conclusion.setRows(5);
        conclusion.setAutoscrolls(false);
        conclusion.setFocusable(false);
        jScrollPane2.setViewportView(conclusion);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(utilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(utilidadSin2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(utilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(utilidadSin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        principal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia (cantidad)", "RND Tipo", "Tipo Trabajo", "Evento", "RND Demora", "Dia Demora", "Pren. Estado [1]", "Pren. Dia Finaliza[1]", "Atend Tipo Trab [1]", "Pren. Estado [2]", "Pren. Dia Finaliza[2]", "Atend Tipo Trab [2]", "Acum Tipo 1", "Acum Tipo 2", "Acum ($)"
            }
        ));
        principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Simular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Simular))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SimularActionPerformed
        this.dia = 0;
        Integer totalDias = Integer.parseInt(this.totalSemana.getText()) * 7;
        Integer desde = Integer.parseInt(this.desdeDia.getText());
        Integer hasta = Integer.parseInt(this.hastaDia.getText());
        Double utilidad1 = Double.parseDouble(this.probabilidades.getValueAt(0, 4).toString());
        Double utilidad2 = Double.parseDouble(this.probabilidades.getValueAt(1, 4).toString());
        Integer demoraDesde = Integer.parseInt(this.demoraDesde.getText());
        Integer demoraHasta = Integer.parseInt(this.demoraHasta.getText());
        llenarProbabilidades();
        inicializarFila();

        Simular simular = new Simular(utilidad1, utilidad2, this.probTipos, this.descartar2.isSelected(), demoraDesde, demoraHasta);

        if (validaParametros(hasta, desde, totalDias)) {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo = (DefaultTableModel) this.principal.getModel();
            modelo.setRowCount(0);

            while (this.dia <= totalDias) {
                this.filaNueva = simular.simular(this.filaAnterior, this.dia);

                if (this.dia >= desde && this.dia <= hasta) {
                    modelo.addRow(this.filaNueva);
                }
                if (Objects.equals(this.dia, totalDias) && this.dia > hasta) {
                    modelo.addRow(filaNueva);
                }

                setearFilaAnterior(this.filaAnterior, this.filaNueva);
                this.dia++;
            }

            if (this.descartar2.isSelected()) {
                this.utilidadSin2.setText(((Double) this.filaNueva[14]).toString());
            } else {
                this.utilidad.setText(((Double) this.filaNueva[14]).toString());
            }
            
            if(!this.utilidad.getText().equals("") && !this.utilidadSin2.getText().equals("")){
                Double utilidadCon2 = Double.parseDouble(this.utilidad.getText());
                Double utilidadSin2 = Double.parseDouble(this.utilidadSin2.getText());
                this.conclusion.setText("En esta simulación para " + totalDias + " días,\n podemos concluir que si"
                        + " no se aceptan\n trabajos del tipo 2, la utilidad varía\n"
                        + " con respecto a cuando si son aceptados,\n"
                        + "en un total de: $" + (utilidadCon2-utilidadSin2));
            }
            
            
        }


    }//GEN-LAST:event_btn_SimularActionPerformed

    private void utilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utilidadActionPerformed

    private void totalSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalSemanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalSemanaActionPerformed

    private void utilidadSin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utilidadSin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utilidadSin2ActionPerformed

    private void principalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalMouseClicked


    }//GEN-LAST:event_principalMouseClicked

    private void demoraDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoraDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_demoraDesdeActionPerformed

    private void demoraHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoraHastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_demoraHastaActionPerformed

    private void descartar2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_descartar2StateChanged

        if (this.descartar2.isSelected()) {
            this.probabilidades.setValueAt(0, 1, 1);
            this.probabilidades.setValueAt(0, 1, 2);
            this.probabilidades.setValueAt(0, 1, 3);
            this.probabilidades.setValueAt(0, 1, 4);
        }
        if (!this.descartar2.isSelected()) {
            inicializarTablaTrabajos();
        }


    }//GEN-LAST:event_descartar2StateChanged

    private boolean validaParametros(Integer hasta, Integer desde, Integer totalDias) {
        if (hasta < desde || hasta > totalDias) {
            JOptionPane.showMessageDialog(null, "La variable 'Hasta día' no posee un valor válido.");
            return false;
        }
        if (desde < 0) {
            JOptionPane.showMessageDialog(null, "La variable 'Desde día' no posee un valor válido.");
            return false;
        }

        Integer interInf1 = Integer.parseInt(this.probabilidades.getValueAt(0, 2).toString());
        Integer interSup1 = Integer.parseInt(this.probabilidades.getValueAt(0, 3).toString());
        Integer interInf2 = Integer.parseInt(this.probabilidades.getValueAt(1, 2).toString());
        Integer interSup2 = Integer.parseInt(this.probabilidades.getValueAt(1, 3).toString());
        Integer interInfNT = Integer.parseInt(this.probabilidades.getValueAt(2, 2).toString());
        Integer interSupNT = Integer.parseInt(this.probabilidades.getValueAt(2, 3).toString());

        if (this.descartar2.isSelected()) {
            Double prob1 = Double.parseDouble(this.probabilidades.getValueAt(0, 1).toString());
            Double probNT = Double.parseDouble(this.probabilidades.getValueAt(2, 1).toString());
            if ((prob1 + probNT) != 1.0) {
                JOptionPane.showMessageDialog(null, "Las probabilidades de los tipos de trabajo no poseen un valor válido.");
                return false;
            }
            if (((interInfNT - 1) != interSup1)) {
                JOptionPane.showMessageDialog(null, "Los intervalos de los tipos de trabajo no poseen un valor válido.");
                return false;
            }

            Integer cantidad = (interSup1 - interInf1 + 1)  + (interSupNT - interInfNT + 1);
            if (cantidad != 100) {
                JOptionPane.showMessageDialog(null, "Los intervalos de los tipos de trabajo no poseen un valor válido.");
                return false;
            }

        }
        if (!this.descartar2.isSelected()) {
            Double prob1 = Double.parseDouble(this.probabilidades.getValueAt(0, 1).toString());
            Double prob2 = Double.parseDouble(this.probabilidades.getValueAt(1, 1).toString());
            Double probNT = Double.parseDouble(this.probabilidades.getValueAt(2, 1).toString());
            if ((prob1 + prob2 + probNT) != 1.0) {
                JOptionPane.showMessageDialog(null, "Las probabilidades de los tipos de trabajo no poseen un valor válido.");
                return false;
            }

            if (((interInf2 - 1) != interSup1) || ((interInfNT - 1) != interSup2)) {
                JOptionPane.showMessageDialog(null, "Los intervalos de los tipos de trabajo no poseen un valor válido.");
                return false;
            }

            Integer cantidad = (interSup1 - interInf1 + 1)+ (interSup2 - interInf2 + 1) + (interSupNT - interInfNT + 1);
            
            if (cantidad != 100) {
                JOptionPane.showMessageDialog(null, "Los intervalos de los tipos de trabajo no poseen un valor válido.");
                return false;
            }
        }

        return true;
    }

    private void inicializarFila() {
        this.filaAnterior[0] = 0; // dia
        this.filaAnterior[1] = "-"; //RND Tipo
        this.filaAnterior[2] = "-";//Tipo Trabajo
        this.filaAnterior[3] = "-"; //Evento
        this.filaAnterior[4] = "-"; //RND Demora
        this.filaAnterior[5] = "-"; // Dia Demora
        this.filaAnterior[6] = "LIBRE"; //Estado
        this.filaAnterior[7] = 0; // Dia Finaliza
        this.filaAnterior[8] = "-"; //Atendiendo Tipo
        this.filaAnterior[9] = "LIBRE"; // Estado
        this.filaAnterior[10] = "-"; // Dia Finaliza
        this.filaAnterior[11] = "-"; //Atendiendo Tipo
        this.filaAnterior[12] = 0;//Acum Tipo 1;
        this.filaAnterior[13] = 0; //Acum Tipo 2;
        this.filaAnterior[14] = (double) 0.0;//Acum Total;

    }

    private void inicializarTablaTrabajos() {
        this.probabilidades.setValueAt(0.5, 0, 1);
        this.probabilidades.setValueAt(0, 0, 2);
        this.probabilidades.setValueAt(49, 0, 3);
        this.probabilidades.setValueAt(400, 0, 4);

        this.probabilidades.setValueAt(0.2, 1, 1);
        this.probabilidades.setValueAt(50, 1, 2);
        this.probabilidades.setValueAt(69, 1, 3);
        this.probabilidades.setValueAt(200, 1, 4);

        this.probabilidades.setValueAt(0.3, 2, 1);
        this.probabilidades.setValueAt(70, 2, 2);
        this.probabilidades.setValueAt(99, 2, 3);
    }

    private void setearFilaAnterior(Object[] filaAnterior, Object[] filaNueva) {
        for (int i = 0; i < filaAnterior.length; i++) {
            filaAnterior[i] = filaNueva[i];
        }
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Simular;
    private javax.swing.JTextArea conclusion;
    private javax.swing.JTextField demoraDesde;
    private javax.swing.JTextField demoraHasta;
    private javax.swing.JCheckBox descartar2;
    private javax.swing.JTextField desdeDia;
    private javax.swing.JTextField hastaDia;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable principal;
    private javax.swing.JTable probabilidades;
    private javax.swing.JTextField totalSemana;
    private javax.swing.JTextField utilidad;
    private javax.swing.JTextField utilidadSin2;
    // End of variables declaration//GEN-END:variables

    private void llenarProbabilidades() {
        this.probTipos[0] = Integer.parseInt(this.probabilidades.getValueAt(0, 3).toString());
        if (!this.descartar2.isSelected()) {
            this.probTipos[1] = Integer.parseInt(this.probabilidades.getValueAt(1, 3).toString());
        }

    }
}
