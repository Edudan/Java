
package polimorfismo;

public class Main extends Figuras2{
    

    public Main(int base, int altura) {
        super(base, altura );
    }
    
    public static void main(String[] args) {
        
        Cuadrado c = new Cuadrado(5, 5 );
        c.setName("cuadrado  // suma");
        c.area();
        
        Triangulo t = new Triangulo(5, 5);
        t.setName("Triangulo // resta");
        t.area();
        
    }
}
