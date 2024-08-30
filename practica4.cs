using System;

public abstract class Character {
    private String name;
    private int health;
    private int level;

    public Character(String _name, int _health, int _level) {
        this.name = _name;
        this.health =_health;
        this.level =_level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void showStatusCharacter(){
        Console.WriteLine(this.name + "tiene" + this.health + "puntos de vida y es nivel "+ this.level);
    }

    public abstract void attack(Character enemy);
    public abstract void heal();
    public abstract void useSpecialAttack(Character enemy);
}


public class Warrior : Character{
    private String weapon;

    public Warrior(String name, int health, int level, String _weapon, String _name , int _level, int _health) : base(_name,_health,_level)
    {
        this.weapon = _weapon;
    }

    public void upgradeWeapon(){
        Console.WriteLine("EL guerrero " + getName() + "ha mejorado su " + this.weapon);
        int level = getLevel();
        setLevel(++level);
    }
    
    
    public override void attack(Character enemy){
        Console.WriteLine("El gerrero " + getName() + "ataca a " + enemy.getName());
        int damage = 15*20;
        int healthEnemy = enemy.getHealth();
        enemy.setHealth(healthEnemy - damage);
    }

    public override void heal() {
        int healing = 30*15;
        int heal = getHealth();
        Console.WriteLine(getName() + "ha regenerado " + healing + "puntos de vida");
    }

    
    public override void useSpecialAttack(Character enemy) {
        Console.WriteLine("El mago " + getNombre() + " ataca a " + enemy.getNombre() + " con su super");
        int enemyHealth = enemy.getHealth();
        int damage = 15 * 40 + 1;
    }
}