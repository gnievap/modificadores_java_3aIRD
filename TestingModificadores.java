import paquete.Clase1; // Usar clases que estén en paquetes

public class TestingModificadores {
    public static void main(String[] args) {
        ClasePadre unPapa = new ClasePadre();
        ClaseHijo unHijo = new ClaseHijo();
        Clase1 objeto1 = new Clase1();

        System.out.println();
        System.out.println(unPapa.toString());
        
        unPapa.campo1 = -28; //modificar el campo público
        unPapa.setCampo2(-12); // modificar el campo privado
        
        System.out.println(unPapa.toString());

        //Comportamiento de campo privado y publico en el hijo
        unHijo.campo1 = 32; // campo público heredado
        unHijo.setCampo2(-45); // campo privado heredado
        unHijo.setCampo3(12); // campo privado propio

        System.out.println(unHijo.toString());

        //Comportamiento de campos de una clase en un paquete
        objeto1.x = 56; // campo público
        objeto1.setY(42); // campo privado

        // No se puede acceder porque no está en el mismo paquete
        // y es tipo protected
        // objeto1.z = 98;
        System.out.println(objeto1.toString());



    }
    
}
