/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import accesoADatos.HabitacionData;
import accesoADatos.TipoHabData;
import entidades.Habitacion;
import entidades.TipoHabitacion;
import static hotelcalifornia.HotelCalifornia.obtenerId;
import java.util.List;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ManejodeHabitaciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form ManejodeHabitaciones
     */
    public ManejodeHabitaciones() {
        initComponents();
        armarComboBox();
        armarComboPiso();
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
        jLabel2 = new javax.swing.JLabel();
        jtIdHab = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcbTipoHabitacion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jcbPiso = new javax.swing.JComboBox<>();
        jrbReservado = new javax.swing.JRadioButton();
        jrbEstado = new javax.swing.JRadioButton();
        jbAgregar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Manejo de Habitaciones");

        jLabel2.setText("Nro Habitacion");

        jLabel3.setText("Tipo de Habitacion: ");

        jcbTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoHabitacionActionPerformed(evt);
            }
        });

        jLabel4.setText("Piso: ");

        jcbPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPisoActionPerformed(evt);
            }
        });

        jrbReservado.setText("Reservado");

        jrbEstado.setText("Estado");

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtIdHab, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jrbReservado)
                                .addGap(75, 75, 75)
                                .addComponent(jrbEstado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbBuscar)
                            .addComponent(jLabel1))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAgregar)
                .addGap(18, 18, 18)
                .addComponent(jbModificar)
                .addGap(18, 18, 18)
                .addComponent(jbEliminar)
                .addGap(18, 18, 18)
                .addComponent(jbSalir)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtIdHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbReservado)
                    .addComponent(jrbEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            
            HabitacionData hd = new HabitacionData();
            Habitacion hab = hd.obtenerHabitacion(Integer.parseInt(jtIdHab.getText()));
            if (hab != null) {
                jtIdHab.setText(String.valueOf(hab.getIdHabitacion()));
                jcbTipoHabitacion.setSelectedItem(hab.getTipoHabitacion().toString1());
                jcbPiso.setSelectedItem(hab.getPiso());
                jrbReservado.setSelected(hab.isReserva());
                jrbEstado.setSelected(hab.isEstado());
            }                                        
        
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(null, "El código ingresado debe ser un número");
        }
   
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jcbTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoHabitacionActionPerformed
        
    }
    private void armarComboBox() {
        
        TipoHabData hd = new TipoHabData();
        List tipoHabitacion = hd.listarTipos();
        
        for (Object h : tipoHabitacion) {
            TipoHabitacion habs = (TipoHabitacion) h;
            jcbTipoHabitacion.addItem(habs.toString1());
        }
        jcbTipoHabitacion.setSelectedIndex(-1);
    }//GEN-LAST:event_jcbTipoHabitacionActionPerformed

    private void jcbPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPisoActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
    
        HabitacionData habd = new HabitacionData();
        String hab = (String)jcbTipoHabitacion.getSelectedItem();
      
        Habitacion habit = new Habitacion();
        int id = Integer.parseInt(jtIdHab.getText());
        habit.setIdHabitacion(id);
        TipoHabitacion th = new TipoHabData().obtenerTipoxId(obtenerId(hab));
        habit.setTipoHabitacion(th); 
        habit.setPiso((int) jcbPiso.getSelectedItem());
        habit.setReserva(jrbReservado.isSelected());
        habit.setEstado(jrbEstado.isSelected());
        habd.agregarHabitacion(habit);

    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        HabitacionData habd = new HabitacionData();
                
        Habitacion habit = new Habitacion();
        int id = Integer.parseInt(jtIdHab.getText());
        habit.getIdHabitacion();
        habit.getTipoHabitacion();
        habit.getPiso();
        habit.isReserva();
        habit.isEstado();
        habd.eliminarHabitacion(id);
     
    }//GEN-LAST:event_jbEliminarActionPerformed

    
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        HabitacionData habd = new HabitacionData();
                
        Habitacion habit = new Habitacion();
        int id = Integer.parseInt(jtIdHab.getText());
        habit.setIdHabitacion(id);
        TipoHabitacion th = new TipoHabData().obtenerTipoxId(obtenerId((String) jcbTipoHabitacion.getSelectedItem()));
        habit.setTipoHabitacion(th);
        habit.setPiso((int) jcbPiso.getSelectedItem());
        habit.setReserva(jrbReservado.isSelected());
        habit.setEstado(jrbEstado.isSelected());
        habd.modificarHabitacion(habit);
        
        
        
        
        
        
    }//GEN-LAST:event_jbModificarActionPerformed
           
    private void armarComboPiso(){
        HabitacionData habData = new HabitacionData();
        List habitaciones = habData.listarHabitacionesTodas();
        TreeSet<Integer> pisos = new TreeSet<>();
        for (Object hab: habitaciones){
            Habitacion habitacion = (Habitacion) hab;
            int piso = habitacion.getPiso();
            pisos.add(piso);
        }
        for (int piso: pisos) {
            jcbPiso.addItem(piso);
        }
    jcbPiso.setSelectedIndex(-1);
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Integer> jcbPiso;
    private javax.swing.JComboBox<String> jcbTipoHabitacion;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JRadioButton jrbReservado;
    private javax.swing.JTextField jtIdHab;
    // End of variables declaration//GEN-END:variables
}

