/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario.control;

import inventario.conection.ConexionBase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class Marca {
    
     public String getID(String marca) throws SQLException{
        String id="";
        String consulta="select * from marca where nombre_marca='"+marca+"'";
        ConexionBase con = new ConexionBase();
        try {
             System.out.println(consulta);      
            Statement sentencia= ConexionBase.obtener().createStatement();
            ResultSet resultado=sentencia.executeQuery(consulta);
            while (resultado.next())
            {
                System.out.println (resultado.getObject("id_marca") );
                id = resultado.getString("id_marca");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al consultar en la base marca"+e.getMessage());
           
            con.cerrar();
        }
        return id;
    }
    
}
