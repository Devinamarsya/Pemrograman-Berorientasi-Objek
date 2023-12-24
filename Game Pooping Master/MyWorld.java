import greenfoot.*;
import java.util.List;

public class MyWorld extends World {
    private int groundLevel = 50;
    private int obstacleTimer = 0;
    private int obstacleSpawnDelay = 100; // Delay spawn obstacle (sesuaikan dengan kebutuhan)
    private int obstacleSpeed = 3; // Kecepatan obstacle (sesuaikan dengan kebutuhan)
    private int spawnCounter;
    private int spawnInterval = 60; 
    private int score; 
    private GreenfootImage scoreImage = new GreenfootImage(100, 30);
    private GreenfootSound bgm = new GreenfootSound("C:/Users/ASUS/Desktop/tes/bgm.mp3");

    
    public MyWorld() {
        super(1080, 500, 1);
        prepare();
        showScore();
        bgm.setVolume(60);
        bgm.playLoop();

    }

    private void prepare() {
        addObject(new Hero(), 100, groundLevel);
        showMenu(); 
    }
    
   public void act() {
    spawnCounter++;
    // Setiap spawnInterval, tambahkan obstacle dan tingkatkan kecepatan
    if (spawnCounter == spawnInterval) {
        int spawnX = 1080; // Tetapkan nilai x spawn ke 1080

        // Batas bawah dan atas untuk posisi y
        int minY = 10;
        int maxY = 400;

        // Spawn di atas y=400, tetapi tidak melebihi batas atas
        int spawnY = minY + Greenfoot.getRandomNumber(maxY - minY);

        // Memilih obstacle secara acak untuk di-spawn
        int randomObstacleType = Greenfoot.getRandomNumber(3); // 0: Frog, 1: Snake, 2: Cockroach

        if (randomObstacleType == 0) {
            addObject(new Frog(), spawnX, 400);
        } else if (randomObstacleType == 1) {
            addObject(new Snake(), spawnX, 400);
        } else {
            addObject(new Cockroach(), spawnX, spawnY);
        }

        // Tingkatkan kecepatan setiap kali obstacle ditambahkan
        for (Object obj : getObjects(Obstacle.class)) {
            Obstacle obstacle = (Obstacle) obj;
            obstacle.increaseSpeed();
        }

        spawnCounter = 0; // Reset spawn counter
        spawnInterval = Greenfoot.getRandomNumber(100) + 50; // Atur interval spawn secara acak
    }
    updateScore();
    }

    private int frameCount = 0; // Variabel untuk menghitung jumlah frame
    private int scoreInterval = 10; // Update skor setiap 10 frame
    private void updateScore() {
        List<Obstacle> obstacles = getObjects(Obstacle.class);
        for (Obstacle obstacle : obstacles) {
            // Check if the obstacle is at the left boundary
            if (obstacleIsAtLeftBoundary(obstacle)) {
                removeObject(obstacle);
            }
        }
        frameCount++;
        if (frameCount >= scoreInterval) {
            frameCount = 0; // Reset frame count
            score += 1; // Tambahkan skor
            showScore(); // Update tampilan skor
        }
    }

    public void showScore() {
        GreenfootImage text = new GreenfootImage("Score: " + score, 24, Color.WHITE, Color.BLACK);
        getBackground().drawImage(text, 10, 10);
    }
    
    private boolean obstacleIsAtLeftBoundary(Obstacle obstacle) {
        return obstacle != null && obstacle.getX() <= 0;
    }

    public void startGame() {
        removeObject(getObjects(StartMenu.class).get(0)); // Hapus MenuStart setelah tombol "Start" ditekan
        removeObject(getObjects(StartButton.class).get(0)); // Hapus StartButton setelah tombol "Start" ditekan
        Greenfoot.start();
    }

    private void showMenu() {
        addObject(new StartMenu(), getWidth() / 2, getHeight() / 2);
        addObject(new StartButton(), getWidth() / 2, getHeight() / 2 + 50);
    }


    public void stopBackgroundMusic() {
        bgm.stop();
    }
    
}
