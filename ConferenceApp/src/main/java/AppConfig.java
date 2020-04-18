import jcourse.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import jcourse.pluralsight.repository.SpeakerRepository;
import jcourse.pluralsight.service.SpeakerService;
import jcourse.pluralsight.service.SpeakerServiceImpl;
import jcourse.pluralsight.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"jcourse.pluralsight"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory() {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return  factory;
    }

    @Bean
    public Calendar cal() throws Exception{
        return calFactory().getObject();
    }

}
