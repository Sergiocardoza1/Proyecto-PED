/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVL.Vista;

import inventario.conection.ConexionBase;
import inventario.control.Marca;
import inventario.control.RegistroVehiculos;
import inventario.control.TipoMotor;
import inventario.control.TipoVehiculo;
import inventario.entities.RegistroVehiculosMo;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SergioCardoza
 */
public class Registro extends javax.swing.JFrame {
    
    public TipoMotor tipoMotor;
    public Marca marca;
    public TipoVehiculo tipoVehiculo;
    public ConexionBase con = new ConexionBase();

    /**
     * Creacion Formulario de Registro
     */
    public Registro() {
        initComponents();
        llenarDatos();
        llenarDatosTipoCarro();
        llenarMarca();
    }
    
    public void llenarDatos(){
        String consulta="select * from cat_motor";
        try {
            Statement sentencia=ConexionBase.obtener().createStatement();
            ResultSet resultado=sentencia.executeQuery(consulta);
            while (resultado.next())
            {
                System.out.println (resultado.getObject("tipo_motor") );
                ComboBoxTipoMotor.addItem(resultado.getString("tipo_motor"));
            }
        } catch (Exception e) {
        }
    }
    
    public void llenarDatosTipoCarro(){
        String consulta="select * from cat_tipo_vehi";
        try {
            Statement sentencia=ConexionBase.obtener().createStatement();
            ResultSet resultado=sentencia.executeQuery(consulta);
            while (resultado.next())
            {
                System.out.println (resultado.getObject("tipo_vehiculo") );
                jComboBoxTipoCarro.addItem(resultado.getString("tipo_vehiculo"));
            }
        } catch (Exception e) {
        }
    }
    
     public void llenarMarca(){
        String consulta="select * from marca";
        try {
            Statement sentencia=ConexionBase.obtener().createStatement();
            ResultSet resultado=sentencia.executeQuery(consulta);
            while (resultado.next())
            {
                System.out.println (resultado.getObject("nombre_marca") );
                jComboBoxMarca.addItem(resultado.getString("nombre_marca"));
            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextModelo = new javax.swing.JTextField();
        jRadioAuto = new javax.swing.JRadioButton();
        jRadioManual = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ComboBoxTipoMotor = new javax.swing.JComboBox<>();
        jComboBoxTipoCarro = new javax.swing.JComboBox<>();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBoxAnio = new javax.swing.JComboBox<>();
        jButtonAgregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Precio");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 60, -1));
        getContentPane().add(jTextPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Modelo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, -1));
        getContentPane().add(jTextModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 130, 30));

        jRadioAuto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioAuto.setText("Automatico");
        getContentPane().add(jRadioAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 20));

        jRadioManual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioManual.setText("Manual");
        getContentPane().add(jRadioManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Transmision");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Tipo de Motor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Tipo de Vehiculo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Marca");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Cantidad");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Año");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        ComboBoxTipoMotor.setName("combotipoMotor"); // NOI18N
        getContentPane().add(ComboBoxTipoMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 30));

        getContentPane().add(jComboBoxTipoCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 130, 30));

        getContentPane().add(jComboBoxMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 130, 30));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 60, 30));

        jComboBoxAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));
        getContentPane().add(jComboBoxAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 80, 30));

        jButtonAgregar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregarMouseClicked(evt);
            }
        });
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 110, -1));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 110, -1));

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 110, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Agregar Tipo de Motor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 230, -1));

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Agregar Tipo de Vehiculo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jButton7.setBackground(new java.awt.Color(0, 153, 153));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("Agregar Marca");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 230, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AVL/Vista/Captura-removebg-preview.png"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 110));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
        
        tipoMotor = new TipoMotor();
        marca = new Marca();
        tipoVehiculo = new TipoVehiculo();
        RegistroVehiculosMo vehiculosMo = new RegistroVehiculosMo();
        System.out.println("elemento combo"+ComboBoxTipoMotor.getSelectedItem());
        try {
            if(((jRadioAuto.isSelected()==false && jRadioManual.isSelected()==true)||
                    (jRadioAuto.isSelected()==true && jRadioManual.isSelected()==false))&&
                    !"".equalsIgnoreCase(jTextModelo.getText()) && !"".equalsIgnoreCase(jTextPrecio.getText())){
                   
            
            vehiculosMo.setTipoMotor(tipoMotor.getID(ComboBoxTipoMotor.getSelectedItem().toString()));
            vehiculosMo.setMarca(marca.getID(jComboBoxMarca.getSelectedItem().toString()));
            vehiculosMo.setTipoCarro(tipoVehiculo.getID(jComboBoxTipoCarro.getSelectedItem().toString()));
            vehiculosMo.setModelo(jTextModelo.getText());
            vehiculosMo.setAnio(jComboBoxAnio.getSelectedItem().toString());
            vehiculosMo.setPrecio(Double.parseDouble(jTextPrecio.getText()));
            if(jRadioAuto.isSelected()==false){
                vehiculosMo.setTranss(1);
            }else if (jRadioManual.isSelected()==false){
                vehiculosMo.setTranss(2);
            }
            
           
            RegistroVehiculos rv = new RegistroVehiculos();
            if(rv.process(vehiculosMo)==true){
                JOptionPane.showMessageDialog(null, "Vehiculo Agregado con exito");
                Buscar buscar  = new Buscar();
                buscar.setVisible(true);
                this.dispose();
            }else{
                  JOptionPane.showMessageDialog(null, "Revisar Datos ");
            }
        }else{
                JOptionPane.showMessageDialog(null, "Llene los campos requeridos");
                }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CatalogoTipoMotores ctm = new CatalogoTipoMotores();
        ctm.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiarregText();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void limpiarregText(){
    
    jTextModelo.setText("");
    jTextPrecio.setText("");
}
 
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxTipoMotor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBoxAnio;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JComboBox<String> jComboBoxTipoCarro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioAuto;
    private javax.swing.JRadioButton jRadioManual;
    private javax.swing.JTextField jTextModelo;
    private javax.swing.JTextField jTextPrecio;
    // End of variables declaration//GEN-END:variables
}
