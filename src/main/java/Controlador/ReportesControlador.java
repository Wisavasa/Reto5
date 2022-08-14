package Controlador;

import Modelo.Informe1dao;
import Modelo.Informe1vo;
import Modelo.Informe2dao;
import Modelo.Informe2vo;
import Modelo.Informe3dao;
import Modelo.Informe3vo;
import java.sql.SQLException;
import java.util.List;

public class ReportesControlador {
    private final Informe1dao Inf1;
    private final Informe2dao Inf2;
    private final Informe3dao Inf3;

    public ReportesControlador() {
        Inf1 = new Informe1dao();
        Inf2 = new Informe2dao();
        Inf3 = new Informe3dao();
    }
    public List<Informe1vo> ListaInforme1() throws SQLException{
        return Inf1.Listar();
    }
    public List<Informe2vo> ListaInforme2() throws SQLException{
        return Inf2.Listar();
    }
    public List<Informe3vo> ListaInforme3() throws SQLException{
        return Inf3.Listar();
    }
}
