package win.sz90.design_pattern.g3_struct.p18_adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.printf("Playing vlc file name:"+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
