///EJEMPLOS DE CLASE: METODOS 
public class Punto{
    private int x,y;
    public Punto(int x, int y){
        this.setX(x);
        this.setY(y);
    }
    public Punto(int xy){
        this(xy, xy);
    }
    public Punto(){
        this(0,0);
    }
    

    
    public double modulo () {
        // se calcula el modulo del vector con x,y
        return (double )  Math.sqrt(this.x*this.x + this.y*this.y);
    }
    public double fase () {
        double valor = 0;
        //se calcula la fase del vector con x,y
        return valor;
    }
    public void setX(int x){
        this.x = x;
    }
    //setx(30);
    public void setY(int y){
        this.y = y;
    }
    //sety(89);
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

}

