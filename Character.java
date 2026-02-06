public class Character {
    private int Health;
    private int Stamina;
    private final int maxHealth;
    private final int maxStamina;

    public Character(){
        this.maxHealth = 100;
        this.Health = maxHealth;
        this.maxStamina = 50;
        this.Stamina = maxStamina;
        System.out.println("Character create with "+ Health + " and " + Stamina + " Stamina" );
    }
    public Character(int health, int stamina){
        this.maxHealth = health;
        this.Health = maxHealth;
        this.maxStamina = stamina;
        this.Stamina = maxStamina;
        System.out.println("Character create with "+ Health + " and " + Stamina + " Stamina" );
    }
    public void getHealth(){
        System.out.println("Character health = " + this.Health);
    }
    public void getStamina(){
        System.out.println("Character Stamina = " + this.Stamina);    }

    public void CheckCharacter(){
        System.out.println("Character's health: "+ Health + ", Stamina: "  + Stamina + ".");
    }
    public void swingSword(){
        if (Health == 0){
            System.out.println("Character is dead, What can a corpse do?");
        }
        else if (Stamina > 0){
            this.Stamina = Stamina - 10;
            if (Stamina < 0) Stamina = 0;
            System.out.println("Character swings the sword. Stamina is now " + Stamina + ".");
            if (Stamina == 0) System.out.println("Your character needs to cool down.");
        }
        else{
            System.out.println("Your character needs to cool down.");
        }
    }
    public void takeDamage(int damage){
//        if (Stamina == 0 && Health > 0) System.out.println("My man is so tired,and you still hit him?");

        if (Health > 0){
            this.Health = Health - damage;
            if (Health < 0) Health = 0;
            System.out.println("Character takes " + damage + " damage. Health is  "+ Health + ".");
            if (Health == 0) System.out.println("Character is dead.");

        }
        else{
            System.out.println("Character is dead.");
        }
    }
    public void rest(){
        this.Health = maxHealth;
        this.Stamina = maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }



}
