public class ClasePadre{
    //miembros de la clase (propiedades, atributos, campos)
    public int campo1;  // aceptar sólo valores positivos
    private int campo2; // aceptar sólo valores negativos

    
    public int getCampo2() {
        return campo2;
    }

    public void setCampo2(int campo2) {
        if ( campo2 < 0 )
            this.campo2 = campo2;
        else 
            this.campo2 = 0;
    }

    @Override
    public String toString() {
        return "ClasePadre [campo1=" + this.campo1 + ", campo2=" + this.campo2 + "]";
    }

    
}