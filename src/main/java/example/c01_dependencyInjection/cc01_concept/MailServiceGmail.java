package example.c01_dependencyInjection.cc01_concept;

public class MailServiceGmail implements MailService {
    @Override
    public void sendMess(String mess) {
        System.out.println("GMAIL: " + mess);
    }
}
