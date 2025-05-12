package adapter1.classes;

public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        // nu face nimic
    }
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}