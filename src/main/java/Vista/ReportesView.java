package Vista;

import Controlador.ReportesControlador;
import Modelo.Informe1vo;
import Modelo.Informe2vo;
import Modelo.Informe3vo;
import java.sql.SQLException;
import java.util.List;

public class ReportesView {
    private static ReportesControlador controlador;
    
    public ReportesView() {
        controlador = new ReportesControlador();
    }
    
    public void Informe1 (){
        try{
            List<Informe1vo> proyectos = controlador.ListaInforme1();
            for(Informe1vo proyecto : proyectos){
                System.out.println(proyecto);
            }
        }catch (SQLException e){
            System.err.println("Error: "+e);
        }
        }
    public void Informe2 (){
        try{
            List<Informe2vo> proyectos = controlador.ListaInforme2();
            for(Informe2vo proyecto : proyectos){
                System.out.println(proyecto);
            }
        }catch (SQLException e){
            System.err.println("Error: "+e);
        }
    }
    public void Informe3 () {
        try{
            List<Informe3vo> proyectos = controlador.ListaInforme3();
            for(Informe3vo proyecto : proyectos){
                System.out.println(proyecto);
            }
        }catch (SQLException e){
            System.err.println("Error: "+e);
        }
    }
    }  
