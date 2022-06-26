package Figuras1;

public class Triangulo extends Figuras{
    private double base;
    private double altura;

    public Triangulo(int nlados, double tlado, double base, double altura) {
        super(nlados, tlado);
        this.base = base;
        this.altura = altura;
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
        return getTlado()+getTlado()+getTlado();
    }
    private double Area(){
        return (getBase()*getAltura())/2;
    }
}
