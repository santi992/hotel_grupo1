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
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.List;
import javax.swing.JOptionPane;
import static vistas.VistaPrincipal.huespedActivo;
import static vistas.VistaPrincipal.login;
import static vistas.VistaPrincipal.personal;

/**
 *
 * @author SANTIAGONB asdad
 */
public class CancelarReserva extends javax.swing.JInternalFrame {

    private HuespedData huData;
    private ReservaData resData;
    private LocalDate fechaIn;
    private LocalDate fechaOut;
    private int noches;
    private double reembolso;
    private double precio;
    private double precioActual;

    public CancelarReserva() {

        huData = new HuespedData();
        resData = new ReservaData();

        initComponents();
        
        jtFechaActual.setText(LocalDate.now()+"");

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
        jlNoches = new javax.swing.JLabel();
        jlPrecioActual = new javax.swing.JLabel();
        jlReembolso = new javax.swing.JLabel();
        jlHabitacion = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcbReserva = new javax.swing.JComboBox<>();
        jlBuscar = new javax.swing.JLabel();
        jtHuesped = new javax.swing.JTextField();
        jlPersonas = new javax.swing.JLabel();
        jtFechaIn = new javax.swing.JTextField();
        jtFechaOut = new javax.swing.JTextField();
        jtFechaActual = new javax.swing.JTextField();
        jlFechaOut1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setTitle("Cancelar reserva");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hc_logo.png"))); // NOI18N

        jlTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlTitulo.setText("Cancelar reserva");

        jlReserva.setText("Reserva N°:");

        jlHuesped.setText("Huesped:");

        jcbHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHuespedActionPerformed(evt);
            }
        });

        jlFechaIn.setText("Fecha check in:");

        jlFechaOut.setText("Fecha check out:");

        jlNoches.setText("Noches restantes:");

        jlPrecioActual.setText("Precio abonado:");

        jlReembolso.setText("Reembolso:");

        jlHabitacion.setText("Habitación N°:");

        jbCancelar.setText("Cancelar reserva");
        jbCancelar.setPreferredSize(new java.awt.Dimension(100, 30));
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.setPreferredSize(new java.awt.Dimension(100, 30));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

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

        jtFechaOut.setEditable(false);
        jtFechaOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFechaOutActionPerformed(evt);
            }
        });

        jtFechaActual.setEditable(false);
        jtFechaActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFechaActualActionPerformed(evt);
            }
        });

        jlFechaOut1.setText("Fecha actual:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlFechaIn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtFechaOut, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(jlFechaOut)))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(jlFechaOut1))
                                        .addComponent(jtFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jlReembolso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlNoches, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jlPrecioActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jlHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jlPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlHuesped)
                                .addComponent(jlBuscar)
                                .addComponent(jlReserva)
                                .addComponent(jtHuesped)
                                .addComponent(jcbReserva, 0, 413, Short.MAX_VALUE)
                                .addComponent(jcbHuesped, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jlTitulo)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlHuesped)
                .addGap(7, 7, 7)
                .addComponent(jcbHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlHabitacion)
                    .addComponent(jlPersonas))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlFechaIn)
                            .addComponent(jlFechaOut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtFechaOut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlFechaOut1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNoches, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlReembolso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtHuespedActionPerformed

    }//GEN-LAST:event_jtHuespedActionPerformed

    private void jtFechaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFechaInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFechaInActionPerformed

    private void jtFechaOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFechaOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFechaOutActionPerformed

    private void jcbHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHuespedActionPerformed
        armarComboReservas();
    }//GEN-LAST:event_jcbHuespedActionPerformed

    private void jtHuespedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtHuespedKeyReleased
        armarComboHuesped();
    }//GEN-LAST:event_jtHuespedKeyReleased

    private void jcbReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbReservaActionPerformed
        datosReserva();
    }//GEN-LAST:event_jcbReservaActionPerformed

    private void jtFechaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFechaActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFechaActualActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        if (jcbReserva.getSelectedIndex() >= 0) {
                String mensaje = "¿Confirma que desea cancelar su reserva?\n"
                        +"Se le reembolsarán $" + reembolso + " USD";

                Object[] opciones = new Object[]{"Confirmar", "Cancelar"};

                int respuesta = JOptionPane.showOptionDialog(null, mensaje, "Cancelar reserva", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                if (respuesta == JOptionPane.YES_OPTION) {
                    cancelar();
                }
        }

    }//GEN-LAST:event_jbCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Huesped> jcbHuesped;
    private javax.swing.JComboBox<Reserva> jcbReserva;
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JLabel jlFechaIn;
    private javax.swing.JLabel jlFechaOut;
    private javax.swing.JLabel jlFechaOut1;
    private javax.swing.JLabel jlHabitacion;
    private javax.swing.JLabel jlHuesped;
    private javax.swing.JLabel jlNoches;
    private javax.swing.JLabel jlPersonas;
    private javax.swing.JLabel jlPrecioActual;
    private javax.swing.JLabel jlReembolso;
    private javax.swing.JLabel jlReserva;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtFechaActual;
    private javax.swing.JTextField jtFechaIn;
    private javax.swing.JTextField jtFechaOut;
    private javax.swing.JTextField jtHuesped;
    // End of variables declaration//GEN-END:variables

    private void armarComboReservas() {
        jcbReserva.removeAllItems();

        Huesped huesped = (Huesped) jcbHuesped.getSelectedItem();
        List reservas = resData.listarReservasXHuesped(huesped);

        for (Object res : reservas) {
            Reserva reserva = (Reserva) res;
            if ((int) DAYS.between(LocalDate.now(), reserva.getFechaCheckOut()) > 1) {
                jcbReserva.addItem(reserva);
            }
        }

    }

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

    private void datosReserva() {
        
        if (jcbReserva.getSelectedIndex() >= 0) {
            Reserva reserva = (Reserva) jcbReserva.getSelectedItem();

            fechaIn = reserva.getFechaCheckIn();
            jtFechaIn.setText(fechaIn + "");
            fechaOut = reserva.getFechaCheckOut();
            jtFechaOut.setText(fechaOut + "");

            jlHabitacion.setText("Habitación N°: " + reserva.getHabitacion().getIdHabitacion());
            jlPersonas.setText("Cantidad de personas: " + reserva.getCantPersonas());
            precio = reserva.getHabitacion().getTipoHabitacion().getPrecioxNoche();
            precioActual = reserva.getPrecioTotal();
            jlPrecioActual.setText("Importe abonado: " + precioActual + " USD");

            calcularPrecio();

        } else {
            fechaIn = null;
            jtFechaIn.setText("");
            fechaOut = null;
            jtFechaOut.setText("");

            jlHabitacion.setText("Habitación N°: ");
            jlPersonas.setText("Cantidad de personas: ");
            precio = 0;
            precioActual = 0;
            jlPrecioActual.setText("Importe abonado: ");
            jlReembolso.setText("Reembolso:");
        }

    }

    private void calcularPrecio() {
        reembolso = 0;
        noches = (int) DAYS.between(LocalDate.now(), fechaOut);
        jlNoches.setText("Noches restantes: " + noches);
        if (noches > 3) {
            reembolso = (precio * noches * 0.5);
        } else {
            reembolso = precio * noches * 0.25;
        }
        jlReembolso.setText("Importe a reembolsar: $" + reembolso + " USD");
    }

    private void cancelar() {
        Reserva reserva = (Reserva) jcbReserva.getSelectedItem();

        resData.cancelarReserva(reserva,LocalDate.now(), reserva.getPrecioTotal() - reembolso);

        armarComboReservas();
        datosReserva();
    }

}
