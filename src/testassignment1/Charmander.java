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
public class Charmander extends Pokemon implements IEvolvable{
    
    private int evoStage = -1;
    private String[] evoNames = {"Charmeleon", "Charzard"};
    
    public Charmander(){
        super(100,30, 60, "Charmander");
    }
    
    
    @Override
    public void tackle(Pokemon pokemon){
        super.tackle(pokemon);
        System.out.println(this.getType() + " tackles " + pokemon.getType() + "!");
        
    }

    public String getEvoName(int num) {
        return evoNames[num];
    }
    
    @Override
    public void evolve(){
        String curEvolution = this.getType();
        this.evoStage++;
        this.setType(getEvoName(evoStage));
        System.out.println("The " + curEvolution + " has evolved into a/an " + this.getType());
    }
    
    @Override
    public String getNextEvolution(){
        int nextStage = evoStage+1;
        
        if (nextStage > evoNames.length-1) {
            return "nothing";
        } else {
            return evoNames[nextStage];
        }
    }
    
    public void ember(){
        System.out.println("The Charmander shoots a blast of fire!");
    }
    
}
