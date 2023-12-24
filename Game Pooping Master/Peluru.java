import greenfoot.*;

public class Peluru extends Actor {
    private int speed = 5;
    private int fallSpeed = 0; // Kecepatan jatuh
    private int acceleration = 1; // Percepatan jatuh (gravitasi)

    public Peluru() {
        GreenfootImage image = getImage();
        image.scale(25, 25);
        setImage(image);
    }

    public void act() {
        move(-speed);
        applyGravity();
        checkCollision();
    }

    private void applyGravity() {
        fallSpeed += acceleration;
        setLocation(getX(), getY() + fallSpeed);
    }

    private void checkCollision() {
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
