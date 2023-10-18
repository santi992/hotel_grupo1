/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoADatos.HuespedData;
import accesoADatos.ReservaData;
import entidades.Huesped;
import entidades.Reserva;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Date;
import java.util.List;
import static vistas.VistaPrincipal.huespedActivo;
import static vistas.VistaPrincipal.login;
import static vistas.VistaPrincipal.personal;

/**
 *
 * @author SANTIAGONB
 */
public class AmpliarReserva extends javax.swing.JInternalFrame {

    /**
     * Creates new form AmpliarReserva
     */
    private HuespedData huData;
    private ReservaData resData;
    private LocalDate fechaIn;
    private LocalDate fechaOut;
    private int noches;
    private double diferencia;
    private double precio;
    private double precioActual;
    private double precioFinal;

    public AmpliarReserva() {

        huData = new HuespedData();
        resData = new ReservaData();

        initComponents();

        armarComboHuesped();
        armarComboReservas();
        datosReserva();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jlTitulo = new javax.swing.JLabel();
        jlReserva = new javax.swing.JLabel();
        jlHuesped = new javax.swing.JLabel();
        jcbHuesped = new javax.swing.JComboBox<>();
        jlFechaIn = new javax.swing.JLabel();
        jlFechaOut = new javax.swing.JLabel();
        jdateFechaOut = new com.toedter.calendar.JDateChooser();
        jlNoches = new javax.swing.JLabel();
        jlPrecioActual = new javax.swing.JLabel();
        jlPrecioNuevo = new javax.swing.JLabel();
        jlDiferencia = new javax.swing.JLabel();
        jlHabitacion = new javax.swing.JLabel();
        jbConfirmar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlPrecioXNoche = new javax.swing.JLabel();
        jcbReserva = new javax.swing.JComboBox<>();
        jlBuscar = new javax.swing.JLabel();
        jtHuesped = new javax.swing.JTextField();
        jlPersonas = new javax.swing.JLabel();
        jtFechaIn = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setTitle("Ampliar reserva");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hc_logo.png"))); // NOI18N

        jlTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlTitulo.setText("Ampliar reserva");

        jlReserva.setText("Reserva N°:");

        jlHuesped.setText("Huesped:");

        jcbHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHuespedActionPerformed(evt);
            }
        });

        jlFechaIn.setText("Fecha check in:");

        jlFechaOut.setText("Fecha check out:");

        jdateFechaOut.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdateFechaOutPropertyChange(evt);
            }
        });

        jlNoches.setText("Noches:");

        jlPrecioActual.setText("Precio actual:");

        jlPrecioNuevo.setText("Nuevo precio:");

        jlDiferencia.setText("Diferencia a abonar:");

        jlHabitacion.setText("Habitación N°:");

        jbConfirmar.setText("Confirmar");
        jbConfirmar.setPreferredSize(new java.awt.Dimension(100, 30));
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.setPreferredSize(new java.awt.Dimension(100, 30));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlPrecioXNoche.setText("Precio por noche:");

        jcbReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbReservaActionPerformed(evt);
            }
        });

        jlBuscar.setText("Buscar huesped por dni o nombre");

        jtHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtHuespedActionPerformed(evt);
            }
        });
        jtHuesped.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtHuespedKeyReleased(evt);
            }
        });

        jlPersonas.setText("Cantidad de Personas:");

        jtFechaIn.setEditable(false);
        jtFechaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFechaInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jlTitulo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlPrecioActual)
                                    .addComponent(jlNoches)
                                    .addComponent(jlDiferencia)
                                    .addComponent(jtFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlPrecioNuevo)
                                    .addComponent(jlPrecioXNoche)
                                    .addComponent(jdateFechaOut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlFechaIn)
                                    .addComponent(jlHabitacion))
                                .addGap(133, 133, 133)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlPersonas)
                                    .addComponent(jlFechaOut)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlHuesped)
                            .addComponent(jlBuscar)
                            .addComponent(jlReserva)
                            .addComponent(jtHuesped)
                            .addComponent(jcbReserva, 0, 413, Short.MAX_VALUE)
                            .addComponent(jcbHuesped, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlTitulo)
                .addGap(12, 12, 12)
                .addComponent(jlHuesped)
                .addGap(7, 7, 7)
                .addComponent(jcbHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlHabitacion)
                    .addComponent(jlPersonas))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFechaIn)
                    .addComponent(jlFechaOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jdateFechaOut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNoches, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPrecioXNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPrecioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdateFechaOutPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdateFechaOutPropertyChange
        System.out.println("entra a evento");
        calcularPrecio();
    }//GEN-LAST:event_jdateFechaOutPropertyChange

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtHuespedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtHuespedActionPerformed

    private void jtFechaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFechaInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFechaInActionPerformed

    private void jtHuespedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtHuespedKeyReleased
        armarComboHuesped();
    }//GEN-LAST:event_jtHuespedKeyReleased

    private void jcbHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHuespedActionPerformed
        armarComboReservas();
    }//GEN-LAST:event_jcbHuespedActionPerformed

    private void jcbReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbReservaActionPerformed
        datosReserva();
    }//GEN-LAST:event_jcbReservaActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        confirmar();
    }//GEN-LAST:event_jbConfirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Huesped> jcbHuesped;
    private javax.swing.JComboBox<Reserva> jcbReserva;
    private com.toedter.calendar.JDateChooser jdateFechaOut;
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JLabel jlDiferencia;
    private javax.swing.JLabel jlFechaIn;
    private javax.swing.JLabel jlFechaOut;
    private javax.swing.JLabel jlHabitacion;
    private javax.swing.JLabel jlHuesped;
    private javax.swing.JLabel jlNoches;
    private javax.swing.JLabel jlPersonas;
    private javax.swing.JLabel jlPrecioActual;
    private javax.swing.JLabel jlPrecioNuevo;
    private javax.swing.JLabel jlPrecioXNoche;
    private javax.swing.JLabel jlReserva;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtFechaIn;
    private javax.swing.JTextField jtHuesped;
    // End of variables declaration//GEN-END:variables

    private void comboHuespedes() {
        List huespedes = huData.listarHuespedes();
        for (Object hu : huespedes) {
            Huesped huesped = (Huesped) hu;
            jcbHuesped.addItem(huesped);
        }

    }

    private void buscarHuesped() {

        List huespedes = huData.listarHuespedes();

        String texto = jtHuesped.getText().toLowerCase();

        for (Object hu : huespedes) {

            Huesped huesped = (Huesped) hu;

            String nombre = huesped.getNombre().toLowerCase();
            String apellido = huesped.getApellido().toLowerCase();
            String dni = huesped.getDni() + "";
            String nomAp = nombre + " " + apellido;
            String apNom = apellido + " " + nombre;

            boolean nombreMatch = nombre.startsWith(texto);
            boolean apellidoMatch = apellido.startsWith(texto);
            boolean dniMatch = dni.startsWith(texto);
            boolean nomApMatch = nomAp.startsWith(texto);
            boolean apNomMatch = apNom.startsWith(texto);

            if (nombreMatch || apellidoMatch || dniMatch || nomApMatch || apNomMatch) {
                jcbHuesped.addItem(huesped);
            }
        }
    }

    private void armarComboHuesped() {
        jcbHuesped.removeAllItems();

        if (login) {
            if (personal) {
                if (jtHuesped.getText().isEmpty()) {
                    comboHuespedes();
                } else {
                    buscarHuesped();
                }
            } else {
                jcbHuesped.addItem(huespedActivo);
                jtHuesped.setEditable(false);
            }
        } else {
            jtHuesped.setEditable(false);
            jcbHuesped.setEnabled(false);
        }

    }

    private void fechasMinMax() {
        jdateFechaOut.setMinSelectableDate(Date.from(fechaOut.plusDays(1).atStartOfDay(ZoneId.systemDefault()).toInstant()));
        jdateFechaOut.setMaxSelectableDate(Date.from(LocalDate.now().plusDays(365).atStartOfDay(ZoneId.systemDefault()).toInstant()));
    }

    private void armarComboReservas() {
        jcbReserva.removeAllItems();

        Huesped huesped = (Huesped) jcbHuesped.getSelectedItem();
        List reservas = resData.listarReservasXHuesped(huesped);

        for (Object res : reservas) {
            Reserva reserva = (Reserva) res;
            jcbReserva.addItem(reserva);
        }

    }

    private void datosReserva() {

        if (jcbReserva.getSelectedIndex() >= 0) {
            Reserva reserva = (Reserva) jcbReserva.getSelectedItem();

            fechaIn = reserva.getFechaCheckIn();
            jtFechaIn.setText(fechaIn + "");
            LocalDate fechaOutAux = reserva.getFechaCheckOut();
            
            jdateFechaOut.setDate(Date.from(fechaOutAux.atStartOfDay(ZoneId.systemDefault()).toInstant()));

            jlHabitacion.setText("Habitación N°: " + reserva.getHabitacion().getIdHabitacion());
            jlPersonas.setText("Cantidad de personas: " + reserva.getCantPersonas());
            precio = reserva.getHabitacion().getTipoHabitacion().getPrecioxNoche();
            jlPrecioXNoche.setText("Precio por noche: " + precio + " USD");
            precioActual = reserva.getPrecioTotal();
            jlPrecioActual.setText("Importe abonado: " + precioActual + " USD");

            fechasMinMax();
            calcularPrecio();

        }

    }

    private void calcularPrecio() {
        fechaOut = jdateFechaOut.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        noches = (int) DAYS.between(fechaIn, fechaOut);
        jlNoches.setText("Noches: " + noches);
        precioFinal = noches * precio;
        jlPrecioNuevo.setText("Nuevo importe: $" + precioFinal + " USD");
        diferencia = precioFinal - precioActual;
        jlDiferencia.setText("Importe a abonar: $" + diferencia + " USD");
    }

    private void confirmar() {
    
    }

}
