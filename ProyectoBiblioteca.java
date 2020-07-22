package proyectoblibliteca;

import Interfaces.InicioSecion;
import clases.ConectarBD;
import java.sql.Connection;
import java.sql.ResultSet;

public class ProyectoBlibliteca {

    public static void main(String[] args) {
        ConectarBD c;
        Connection reg;
        ResultSet r; 
        
        c = new ConectarBD();
        reg=c.getConnection();
        
        if(c.getConnection()!=null){
            InicioSecion princi = new InicioSecion() {};
            princi.setVisible(true);
        }
        
    }
    
}