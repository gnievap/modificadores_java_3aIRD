package paquete;

public class Clase1{
    public int x;
    private int y;
    protected int z;
    int w; // acceso por default

    public int getY(){
        return this.y;
    }

    public void setY(int y){
        this.y = y;
    }

    //Método con modificador de acceso por default
    void restW(){
        this.w -= 20;
    }

    @Override
    public String toString() {
        return "Clase1 [x=" + this.x + ", y=" + this.y +
         " z= " + this.z + "]";
    }

}