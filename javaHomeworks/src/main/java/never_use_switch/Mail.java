package never_use_switch;

import lombok.Getter;

@Getter
public abstract class Mail {
    protected int code;

    public abstract void sendMailInfo(MailInfo mailInfo);


}
