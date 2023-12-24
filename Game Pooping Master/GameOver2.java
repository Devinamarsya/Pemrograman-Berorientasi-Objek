import greenfoot.*;

public class GameOver2 extends World {

    private boolean gameOverDisplayed = false;

    public GameOver2() {
        // Tentukan ukuran dunia
        super(1080, 500, 1);

        GreenfootImage image = new GreenfootImage("C:/Users/ASUS/Downloads/gameover.png");
        image.scale(500, 175);

        // Tetapkan gambar sebagai latar belakang
        GreenfootImage background = new GreenfootImage(getWidth(), getHeight());
        background.drawImage(image, (getWidth() - image.getWidth()) / 2, (getHeight() - image.getHeight()) / 2);
        setBackground(background);

        // Panggil metode prepare untuk menambahkan objek RetryButton
        prepare();
    }

    private void prepare() {
        if (!gameOverDisplayed) {
            addObject(new RetryButton(), getWidth() / 2 - 5, getHeight() / 2 + 145);
            gameOverDisplayed = true;
        }
    }
}
