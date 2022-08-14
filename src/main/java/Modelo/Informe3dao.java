/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Util.JDBCUtilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Informe3dao {
    public List<Informe3vo> Listar() throws SQLException{
        ArrayList<Informe3vo> solucion= new ArrayList<>();
        Connection conect = JDBCUtilities.getConnection();
        PreparedStatement pstate= null;
        ResultSet Rset = null;
        String consulta = "SELECT ID_COMPRA AS ID, P.CONSTRUCTORA, P.BANCO_VINCULADO AS BANCO\n" +
        "FROM COMPRA C\n" +
        "JOIN PROYECTO P ON (P.ID_PROYECTO = C.ID_PROYECTO)\n" +
        "WHERE P.CIUDAD = 'Salento'\n" +
        "AND C.PROVEEDOR = 'Homecenter'";
    try {
        pstate = conect.prepareStatement(consulta);
        Rset = pstate.executeQuery();
        while (Rset.next()) {
            Informe3vo objeto = new Informe3vo();
            objeto.setID(Rset.getInt("ID"));
            objeto.setCONSTRUCTORA(Rset.getString("CONSTRUCTORA"));
            objeto.setBANCO(Rset.getString("BANCO"));
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
