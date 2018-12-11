package lv.inache.emailsender;

import com.sparkpost.exception.SparkPostException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class EmailsenderApplication {


    public static void main(String[] args) throws SparkPostException {
        ConfigurableApplicationContext context = SpringApplication.run(EmailsenderApplication.class, args);

//        EMailService service = context.getBean(EMailService.class);
//
//        service.sendTextMail("imaghost@inbox.lv", "mail333", "text333");
    }
}
