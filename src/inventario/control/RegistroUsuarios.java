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
public class RegistroUsuarios {
    
    public boolean process(RegistroUsuariosEnt registroUsuariosEnt, String id){
        boolean bandera = false;
        System.out.println("parametros de entrada ==> " +registroUsuariosEnt.toString());
        ConexionBase con = new ConexionBase();
        try {
            
            Statement st=ConexionBase.obtener().createStatement();
            st.executeUpdate("insert into reg_usuario(id_loguin,nombres,alias_empleado,id_rol,area) value('"+id+"','"+registroUsuariosEnt.getNombre()+
                    "','"+registroUsuariosEnt.getAlias()+"',"+registroUsuariosEnt.getRol()+","+registroUsuariosEnt.getArea()+")");
            
            bandera = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al guardar datos en la base "+e.getMessage());
            bandera = false;
        }
        return bandera;
    }
    
    public boolean processLoguin(String usuario, String clave){
        boolean bandera = false;
        System.out.println("parametros de entrada ==> ");
        ConexionBase con = new ConexionBase();
        try {
            
            Statement st=ConexionBase.obtener().createStatement();
            st.executeUpdate("insert into loguin(usuario,clave) value('"+usuario+"','"+clave+"')");
            bandera = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al guardar datos en la base "+e.getMessage());
            bandera = false;
        }
        return bandera;
    }
    
}
