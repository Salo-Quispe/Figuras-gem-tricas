package Figuras1;

public class Hexagono extends Figuras{
    private double apotema;

    public Hexagono(int nlados, double tlado, double apotema) {
        super(nlados, tlado);
        this.apotema = apotema;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;}

    private double Perimetro(){
        return 6*getTlado();
    }
    private double Area(){
        return (Perimetro()*getApotema())/2;
    }
}
