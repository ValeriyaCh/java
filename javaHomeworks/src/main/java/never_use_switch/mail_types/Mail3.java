package never_use_switch.mail_types;

import never_use_switch.Mail;
import never_use_switch.MailInfo;

public class Mail3 extends Mail {
    protected int code = 3;

    public void sendMailInfo(MailInfo mailInfo) {
                System.out.println("DONE_BY_LENOCHKA " + mailInfo.getText() + " was sent to" + mailInfo.getEmail());
    }
}
