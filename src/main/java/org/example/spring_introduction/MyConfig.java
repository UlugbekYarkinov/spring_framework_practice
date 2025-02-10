package org.example.spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:application.properties")
//@ComponentScan("org.example.spring_introduction") //scanning is not used in the second Method
//and the @Component annotation is also not needed as this annotation is used for scanning
public class MyConfig {
    //in the second method all beans and DI (no need for @Autowiring as well) are described in one place HERE
    @Bean
    @Scope("singleton")
    public Pet catBean() { //bean id is the name of the method (catBean)
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }


}
