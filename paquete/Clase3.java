package paquete;

public class Clase3 {
    Clase1 objeto1 = new Clase1();
    
    public void setDataClase1(){
        objeto1.x = 10; // usando la var. pública de Clase1
        // Sólo si la variable x es estática en Clase1
        // Clase1.x = 9;
        objeto1.w = 29; // aunque no hereda, puede usar w
        objeto1.restW(); //default
    }
}
