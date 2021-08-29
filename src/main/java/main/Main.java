package main;

public class Main {
    public static void main(String[] args) {

        Condominio condominio = new Condominio();
        Inmueble inmueble1 = new Inmueble("12A", "1234",1234,12);
        Inmueble inmueble2 = new Inmueble("12B", "1234",1234,12);
        Inmueble inmueble3 = new Inmueble("12A", "1234",1234,12);


        condominio.agregarInmueble(inmueble1);
        condominio.agregarInmueble(inmueble2);
        condominio.agregarInmueble(inmueble3);


        for(Inmueble inmueble : condominio.getInmuebles()){
            System.out.println(inmueble);
        }
    }
}
