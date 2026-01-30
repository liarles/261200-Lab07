public class Main {
    public static void main(String[] args) {
        Character John = new Character(50,100);
        John.swingSword();
        John.swingSword();
        John.swingSword();
        John.swingSword();
        John.swingSword();
        John.swingSword();
        John.takeDamage(30);
        John.takeDamage(60);
        John.takeDamage(20);
        John.takeDamage(60);

        John.rest();
        John.CheckCharacter();


        John.takeDamage(60);
        John.takeDamage(60);
        John.CheckCharacter();
        John.swingSword();

    }
}