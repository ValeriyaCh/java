package never_use_switch.mail_types;

import never_use_switch.Mail;
import never_use_switch.MailInfo;

public class Mail2 extends Mail {
    protected int code = 2;

    public void sendMailInfo(MailInfo mailInfo) {
                System.out.println("EMAIL_CALLBACK " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
    }
}
