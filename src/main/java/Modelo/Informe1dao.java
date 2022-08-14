package Modelo;

import Util.JDBCUtilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Informe1dao {
    public List<Informe1vo> Listar() throws SQLException{
        ArrayList<Informe1vo> solucion = new ArrayList<>();
        Connection conect = JDBCUtilities.getConnection();
        PreparedStatement pstate= null;
        ResultSet Rset = null;
        String consulta = "SELECT ID_LIDER AS ID, NOMBRE AS NOMBRE, PRIMER_APELLIDO AS APELLIDO, CIUDAD_RESIDENCIA AS CIUDAD\n" +
        "FROM LIDER L\n" +
        "ORDER BY CIUDAD_RESIDENCIA ASC";
    try {
        pstate = conect.prepareStatement(consulta);
        Rset = pstate.executeQuery();
        while (Rset.next()) {
            Informe1vo objeto = new Informe1vo();
            objeto.setID(Rset.getInt("ID"));
            objeto.setNOMBRE(Rset.getString("NOMBRE"));
            objeto.setAPELLIDO(Rset.getString("APELLIDO"));
            objeto.setCIUDAD(Rset.getString("CIUDAD"));
            solucion.add(objeto);
        }
    } finally {
        if (Rset != null){
            Rset.close();
            }
            if (pstate != null) {
            pstate.close();
            }
            if (conect != null){
            conect.close();
            }
            } 
        return solucion;
    }
}
