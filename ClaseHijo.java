import paquete.Clase1;

public class ClaseHijo extends ClasePadre{
    private int campo3;

    public int getCampo3(){
        return this.campo3;
    }

    public void setCampo3(int campo3){
        this.campo3 = campo3;
    }

    //Modificar los campos de la ClasePadre
    public void setDataPadre(){
        this.campo1 = -56;  // variable pública heredada
        // variable privada heredada
        this.setCampo2(23); //super.setCampo2(23); setCampo2(23);
    }

    public void useClase1(){
        Clase1 objeto1 = new Clase1();
        objeto1.x = 15;
        objeto1.setY(14);
        // objeto1.z = 9;  protected
        // objeto1.w = 49; default pero en otro paquete
        // objeto1.restW(); default pero en otro paquete
        
    }

     @Override
    public String toString() {
        return super.toString() + "ClaseHijo [campo3=" + this.campo3 + "]";
    }

}