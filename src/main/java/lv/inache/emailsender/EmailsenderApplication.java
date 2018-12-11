package lv.inache.emailsender;

import com.sparkpost.exception.SparkPostException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//@SpringBootApplication
public class EmailsenderApplication {


    public static void main(String[] args) throws SparkPostException {
       // SpringApplication.run(EmailsenderApplication.class, args);

//        EMailService service = context.getBean(EMailService.class);
//
//        service.sendTextMail("imaghost@inbox.lv", "mail333", "text333");

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

        EMailService mailService = context.getBean("mailService",EMailService.class);
        mailService.sendTextMail("imaghost@inbox.lv","18.57,vtornik","payload");
    }
}
