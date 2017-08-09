package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hebei on 2017/8/2.
 */
@Configuration
//@ComponentScan(basePackageClasses = {CDPlayer.class})
//@ComponentScan(basePackages = {"soundsystem","video"})
public class CDPlayerConfig {

    @Bean //(name = "")
    public CompactDisc sgtPeggers(){
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer();
    }
}
