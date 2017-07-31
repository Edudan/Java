package polimorfismo;

import javax.script.ScriptEngine;

public class Figuras2 extends Figuras {

    public Figuras2(int base, int altura) {
        super(base, altura);
    }
}

class Cuadrado extends Figuras {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cuadrado(int base, int altura) {
        super(base, altura);
    }

    public void area() {

        int area = base + altura;
        System.out.println(name);
        System.out.println("base: " + getBase());
        System.out.println("altura: " + getAltura());
        System.out.println("area: " + area);

    }

}

class Triangulo extends Figuras {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Triangulo(int base, int altura) {
        super(base, altura);
    }

    public void area() {

        int area = base - altura;
        System.out.println(name);
        System.out.println("base: " + getBase());
        System.out.println("altura: " + getAltura());
        System.out.println("area: " + area);
    }

}
