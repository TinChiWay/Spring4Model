package soundsystem;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hebei on 2017/8/2.
 */
//@Component
public class CDPlayer implements MediaPlayer {

    @Autowired
    private CompactDisc cd;

    public void play(){
        cd.play();
    }
}
