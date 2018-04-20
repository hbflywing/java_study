package win.sz90.design_pattern.g3_struct.p18_adapter;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.printf("Playing mp4 file Name:"+fileName);
    }
}
