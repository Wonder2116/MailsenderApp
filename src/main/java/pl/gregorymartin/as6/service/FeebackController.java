package pl.gregorymartin.as6.service;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FeebackController {

    private MailConfig mailConfig;

    public FeebackController(MailConfig mailConfig) {
        this.mailConfig = mailConfig;
    }
    @Around("@annotation(VideoAnnotation)")
    public void sendFeedback(ProceedingJoinPoint joinPoint) throws Throwable {

        // Mail Sender
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(this.mailConfig.getHost());
        mailSender.setPort(this.mailConfig.getPort());
        mailSender.setUsername(this.mailConfig.getUsername());
        mailSender.setPassword(this.mailConfig.getPassword());


        //Create an Email Instance
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("ugabuga@hotmail.com");
        simpleMailMessage.setTo("ugabuga@gmail.com");
        simpleMailMessage.setSubject("Siemka");
        simpleMailMessage.setText("Fajna Apka");

        // Send mail

        mailSender.send(simpleMailMessage);
        joinPoint.proceed();
    }


}
