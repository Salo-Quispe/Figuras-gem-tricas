package Figuras1;

public class Paralelogramo extends Figuras{
    private double ladob;
    private double base;
    private double altura;


    public Paralelogramo(int nlados, double tlado, double ladob, double base, double altura) {
        super(nlados, tlado);
        this.ladob = ladob;
        this.base = base;
        this.altura = altura;
    }
    public double getLadob() {
        return ladob;
    }

    public void setLadob(double ladob) {
        this.ladob = ladob;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double Perimetro(){
        return 2*getTlado()+2*getLadob();
    }
    private double Area(){
        return (getBase()*getAltura());
    }
}
