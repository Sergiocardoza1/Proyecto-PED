/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario.control;

import inventario.conection.ConexionBase;
import inventario.entities.RegistroUsuariosEnt;
import java.sql.Statement;

/**
 *
 * @author SergioCardoza
 */
public class CatalogoTipoMotor {
    public boolean process(String dat){
        boolean bandera = false;
        System.out.println("parametros de entrada ==> " +dat);
        ConexionBase con = new ConexionBase();
        try {
            
            Statement st=ConexionBase.obtener().createStatement();
            st.executeUpdate("insert into cat_motor(tipo_motor) value ('"+dat+"')");
            
            bandera = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al guardar datos en la base "+e.getMessage());
            bandera = false;
        }
        return bandera;
    }
    
    public boolean update(String dat, String id){
        boolean bandera = false;
        System.out.println("parametros de entrada ==> " +dat);
        ConexionBase con = new ConexionBase();
        try {
            
            Statement st=ConexionBase.obtener().createStatement();
            st.executeUpdate("update cat_motor set id_motor="+id+" where tipo_motor='"+dat+"'");
            con.cerrar();
            bandera = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al guardar datos en la base "+e.getMessage());
            bandera = false;
        }
        return bandera;
    }
    
    public boolean delete(String dat){
        boolean bandera = false;
        System.out.println("parametros de entrada ==> " +dat);
        ConexionBase con = new ConexionBase();
        try {
            
            Statement st=ConexionBase.obtener().createStatement();
            st.executeUpdate("delete from cat_motor where tipo_motor='"+dat+"'");
            con.cerrar();
            bandera = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al datos en la base "+e.getMessage());
            bandera = false;
        }
        return bandera;
    }
}
