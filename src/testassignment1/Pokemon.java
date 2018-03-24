
package testassignment1;


// getId, getHP, getAttack, getDefense, setHP, setAttack, setDefense
public abstract class Pokemon  {
    
    private int id;
    private int hp;
    private int defense;
    private int attack;
    private String type;
    
    public Pokemon(int hp, int defense, int attack, String type){
    
        this.hp = hp;
        this.defense = defense;
        this.attack = attack;
        this.type = type;
    }
    
    public void tackle(Pokemon pokemon){
        pokemon.hp-=7;
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHp() {
        return hp;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
   
    
    

