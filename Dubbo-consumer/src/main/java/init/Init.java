package init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by lvyj on 2017/10/25.
 */
@SpringBootApplication
@ComponentScan(basePackages = "welv.com")
public class Init {
    public static void main(String[] args) {
        SpringApplication.run(Init.class, args);
    }
}
