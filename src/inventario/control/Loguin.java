/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario.control;

import inventario.conection.ConexionBase;
import inventario.entities.LoguinEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SergioCardoza
 */
public class Loguin {
    
    public LoguinEntity getID(String user, String pass) throws SQLException{
        LoguinEntity entity = new LoguinEntity();
        entity.setBandera(false);
        String usau="";
        String clave="";
        String rol ="";
        String consulta="select usuario,clave,nombres,id_rol,alias_empleado,area from loguin lo\n" +
        "inner join reg_usuario reg\n" +
        "on lo.id_loguin = reg.id_loguin\n" +
        "where usuario = '"+user+"'";
        ConexionBase con = new ConexionBase();
        try {
            System.out.println(consulta);      
            Statement sentencia=ConexionBase.obtener().createStatement();
            ResultSet resultado=sentencia.executeQuery(consulta);
            while (resultado.next())
            {
                System.out.println (resultado.getObject("usuario") );
                usau = resultado.getString("usuario");
                clave = resultado.getString("clave");
                rol = resultado.getString("id_rol");
            }
            if(user.equalsIgnoreCase(usau) && pass.equalsIgnoreCase(clave)){
                entity.setBandera(true);
                entity.setRol(rol);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al consultar datos en la base tipo  "+e.getMessage());
           
            con.cerrar();
        }
        return entity;
    }
    
    public String getIDLOguin(String user) throws SQLException{
        LoguinEntity entity = new LoguinEntity();
        entity.setBandera(false);
        String rol ="";
        String consulta="select * from loguin where usuario='"+user+"'";
        ConexionBase con = new ConexionBase();
        try {
            System.out.println(consulta);      
            Statement sentencia=ConexionBase.obtener().createStatement();
            ResultSet resultado=sentencia.executeQuery(consulta);
            while (resultado.next())
            {
                System.out.println (resultado.getObject("usuario") );
                
                rol = resultado.getString("id_loguin");
            }
           
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al consultar datos en la base tipo  "+e.getMessage());
           
            con.cerrar();
        }
        return rol;
    }
    
}
