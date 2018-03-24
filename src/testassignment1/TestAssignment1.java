
package testassignment1;


public class TestAssignment1 {


    public static void main(String[] args) {
        
        Bulbasaur bulba = new Bulbasaur();
        Charmander charm = new Charmander();
        Onix onix = new Onix();
        Squirtle squirt = new Squirtle();
        System.out.println("health of charmander " + charm.getHp());
        bulba.tackle(charm);
        
        
        System.out.println("What is bulbasuars type: " + bulba.getType());
        System.out.println("health of charmander after tackle " + charm.getHp());
        System.out.println("health of onix " + onix.getHp());
        
        
        System.out.println();
        
        System.out.println("health of 1 " + bulba.getHp());
        System.out.println("health of 2 " + bulba.getHp());
        
       
        
        System.out.println(bulba.getType());
        
        IEvolvable[] evolvers = {bulba,charm, squirt};
        System.out.println();
        for (IEvolvable e: evolvers) {
            e.evolve();
        }
        System.out.println();
        System.out.println("charm's next evolution is " + charm.getNextEvolution());
        
        System.out.println("Lets do another evolution!!!");
        System.out.println();
        
        for (IEvolvable e: evolvers) {
            e.evolve();
        }
        
        
        
        
        
        
    }
    
}
