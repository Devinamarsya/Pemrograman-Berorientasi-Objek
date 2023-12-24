import greenfoot.*;

public class Hero extends Actor {
    private int velocity = 0;
    private int acceleration = 1;
    private int groundLevel = 400;
    private boolean removed;
    private boolean hasCollided = false;
    private GreenfootSound shootSound = new GreenfootSound("C:/Users/ASUS/Desktop/tes/prot2.mp3");
    private GreenfootSound overSound = new GreenfootSound("C:/Users/ASUS/Desktop/tes/over.mp3");

    public Hero() {
        GreenfootImage image = getImage();
        image.scale(60, 80);
        setImage(image);
    }

    public void onCollision(Obstacle obstacle) {
        if (!hasCollided) {
            hasCollided = true;
            handleCollision(obstacle, getWorld());
        }
    }

    private void handleCollision(Obstacle obstacle, World world) {
        setImage("Exploade.png");
        // Add more effects as needed

        world.removeObject(obstacle);
        Greenfoot.setWorld(new GameOver2());
        
        overSound.setVolume(100);
        overSound.play();
        
        stopBackgroundMusic();
    }

    private void checkCollision() {
        if (getWorld() != null && !hasCollided) {
            Obstacle obstacle = (Obstacle) getOneIntersectingObject(Obstacle.class);
            if (obstacle != null) {
                onCollision(obstacle);
                removeSelfFromWorld();
            }
        }
    }

    private void removeSelfFromWorld() {
        if (getWorld() != null) {
            getWorld().removeObject(this);
            removed = true;
        }
    }

    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            jump();
            shoot();
        }

        if (!Greenfoot.isKeyDown("space")) {
            applyGravity();
        }

        checkCollision();
    }

    private void jump() {
        velocity = -10;
        setLocation(getX(), getY() + velocity);
    }

    private void applyGravity() {
        if (getY() < groundLevel) {
            velocity += acceleration;
            setLocation(getX(), getY() + velocity);
        } else {
            setLocation(getX(), groundLevel);
            velocity = 0;
        }
    }

    private void shoot() {
        Peluru peluru = new Peluru();
        getWorld().addObject(peluru, getX(), getY() + getImage().getHeight() / 2);

        shootSound.setVolume(100);
        shootSound.play();
    }
    
    private void stopBackgroundMusic() {
        if (getWorld() instanceof MyWorld) {
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.stopBackgroundMusic();
        }
    }
}
