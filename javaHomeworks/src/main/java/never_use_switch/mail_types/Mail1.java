package never_use_switch.mail_types;


import never_use_switch.Mail;
import never_use_switch.MailInfo;

public class Mail1 extends Mail {
    protected int code = 1;

    public void sendMailInfo(MailInfo mailInfo) {
        System.out.println("WELCOME " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
    }
}
