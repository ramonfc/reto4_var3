package unitTest;

import main.Condominio;
import main.Inmueble;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CondominioTest {

    /**
     * Objeto tipo Condominio para pruebas
     */
    Condominio condominio;

    /**
     * método que será invocado antes de cada test.
     * asigna una lista de inmuebles al objeto condominio
     */
    @BeforeEach
    public  void ConfigCondominio(){
        condominio = new Condominio();
        Inmueble inmueble1 = new Inmueble("12A", "1234",1234,12);
        Inmueble inmueble2 = new Inmueble("12B", "1233",1000,2);
        Inmueble inmueble3 = new Inmueble("12C", "1233",989,7);
        Inmueble inmueble4 = new Inmueble("12D", "1230",1206,11);
        ArrayList<Inmueble> inmuebles= new ArrayList<Inmueble>();

        inmuebles.add(inmueble1);
        inmuebles.add(inmueble2);
        inmuebles.add(inmueble3);
        inmuebles.add(inmueble4);
        condominio.setInmuebles(inmuebles);
    }

    @Test
    @DisplayName("Calculando arriendo mensual en el condominio")
    public void testCalcularArriendoMensualCondominio(){

        double arriendoMensual = condominio.calcularArriendoMensualCondominio();
        Assertions.assertEquals(4429, arriendoMensual);
    }

    @Test
    @DisplayName("Agregando un inmueble")
    public void testAgregarInmueble(){
        int numInmuebles = condominio.getInmuebles().size();
        Inmueble inmueble1 = new Inmueble("13A", "1234",1234,12);
        Inmueble inmueble2 = new Inmueble("13A", "1234",1234,12);
        condominio.agregarInmueble(inmueble1);
        condominio.agregarInmueble(inmueble2);
        Assertions.assertEquals(numInmuebles + 1, condominio.getInmuebles().size());
    }

    @Test
    @DisplayName("Eliminado un inmueble")
    public void testEliminarInmueble(){
        int numInmuebles = condominio.getInmuebles().size();
        String IDinmueble = "12B";

        condominio.eliminarInmueble(IDinmueble);
        Assertions.assertEquals(numInmuebles - 1, condominio.getInmuebles().size());
    }

    @Test
    @DisplayName("Calculando promedio de costo de los inmuebles")
    public void testPromedioCostoInmueble(){
        double promedio = condominio.promedioCostoInmueble();
        Assertions.assertEquals(1107.25, promedio, 0.01);
    }

    @Test
    @DisplayName("Calculando desviación estandar de costo de los inmuebles")
    public void testDesviacionEstandarCostoInmueble(){
        double desvEstandar = condominio.desviacionEstandarCostoInmueble();

        Assertions.assertEquals(113.2506, desvEstandar, 0.01);
    }
}
