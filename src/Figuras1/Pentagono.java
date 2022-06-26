package Figuras1;

public class Pentagono extends Figuras {
    private double apotema;

    public Pentagono(int nlados, double tlado, double apotema) {
        super(nlados, tlado);
        this.apotema = apotema;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;}

    private double Perimetro(){
        return 5*getTlado();
    }
    private double Area(){
        return (Perimetro()*getApotema())/2;
    }

}
