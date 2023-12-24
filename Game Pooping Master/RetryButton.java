import greenfoot.*;

public class RetryButton extends Actor {
    private static final int buttonWidth = 200;
    private static final int buttonHeight = 200;
    private boolean buttonClicked = false;

    public RetryButton() {
        GreenfootImage image = getImage();
        image.scale(buttonWidth, buttonHeight);
        setImage(image);

        World currentWorld = getWorld();
        if (currentWorld != null) {
            int worldWidth = currentWorld.getWidth();
            int worldHeight = currentWorld.getHeight();

            int x = (worldWidth - buttonWidth) / 2;
            int y = (worldHeight - buttonHeight) / 2 + 145;

            setLocation(x, y); // Set the initial location
        }
    }

    public void act() {
        if (Greenfoot.mouseClicked(this) && !buttonClicked) {
            buttonClicked = true;
            Greenfoot.setWorld(new MenuStart()); // Gantilah dengan kelas dunia yang sesuai
            // Tambahkan perintah untuk menghapus RetryButton setelah diklik
            getWorld().removeObject(this);
        }
    }
}
