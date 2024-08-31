package Equipo1;

public class Main {
    public static void main(String[] args) {
        Character guerrero = new Warrior("Mag", 100, 3, "Palmada aria");
        Character mago = new Wizard("Merlin", 80, 7, "bolita de fuego");
        Warrior guerrero1 = (Warrior) guerrero;

        guerrero.showStatusCharacter();
        mago.showStatusCharacter();

        guerrero1.upgradeWeapon();
        guerrero.showStatusCharacter();

    }
}
