/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario.control;

import inventario.conection.ConexionBase;
import inventario.entities.RegistroVehiculosMo;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author SergioCardoza
 */
public class RegistroVehiculos {
    
    public boolean process(RegistroVehiculosMo vehiculosMo){
        boolean bandera = false;
        System.out.println("parametros de entrada ==> " +vehiculosMo.toString());
        ConexionBase con = new ConexionBase();
        try {
            
            Statement st=ConexionBase.obtener().createStatement();
            st.executeUpdate("INSERT INTO vehiculo(id_tipo_vehi,id_motor,id_marca,transmision,modelo,precio,año) value("+
                    vehiculosMo.getTipoCarro()+","+vehiculosMo.getTipoMotor()+","+vehiculosMo.getMarca()+","+
                    vehiculosMo.getTranss()+",'"+vehiculosMo.getModelo()+"',"+vehiculosMo.getPrecio()+",'"+vehiculosMo.getAnio()+"')");
            
            bandera = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al guardar datos en la base "+e.getMessage());
            bandera = false;
        }
        return bandera;
    }
    
}
