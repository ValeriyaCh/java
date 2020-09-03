package never_use_switch;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;
import org.reflections.Reflections;
import java.util.ArrayList;
import java.util.List;
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

    @SneakyThrows
    public void sendMailsForever()  {
        List<Class<? extends Mail>> listOfMails = parseTypes();
        while (true) {
            Mail mailToSend = randomItem(listOfMails).getDeclaredConstructor().newInstance();
            MailInfo mailInfo = MailInfo.builder()
                    .email(dataFactory.getEmailAddress())
                    .mailType(mailToSend.getCode())
                    .text(faker.chuckNorris().fact()).build();
            mailToSend.sendMailInfo(mailInfo);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {
        new MailMockProducer().sendMailsForever();
    }
}

