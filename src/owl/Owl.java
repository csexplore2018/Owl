/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package owl;

/**
 *
 * @author gc_science3
 */
public class Owl {

    public String name = "Owl";
    public String food = "Mice";
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal a = new Animal();
        a.talk();
        System.out.println(a.name);
        
        MaleOwl m = new MaleOwl();
        m.talk();
        System.out.println(m.name);
        
        Owlette o = new Owlette();
        o.talk();
        System.out.println(o.name);
        
    }
    
}

class Animal{
    public String name = "Animal";
    public String food = "Food";
    
    public void talk(){
        System.out.println("hey");
    }
}

class MaleOwl extends Animal{
    public void talk(){
        System.out.println("ney");
    }
}

class Owlette extends Animal{
    
    public String name = "Hedwig";
    
    public void talk(){
        System.out.println("YOYO");
    }
}