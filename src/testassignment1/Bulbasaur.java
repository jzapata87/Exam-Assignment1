
package testassignment1;


public class Bulbasaur extends Pokemon implements IEvolvable {
    
    
    private int evoStage = -1;
    private String[] evoNames = {"Vinesaur", "Ivysaur"};
    
    public Bulbasaur(){
        super(100,30, 60, "Bulbasaur");
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
    
    public void vineWhip(){
        System.out.println("The bulbasaur whips its opponent with a vine!");
    }

    
}
