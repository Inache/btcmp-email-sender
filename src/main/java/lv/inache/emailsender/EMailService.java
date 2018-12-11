package lv.inache.emailsender;


import com.sparkpost.Client;
import com.sparkpost.exception.SparkPostException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;


public class EMailService {
    private final Client client;


    public EMailService(Client client) {
        this.client = client;
    }
    private String fromEmail;

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public void sendTextMail(String recipient, String subject, String body) throws SparkPostException {
        client.sendMessage(
                fromEmail,
                recipient,
                subject,
                body,
                null);
    }

    public void sendHTMLMail(String recipient, String subject, String body) throws SparkPostException {
        client.sendMessage(
                fromEmail,
                recipient,
                subject,
                null,
                body);
    }

}
