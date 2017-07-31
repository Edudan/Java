
package herencia;

import javax.swing.JOptionPane;


public class Venta extends Automovil{
    
    public double precio;

    public Venta(double llanta, String color, String marca, int año) {
        super(llanta, color, marca, año);
        
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    public void preventa(){
        
        JOptionPane.showMessageDialog(null,"Preventa");
        
    }
    
    public static void main(String[] args) {
        
        Venta v= new Venta(20.5, "Rojo", "Nissan", 2009);
                v.preventa();
                v.setPrecio(45000);
                System.out.println ( "color: "+v.getColor()+" LLanta: " +v.getLlanta()+" Marca: "+v.getMarca()+ " Año: "+v.getAño()+" precio: "+v.getPrecio());
                
        
        
    }
    
   
    
    
    
    
}
