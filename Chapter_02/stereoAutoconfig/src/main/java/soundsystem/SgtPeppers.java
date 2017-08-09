package soundsystem;

/**
 * Created by hebei on 2017/8/2.
 */
//@Component
//@Component("")
public class SgtPeppers implements CompactDisc {
    private String title = "SgtTitle";
    private String artist = "Beatles";

    public void play() {
        System.out.println("title is " + title);
    }
}
