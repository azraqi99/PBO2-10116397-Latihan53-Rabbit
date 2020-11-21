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
public class PBO210116397Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit tank = new Rabbit("Peter", false, "Grass", 4, "grey");
        System.out.println("Hello, his name is " + tank.getName());
        System.out.println(tank.getName() + " is Vegetarian? " + tank.isVegetarian());
        System.out.println(tank.getName() + " eats " + tank.getEats());
        System.out.println(tank.getName() + " has " + tank.getNoOfLegs() + " legs");
        System.out.println(tank.getName() + " color is " + tank.getColor());
    }
    
}
