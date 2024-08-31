package Equipo1;

import java.util.random.RandomGenerator;

public class Warrior extends Character {
    private String weapon;

    public Warrior(String name, int health, int level, String weapon) {
        super(name, health, level);
        this.weapon = weapon;
    }
    public void upgradeWeapon(){
        System.out.println("El guerrero " + getNombre() + " ha mejorado su " + this.weapon);
        int level = getLevel();
        setLevel(++level);
    }

    @Override
    public void attack(Character enemy) {
        System.out.println("El guerrero " + getNombre() + " ataca a " + enemy.getNombre());
        int damage = (int)(Math.random()*20);
//        int healthEnemy = enemy.getHealth();
        enemy.setHealth(enemy.getHealth() - damage);
    }

    @Override
    public void heal() {
        int healing = (int)(Math.random()*15);
        int health = getHealth();
        System.out.println(getNombre() + " ha regenerado " + healing + " puntos de vida.");

    }

    @Override
    public void useSpecialAbility(Character enemy) {
        System.out.println("El guerrero " + getNombre() + " ataca a " + enemy.getNombre() + " con su super.");
        int enemyHealth = enemy.getHealth();
        int damage = (int)(Math.random()*45);
        enemy.setHealth(enemyHealth - damage);

    }
}
