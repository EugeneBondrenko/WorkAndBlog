package workandblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import workandblog.bean.MailBean;
import workandblog.service.MailService;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


@Service("mailService")
public class MailServiceImpl implements MailService {

    @Autowired
    JavaMailSender mailSender;

    @Override
    public void sendEmailAfterRegistration(String recipientMail, String message) {

        try {
            mailSender.send(new MimeMessagePreparator() {

                public void prepare(MimeMessage mimeMessage) throws Exception {


                    mimeMessage.setFrom(new InternetAddress("eugenebondarenko7@mail.com", "Eugene"));
                    mimeMessage.setRecipient(Message.RecipientType.TO,
                            new InternetAddress(recipientMail));
                    mimeMessage.setSubject("Test", "utf-8");
                    mimeMessage.setContent(message, "text/html; charset=utf-8");
                }
            });
            System.out.println("Message Send...Hurrey");
        } catch (MailException ex) {
            System.err.println(ex.getMessage());
        }

    }
}
