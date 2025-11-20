package prueba1;

public class Main {
    public static void main(String[] args) {
    Coche objCoche = new Coche("A4", "B", 250);
    Coche objCoche2 = new Coche("Dacia", "Sandero", "eco", 110);

    objCoche.setMarca("Audi");
    objCoche.mostrarInformacion();
    boolean etiqueta = objCoche.comprobarZBE(objCoche.getEtiquetaEco());
    System.out.println("¿Puede pasar a la ZBE?: " + etiqueta);
    int diffVeloci = objCoche.sobrepasarVelocidadMax(objCoche.getVelocidadMax());
    System.out.println("Sobre pasa la velocidad en: " + diffVeloci + " km/h");

    objCoche2.mostrarInformacion();
    boolean etiqueta2 = objCoche2.comprobarZBE(objCoche2.getEtiquetaEco());
    System.out.println("¿Puede pasar a la ZBE?: " + etiqueta2);
    int diffVeloci2 = objCoche2.sobrepasarVelocidadMax(objCoche2.getVelocidadMax());
    System.out.println("Sobre pasa la velocidad en: " + diffVeloci2 + " km/h");


    //Ejemplos del static
        objCoche2.EjemploSinStatic();
        Coche.EjemploConStatic();

    }
}
