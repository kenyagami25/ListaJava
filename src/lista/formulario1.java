/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lista;

/**
 *
 * @author LohannaStan
 */
public class formulario1 extends javax.swing.JFrame {

    /**
     * Creates new form formulario1
     */
    Producto p1;
    Nodo n1;
    ListaLineal l1 = new ListaLineal(n1);

    public formulario1() {
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

        txtBuscarCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtStockMin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRespuesta = new javax.swing.JTextArea();
        btnIngresarInicio = new javax.swing.JButton();
        btnIngresarFinal = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnNumElementos = new javax.swing.JButton();
        btnPrecio = new javax.swing.JButton();
        txtCodigo1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtBuscarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 88, -1));

        jLabel1.setText("Realizado por: Viviana Cuaspa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 33, 304, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 136, 88, -1));

        jLabel2.setText("Lista Lineal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 111, -1));

        jLabel3.setText("Ingresar iinformación del producto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 74, 196, -1));

        jLabel4.setText("Código");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 56, -1));

        jLabel5.setText("Nombre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 139, 50, -1));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 88, -1));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 88, -1));

        jLabel6.setText("Cantidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 56, -1));

        jLabel7.setText("Precio");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 50, -1));
        getContentPane().add(txtStockMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 88, -1));

        jLabel8.setText("Mínimo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 50, -1));

        txtRespuesta.setColumns(20);
        txtRespuesta.setRows(5);
        jScrollPane1.setViewportView(txtRespuesta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 370, 240));

        btnIngresarInicio.setText("IngresarInicio");
        btnIngresarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        btnIngresarFinal.setText("IngresarFinal");
        btnIngresarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarFinalActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        btnNumElementos.setText("NumElementos");
        btnNumElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumElementosActionPerformed(evt);
            }
        });
        getContentPane().add(btnNumElementos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        btnPrecio.setText("Precio");
        btnPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));
        getContentPane().add(txtCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 102, 88, -1));

        jLabel10.setText("Código");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 105, 56, -1));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarInicioActionPerformed
        // TODO add your handling code here:
        String codigo = this.txtCodigo1.getText();
        String nombre = this.txtNombre.getText();
        int cantidad = Integer.parseInt(this.txtCantidad.getText());
        double precio = Double.parseDouble(this.txtPrecio.getText());
        int stockmin = Integer.parseInt(this.txtStockMin.getText());
        p1 = new Producto(codigo, nombre, cantidad, precio, stockmin);
        l1.ingresarInicio(p1);
        txtRespuesta.setText("Se ha ingresado el producto");
    }//GEN-LAST:event_btnIngresarInicioActionPerformed

    private void btnIngresarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarFinalActionPerformed
        // TODO add your handling code here:
        String codigo = this.txtCodigo1.getText();
        String nombre = this.txtNombre.getText();
        int cantidad = Integer.parseInt(this.txtCantidad.getText());
        double precio = Double.parseDouble(this.txtPrecio.getText());
        int stockmin = Integer.parseInt(this.txtStockMin.getText());
        p1 = new Producto(codigo, nombre, cantidad, precio, stockmin);
        l1.ingresarFinal(p1);
        txtRespuesta.setText("Se ha ingresado el producto");
    }//GEN-LAST:event_btnIngresarFinalActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:
        l1.eliminarPrimerNodo();
        txtRespuesta.setText("Se ha eliminado el producto");
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed

        String respuesta = l1.reporte();
        txtRespuesta.setText(respuesta);
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnNumElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumElementosActionPerformed
        // TODO add your handling code here:
        String respuesta = l1.numeroElementos() + "";
        txtRespuesta.setText(respuesta);
    }//GEN-LAST:event_btnNumElementosActionPerformed

    private void btnPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecioActionPerformed
        Nodo aux = l1.productoEncontrado(txtBuscarCodigo.getText());
        System.out.println("" + aux);
        if (aux == null) {
            txtRespuesta.setText("Producto no encontrado");
        } else {
            p1 = (Producto) aux.getInfo();
            txtRespuesta.setText(p1.getPrecio() + "");
        }
    }//GEN-LAST:event_btnPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(formulario1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarFinal;
    private javax.swing.JButton btnIngresarInicio;
    private javax.swing.JButton btnNumElementos;
    private javax.swing.JButton btnPrecio;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscarCodigo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextArea txtRespuesta;
    private javax.swing.JTextField txtStockMin;
    // End of variables declaration//GEN-END:variables
}