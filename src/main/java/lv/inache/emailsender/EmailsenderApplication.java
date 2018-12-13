package lv.inache.emailsender;

import com.sparkpost.exception.SparkPostException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


@SpringBootApplication
@ImportResource("classpath:spring-config.xml")
public class EmailsenderApplication {

    private final static Logger LOGGER = LoggerFactory.getLogger(EmailsenderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EmailsenderApplication.class, args);

    }
}
