package Lesson1DZ;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "doctor")
    public Doctor doctor(){
        return new Therapist();
    } 

    @Bean(name = "registry")
    public Registry registry(Doctor doctor){
        Registry registry = new Registry();
        registry.setDoctor(doctor);
        return registry;
    }
}
