/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Rabbit
 */
package pbo210116397latihan53rabbit;

/**
 *
 * @author Zetro
 */
public class Rabbit extends Animal{
    
     private String color;
    private String name;
   
    
    public Rabbit(String name, boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.name = name;
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
        this.color = color;
        
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
    
}
