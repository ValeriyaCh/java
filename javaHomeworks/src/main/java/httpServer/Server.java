package httpServer;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Server {
    public void defineCode(int code){
        String[] codeValues = Stream.of(EnumCodes.values()).map(EnumCodes::name).toArray(String[]::new);
        int idx = (int)code/100;
        if (idx > codeValues.length || idx < 1){
            System.out.println("Wrong code");
        }
        else {
            System.out.println(codeValues[idx-1]);
        }

    }
    public void parseString(String text){
        int code;
        Pattern temp = Pattern.compile("httpcode:\\s*(\\d{3})");
        Matcher match = temp.matcher(text);
        if (match.find()) {
            code = Integer.parseInt(match.group(1));
        }
        else{
            code = 600;
        }
        defineCode(code);
    }

}
