package evil.obstcorp.obstcorpbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObstcorpBackendApplication {

    public static void main(String[] args) {
        try {
            throw new Exception("Do hast doch nicht geglaubt, dass das einfach funktioniert? ;)");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
        SpringApplication.run(ObstcorpBackendApplication.class, args);
    }

}
