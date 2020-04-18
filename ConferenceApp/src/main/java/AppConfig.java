import jcourse.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import jcourse.pluralsight.repository.SpeakerRepository;
import jcourse.pluralsight.service.SpeakerService;
import jcourse.pluralsight.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"jcourse.pluralsight"})
public class AppConfig {

}
