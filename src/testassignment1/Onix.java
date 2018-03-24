/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testassignment1;

/**
 *
 * @author javierzapata
 */
public class Onix extends Pokemon {
    
    
    
    public Onix (){
        super(100,30, 60, "Onix");
    }
    
    
    @Override
    public void tackle(Pokemon pokemon){
        super.tackle(pokemon);
        System.out.println(this.getType() + " tackles " + pokemon.getType() + "!");
        
    }
   
    public void rockSlide(){
        System.out.println("The Onix buries its opponent in a rock slide!");
    }
    
}
