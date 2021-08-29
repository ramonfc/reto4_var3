package main;

//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO

/**
 * Representa una casa dentro del Condominio
 */
public class Inmueble {

    //Inserte acá los atributos
    /**
     * número de la casa
     */
    private String nCasa;
    /**
     * documento de identidad del arrendador
     */
    private String IDArrendador;
    /**
     * costo mensual de la casa
     */
    private double costoMensual;
    /**
     * cantidad de meses que la casa lleva arrendada
     */
    private int cantidadMesesArrendado;



    //Inserte acá el método constructor

    public Inmueble(String nCasa, String IDArrendador, double costoMensual, int cantidadMesesArrendado) {
        this.nCasa = nCasa;
        this.IDArrendador = IDArrendador;
        this.costoMensual = costoMensual;
        this.cantidadMesesArrendado = cantidadMesesArrendado;
    }


    //Inserte acá los SETTERS Y GETTERS


    public String getnCasa() {
        return nCasa;
    }

    public void setnCasa(String nCasa) {
        this.nCasa = nCasa;
    }

    public String getIDArrendador() {
        return IDArrendador;
    }

    public void setIDArrendador(String IDArrendador) {
        this.IDArrendador = IDArrendador;
    }

    public double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(double costoMensual) {
        this.costoMensual = costoMensual;
    }

    public int getCantidadMesesArrendado() {
        return cantidadMesesArrendado;
    }

    public void setCantidadMesesArrendado(int cantidadMesesArrendado) {
        this.cantidadMesesArrendado = cantidadMesesArrendado;
    }


    // OTHER METHODS:

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;

        if(obj == null || this.getClass() != obj.getClass())
            return false;

        // obj is type Inmueble:
        Inmueble that = (Inmueble) obj;
        return this.nCasa.equals(that.getnCasa()) && this.IDArrendador.equals(that.getIDArrendador()) &&
                this.costoMensual == that.getCostoMensual() &&
                this.cantidadMesesArrendado == that.getCantidadMesesArrendado();
    }

    @Override
    public int hashCode(){
        int hash = 5;

        int nCasaHashCode = (null == nCasa) ? 0 : nCasa.hashCode();
        int IDArrendadorHashCode = (null == IDArrendador) ? 0 : IDArrendador.hashCode();
        int cantidadMesesArrendadoHashCode  = (int) cantidadMesesArrendado;

        long bits = Double.doubleToLongBits(costoMensual);
        int costoMensulHashCode = (int) (bits ^ (bits >>> 32));


        hash = 31 * hash + nCasaHashCode + IDArrendadorHashCode + cantidadMesesArrendadoHashCode + costoMensulHashCode;
        return hash;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "nCasa='" + nCasa + '\'' +
                ", IDArrendador='" + IDArrendador + '\'' +
                ", costoMensual=" + costoMensual +
                ", cantidadMesesArrendado=" + cantidadMesesArrendado +
                '}';
    }
}