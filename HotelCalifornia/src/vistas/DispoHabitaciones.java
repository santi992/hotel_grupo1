/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import accesoADatos.HabitacionData;
import accesoADatos.TipoHabData;
import entidades.Habitacion;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class DispoHabitaciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form DispoHabitaciones
     */
    public DispoHabitaciones() {
        initComponents();
        armarCabecera();
        armarCombo();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jrbDisponible = new javax.swing.JRadioButton();
        jrbOcupada = new javax.swing.JRadioButton();
        jcbPiso = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaDispo = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hc_logo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Disponibilidad de Habitaciones");

        jrbDisponible.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jrbDisponible.setText("Disponibles");
        jrbDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDisponibleActionPerformed(evt);
            }
        });

        jrbOcupada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jrbOcupada.setText("Ocupadas");
        jrbOcupada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOcupadaActionPerformed(evt);
            }
        });

        jcbPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPisoActionPerformed(evt);
            }
        });

        jtTablaDispo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtTablaDispo);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbSalir)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jrbDisponible)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jrbOcupada))
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jcbPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbDisponible)
                    .addComponent(jrbOcupada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSalir)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
      this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPisoActionPerformed
        cargarDatos(jcbPiso.getSelectedItem());
    }//GEN-LAST:event_jcbPisoActionPerformed

    private void jrbDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDisponibleActionPerformed
       jrbOcupada.setSelected(false);
       cargarDatos(jcbPiso.getSelectedItem());
    }//GEN-LAST:event_jrbDisponibleActionPerformed

    private void jrbOcupadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOcupadaActionPerformed
        jrbDisponible.setSelected(false);
        cargarDatos(jcbPiso.getSelectedItem());
    }//GEN-LAST:event_jrbOcupadaActionPerformed
private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;

        }
    };
private HabitacionData habitacionData;
private TipoHabData tipoHabitacionData;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Integer> jcbPiso;
    private javax.swing.JRadioButton jrbDisponible;
    private javax.swing.JRadioButton jrbOcupada;
    private javax.swing.JTable jtTablaDispo;
    // End of variables declaration//GEN-END:variables

private void armarCabecera(){
    modelo.addColumn("Id Habitacion");
    modelo.addColumn("Tipo Camas");
    modelo.addColumn("Cant Personas");
    modelo.addColumn("Precio x Noche");
    jtTablaDispo.setModel(modelo);
}
private void limpiarTabla(){
        for (int i = modelo.getRowCount(); i > 0 ; i--) {
            modelo.removeRow(i-1);
        }
    }
    private void armarCombo() {
        habitacionData = new HabitacionData();
        List habitaciones = habitacionData.listarHabitacionesTodas();
        TreeSet<Integer> pisos = new TreeSet<>();
        for (Object hab : habitaciones) {
            Habitacion habitacion = (Habitacion) hab;
            int piso = habitacion.getPiso();
            pisos.add(piso);
        }
        for (int piso : pisos) {
            jcbPiso.addItem(piso);
        }
    }

    private void cargarDatos(Object selectedItem) {
        boolean habitacionesDisponibles = jrbDisponible.isSelected();
        int numeroDePiso = (int) jcbPiso.getSelectedItem();
        List<Habitacion> habitaciones = habitacionData.listarHabitacionesXPiso(numeroDePiso);

        DefaultTableModel model = (DefaultTableModel) jtTablaDispo.getModel();
        model.setRowCount(0);

        for (Habitacion habitacion : habitaciones) {
            if (jrbDisponible.isSelected()) {
                if (!habitacion.isReserva()) {
                    Object[] fila = {
                        habitacion.getIdHabitacion(),
                        habitacion.getTipoHabitacion().getTipoCamas(),
                        habitacion.getTipoHabitacion().getCantPersonas(),
                        habitacion.getTipoHabitacion().getPrecioxNoche(),};
                    model.addRow(fila);
                }
            } else {
                if (habitacion.isReserva()) {
                    Object[] fila = {
                        habitacion.getIdHabitacion(),
                        habitacion.getTipoHabitacion().getTipoCamas(),
                        habitacion.getTipoHabitacion().getCantPersonas(),
                        habitacion.getTipoHabitacion().getPrecioxNoche(),};
                    model.addRow(fila);
                }

            }
        }
    }
}


