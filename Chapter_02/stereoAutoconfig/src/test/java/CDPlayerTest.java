import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CDPlayerConfig;
import soundsystem.CompactDisc;
import soundsystem.MediaPlayer;

import static org.junit.Assert.assertNotNull;

/**
 * Created by hebei on 2017/8/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
//    @Rule
//    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired //@Inject
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotNull() {
        assertNotNull(cd);
    }

}
