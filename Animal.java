
package abstracta;

//animal     no se puede instanciar
public abstract class Animal {
    
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void Comer(){
            
        System.out.println("El " + name + " esta Comiendo");
    
    }
    
    //metodo abstarct
    public abstract void Moverse();
    
    
    
    

   
    
}
