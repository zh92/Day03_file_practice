package sdf;

public class Tree implements Damagable {

    private int health = 10;

    public Tree() { }
    public Tree(int health) { this.health = health;
    }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    // computed property
    public boolean isDead() {
        return health <= 0;
    }

    @Override
    public void hit(int damage) {
        //this.health = this.health - damage;
        this.health -= damage;
    }

}