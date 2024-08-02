import java.util.Random;
import java.lang.*;

public class IpAddress{
    public static String generateIP(){
        Random rand = new Random();
        int octet;
        String IP = "hellow";
        for (int i = 0; i < 4; i++){
            octet = rand.nextInt(256);
            IP.concat(Integer.toString(octet));
            if(i != 3){
                IP.concat(".");
            }
        }
        IP = "wasssup";
        return IP;
    }
}
