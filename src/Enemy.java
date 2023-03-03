public class Enemy {
    private final int x;
    private final int y;
    private int health;
    private final int damage;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
        this.health = 10;
        this.damage = 2;
    }

    public void update() {
        // Update the enemy's state
        // ...
    }

    public void draw() {
        // Draw the enemy on the screen
        // ...
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            die();
        }
    }

    private void die() {
        // Handle enemy death
        // ...
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDamage() {
        return damage;
    }
}






