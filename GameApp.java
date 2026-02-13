public class GameApp {
    public static void main(String[] args) {
        Character Knight = new Knight();
        Character Wizard = new Wizard();
        Character Archer = new Archer();

        System.out.println("\nDemo: Knight");
        Knight.attack();
        Knight.defend();

        System.out.println("\nDemo: Wizard");
        Wizard.attack();
        Wizard.defend();

        System.out.println("\nDemo: Archer");
        Archer.attack();
        Archer.defend();
    }
}