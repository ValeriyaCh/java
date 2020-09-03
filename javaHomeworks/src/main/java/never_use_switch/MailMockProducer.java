package never_use_switch;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;
import org.reflections.Reflections;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static never_use_switch.RandomUtil.randomItem;

/**
 * @author Evgeny Borisov
 */
public class MailMockProducer {

    private final Reflections scanner = new Reflections("never_use_switch.mail_types");
    private final Faker faker = new Faker();
    private final DataFactory dataFactory = new DataFactory();

    public List<Class<? extends Mail>> parseTypes() {
        List<Class<? extends Mail>> classes;
        classes = new ArrayList<>(scanner.getSubTypesOf(Mail.class));
        return classes;
    }
    public static int parseName(String className){
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(className);
        int res = 0;
        while (m.find()) {
             res = Integer.parseInt(m.group());
        }
        return res;
    }

    @SneakyThrows
    public void sendMailsForever()  {
        List<Class<? extends Mail>> listOfMails = parseTypes();
        Mail mailToSend = null;
        while (true) {
            int mailType = RandomUtil.getIntBetween(0, listOfMails.size()) + 1;
            for (int i=0;i<listOfMails.size();i++){
                if (parseName(listOfMails.get(i).toString()) == mailType){
                    mailToSend = listOfMails.get(i).getDeclaredConstructor().newInstance();
                    break;
                }
            }
            MailInfo mailInfo = MailInfo.builder()
                    .email(dataFactory.getEmailAddress())
                    .mailType(mailType)
                    .text(faker.chuckNorris().fact()).build();
            mailToSend.sendMailInfo(mailInfo);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {
        new MailMockProducer().sendMailsForever();
    }
}

