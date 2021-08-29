package main;
//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
import java.util.ArrayList;

/**
 * Representa un conjunto de casas. Permite calcular costos y algo de estadística refresente a estos.
 */
public class Condominio {

    //Inserte acá los atributos

    /**
     * lista de las casas ya arrendadas
     */
    private ArrayList<Inmueble> inmuebles;


    //Inserte acá el método constructor

    public Condominio() {
        inmuebles = new ArrayList<>();

    }


    //Inserte acá los SETTERS Y GETTERS

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }


    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)

    /**
     * Agrega el inmueble recibido como parámetro a la lista inmuebles si este NO está en
     * la lista (Dos inmuebles son diferentes si sus ID son diferentes)
     * @param i Es el inmueble por agregar a la lista inmuebles
     */
    /*
    public void agregarInmueble(Inmueble i){
        boolean isInCondominio= false;
        for(Inmueble inmueble : this.getInmuebles()){
            if(inmueble.getnCasa().equals(i.getnCasa())){
                isInCondominio = true;
                break;
            }
        }
        if(!isInCondominio){
            this.getInmuebles().add(i);
        }
    }
*/
    public void agregarInmueble(Inmueble i){

        if(!this.getInmuebles().contains(i)){
            this.getInmuebles().add(i);
        }
    }


    /**
     * Elimina el inmueble con nCasa igual al recibido por parámetro (ID)
     * @param ID Número del inmueble a eliminar de la lista inmuebles
     */
    public void eliminarInmueble(String ID){
        int index = -1;
        for(int i = 0; i < this.getInmuebles().size(); i++){
            if(this.getInmuebles().get(i).getnCasa().equals(ID)){
                index = i;
                break;
            }
        }
        if(index != -1)
        this.getInmuebles().remove(index);
    }

    /**
     *
     * @return suma de los arriendos mensuales de todas las casas que hay en inmuebles
     */
    public double calcularArriendoMensualCondominio(){
        double suma = 0;
        for(int i = 0; i < this.getInmuebles().size(); i++){
            suma += this.getInmuebles().get(i).getCostoMensual();
        }
        return suma;
    }

    /**
     *
     * @return promedio del costo de arriendo de todos los inmuebles
     */
    public double promedioCostoInmueble(){
        double promedio = this.calcularArriendoMensualCondominio() / this.getInmuebles().size();
        return promedio;
    }

    /**
     *
     * @return Retorna la desviación estándar del costo de arriendo de todos los inmuebles
     */
    public double desviacionEstandarCostoInmueble(){
        double promedio = this.promedioCostoInmueble();
        int numInmuebles = this.getInmuebles().size();
        double sum = 0;
        double desviacionEstandar;
        for(int i = 0; i < this.getInmuebles().size(); i++){
            sum += Math.pow(this.getInmuebles().get(i).getCostoMensual() - promedio, 2);
        }

        desviacionEstandar = Math.sqrt(sum / numInmuebles);
        return desviacionEstandar;
    }

}