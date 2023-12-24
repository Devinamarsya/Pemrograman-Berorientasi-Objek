import greenfoot.*;

public class Obstacle extends Actor {
    private int speed;
    private boolean removed;

    public Obstacle(int speed) {
        this.speed = speed;
    }

    public void act() {
        if (getWorld() != null && !removed) {
            move(-speed);
            checkCollision();
            checkGroundBoundary();
        }
    }

    private void checkCollision() {
    // Check if the obstacle is still in the world
    if (getWorld() != null) {
        // Get the obstacle object that collides with the hero
        Obstacle obstacle = (Obstacle) getOneIntersectingObject(Obstacle.class);

        // If there's a colliding obstacle, trigger the onCollision method of the hero
        if (obstacle != null) {
            removeSelfFromWorld();
        }
    }
}

    private void checkGroundBoundary() {
        if (getWorld() != null && getY() > getGroundLevel() && !removed) {
            removeSelfFromWorld();
        }
    }

    protected int getSpeed() {
        return speed;
    }

    protected int getGroundLevel() {
        return 400;  // Update this with the actual ground level
    }

    private void removeSelfFromWorld() {
        if (getWorld() != null) {
            getWorld().removeObject(this);
            removed = true;
        }
    }

    // Metode untuk meningkatkan kecepatan secara bertahap
    public void increaseSpeed() {
        speed += 1;  // Anda dapat menyesuaikan besarnya peningkatan kecepatan
    }
}
