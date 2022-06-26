package Figuras1;

public abstract class Figuras {

    private int nlados;
    private double tlado;

    public Figuras(int nlados, double tlado) {
        this.nlados = nlados;
        this.tlado = tlado;
    }

    public int getNlados() {
        return nlados;
    }

    public void setNlados(int nlados) {
        this.nlados = nlados;
    }

    public double getTlado() {
        return tlado;
    }

    public void setTlado(double tlado) {
        this.tlado = tlado;
    }

    private double Perimetro(){
        return getTlado()+getTlado()+getTlado();
    }
    private double Area(){
        return getTlado()*getTlado();
    }

    @Override
    public String toString(){
        return "El "+getClass()+"\ntiene : " +Perimetro()+" de perimetro y "+Area()+" de area";
    }
}