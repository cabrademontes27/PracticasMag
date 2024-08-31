package Equipo1;

public abstract class Character {
    private String nombre;
    private int health;
    private int level;

    public Character(String nombre, int health, int level) {
        this.nombre = nombre;
        this.health = health;
        this.level = level;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void showStatusCharacter() {
        System.out.println(this.nombre + " tiene " + this.health + " puntos de vida y es nivel: " + this.level);
    }

    public abstract void attack(Character enemy);

    public abstract void heal();

    public abstract void useSpecialAbility(Character enemy);
}
