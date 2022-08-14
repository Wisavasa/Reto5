package Modelo;

import Util.JDBCUtilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Informe2dao {
    public List<Informe2vo> Listar() throws SQLException{
        ArrayList<Informe2vo> solucion= new ArrayList<>();
        Connection conect = JDBCUtilities.getConnection();
        PreparedStatement pstate= null;
        ResultSet Rset = null;
        String consulta = "SELECT ID_PROYECTO AS ID, CONSTRUCTORA, NUMERO_HABITACIONES AS HABITACIONES, CIUDAD \n" +
        "FROM PROYECTO P \n" +
        "WHERE CIUDAD IN('Santa Marta', 'Cartagena', 'Barranquilla')\n" +
        "AND CLASIFICACION = 'Casa Campestre'";
    try {
        pstate = conect.prepareStatement(consulta);
        Rset = pstate.executeQuery();
        while (Rset.next()) {
            Informe2vo objeto = new Informe2vo();
            objeto.setID(Rset.getInt("ID"));
            objeto.setCONSTRUCTORA(Rset.getString("CONSTRUCTORA"));
            objeto.setHABITACIONES(Rset.getInt("HABITACIONES"));
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
