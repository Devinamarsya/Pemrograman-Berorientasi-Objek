import greenfoot.*;

public class StartButton extends Actor {
    public StartButton() {
        GreenfootImage image = getImage(); // Dapatkan gambar default dari actor
        image.scale(330, 330); // Atur ukuran gambar sesuai kebutuhan
        setImage(image);
    }
    
      public void addedToWorld(World world) {
        // Di panggil saat objek ditambahkan ke dunia
        int worldWidth = world.getWidth();
        int worldHeight = world.getHeight();
        int buttonWidth = getImage().getWidth();
        int buttonHeight = getImage().getHeight();

        // Set posisi StartButton di tengah dunia
        int x = (worldWidth - buttonWidth) / 2+160;
        int y = (worldHeight - buttonHeight) / 2+310;   

        setLocation(x, y);
    }

    public void act() {

        if (Greenfoot.mouseClicked(this)) {
            startGame();
        }
    }

   private void startGame() {
        // Hentikan musik sebelum membuat dunia baru
        GreenfootSound bgm = ((MenuStart) getWorld()).getBgm();
        if (bgm != null && bgm.isPlaying()) {
            bgm.stop();
        }

        MyWorld world = new MyWorld();
        Greenfoot.setWorld(world);
        world.startGame();
    }
}