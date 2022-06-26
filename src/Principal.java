import Figuras1.Hexagono;
import Figuras1.Paralelogramo;
import Figuras1.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Figuras> figuras = new ArrayList<Figuras> () ;
    public static void llenarDatos(){
        Scanner entrada = new Scanner(System.in);
        int op;
        int i=0;
        double lado;
        do {
            do {
                System.out.println("    >> FIGURA "+(i+1)+" << ");
                System.out.print("1.-Triangulo" +
                        "\n2.-Paralelogramo" +
                        "\n3.-Pentagono" +
                        "\n4.-Hexagono" +
                        "\n0.-Salir" +
                        "\nEscoja una de las opciones: ");
                op=entrada.nextInt();
                if(op>4 || op<0){
                    System.out.println("Opcon fuera de rrango intentelo de nuevo: ");
                }
            }while(op>4 || op<0);
            i++;
            switch (op){
                case 1:
                {
                    double base;
                    double altura;
                    System.out.println("           TRIANGULO");
                    System.out.print("Lado: ");
                    lado=entrada.nextDouble();
                    System.out.print("Base: ");
                    base=entrada.nextDouble();
                    System.out.print("Altura: ");
                    altura=entrada.nextDouble();
                    Triangulo triangulo = new Triangulo(3,lado,base,altura);
                    figuras.add(triangulo);
                    break;
                }
                case 2:
                {
                    double base;
                    double altura;
                    double lado2;
                    System.out.println("           PARALELOGRAMO");
                    System.out.print("Lado 1: ");
                    lado=entrada.nextDouble();
                    System.out.print("Lado 2: ");
                    lado2=entrada.nextDouble();
                    System.out.print("Base: ");
                    base=entrada.nextDouble();
                    System.out.print("Altura: ");
                    altura=entrada.nextDouble();
                    Paralelogramo paralelogramo = new Paralelogramo(4,lado,lado2,base,altura);
                    figuras.add(paralelogramo);
                    break;
                }
                case 3:
                {
                    System.out.println("           PENTAGONO");
                    double apotema;
                    System.out.print("Lado >> ");
                    lado=entrada.nextDouble();
                    System.out.print("Apotema >> ");
                    apotema=entrada.nextDouble();
                    Pentagono pentagono1= new Pentagono(5,lado,apotema);
                    figuras.add(pentagono1);
                }
                case 4:
                {
                    System.out.println("           HEXAGONO");
                    double apotema;
                    System.out.print("Lado: ");
                    lado=entrada.nextDouble();
                    System.out.print("Apotema: ");
                    apotema=entrada.nextDouble();
                    Hexagono hexagono1= new Hexagono(6,lado,apotema);
                    figuras.add(hexagono1);
                }
                System.out.println("Volver al menu S/N");
            }
        }while (op!=0);
    }
    public static void mostrar(){
        int i=0;
        for(Figuras poli: figuras){
            System.out.println("                 |FIGURA "+(i+1)+"|");
            i++;
            System.out.println(poli.toString());
        }
    }
    public static void main(String[] args) {
        llenarDatos();
        mostrar();
    }
}

