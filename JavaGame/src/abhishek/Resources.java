package abhishek;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
//import javafx.scene.media.AudioClip;
import java.awt.*;
import  java.io.IOException;
import java.util.Objects;

abstract public class Resources {
    private static Image grassImage;
    private static Image blockImage;
    private static Image playerJumpImage;
    private static Image[] playerImages;

    private static AudioClip jumpAudio;
    private static AudioClip hitAudio;

    private static Font titleFont;

    public static void load(){
        playerImages = new Image[8];
        try{
            grassImage =ImageIO.read(Objects.requireNonNull(Resources.class.getClassLoader().getResourceAsStream("abhishek/images/grass.png")));
            blockImage = ImageIO.read(Objects.requireNonNull(Resources.class.getClassLoader().getResourceAsStream("abhishek/images/block.png")));
            playerJumpImage = ImageIO.read(Objects.requireNonNull(Resources.class.getClassLoader().getResource("abhishek/images/jump.png")));

            playerImages[0] = ImageIO.read(Objects.requireNonNull(Resources.class.getClassLoader().getResource("abhishek/images/run_anim1.png")));
            playerImages[1] = ImageIO.read(Objects.requireNonNull(Resources.class.getClassLoader().getResource("abhishek/images/run_anim2.png")));
            playerImages[2] = ImageIO.read(Objects.requireNonNull(Resources.class.getClassLoader().getResource("abhishek/images/run_anim3.png")));
            playerImages[3] = ImageIO.read(Objects.requireNonNull(Resources.class.getClassLoader().getResource("abhishek/images/run_anim4.png")));
            playerImages[4] = ImageIO.read(Objects.requireNonNull(Resources.class.getClassLoader().getResource("abhishek/images/run_anim5.png")));
            playerImages[5] = playerImages[3];
            playerImages[6] = playerImages[2];
            playerImages[7] = playerImages[1];
        }catch (IOException e){
            System.out.println("Image Loading Failed with error:" +e.getMessage());

        }
        jumpAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("abhishek/audios/onjump.wav"));
        hitAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("abhishek/audios/hit.wav"));
        titleFont = new Font("Comic Sans MS", Font.BOLD, 30);
    }
    public static Image getGrassImage(){
        return grassImage;
    }
    public static Image getBlockImage() {
        return blockImage;
    }

    public static Font getTitleFont() {
        return titleFont;
    }

    public static Image getPlayerJumpImage() {
        return playerJumpImage;
    }

    public static Image[] getPlayerImages() {
        return playerImages;
    }

    public static AudioClip getJumpAudio() {
        return jumpAudio;
    }

    public static AudioClip getHitAudio() {
        return hitAudio;
    }
}

