
package owl;


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
        
        Owr asian = new Owr();
        asian.talk();
        System.out.println(asian.name);
        
        InterfaceOwl owlie = new InterfaceOwl();
        owlie.talk();
        owlie.move();
        owlie.eat();
        owlie.sleep();
        
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
        System.out.println("hoot");
    }
}

class Owlette extends Animal{
    
    public String name = "Hedwig";
    
    public void talk(){
        System.out.println("hoat");
    }
}

class Owr extends Owlette{
    public String name = "Wong";
    
    public void talk(){
        System.out.println("Hello america I am wong hoot hoot");
    }
}

class InterfaceOwl extends Owr implements Actions{
    public String name = "kuya Eli";
    
    public void eat(){
        System.out.println(" yummy");
    }
    public void sleep(){
        System.out.println("ZZZZZZZ");
    }
    public void move(){
        System.out.println("FLAP FLAP FLAP");
    }
    public void talk(){
        System.out.println("hi frens");
    }
    
}


interface Actions{
    public void eat();
    public void sleep();
    public void move();
    public void talk();
}