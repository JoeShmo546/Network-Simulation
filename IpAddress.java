import java.util.*;
import java.lang.*;
import java.io.*;

public class IpAddress{

    public static ArrayList<String> takenIPs = new ArrayList<>();

    public static String generateIP(){

        int octet;
        String IP = "";
        Random random = new Random();

        for (int i = 0; i < 4; i++){
            octet = random.nextInt(256);
            IP += Integer.toString(octet);
            if(i != 3){
                IP += ".";
            }
        }
        return IP;
    }
    // class assures that IP addresses cannot be identical
    public static String assignIP(String host){

        String assignedIP = "";
        String separator = ": ";
        int separatorIndex; 
        boolean isUnique = false;
        
        // check if randomly generated IP Address is unique
        do {
            assignedIP = IpAddress.generateIP();
            
            if(takenIPs.size() != 0){
                for (String element : takenIPs){

                    separatorIndex = element.indexOf(separator);
                    String entryIP = element.substring(separatorIndex + separator.length());
                    
                    if (assignedIP.equals(entryIP)){
                        break;
                    } else {
                        isUnique = true;
                    }
                }
            } else {
                isUnique = true; 
            }
            
        } while (!isUnique);

        // add hostname and IP entry table
        String entry = host + " : " + assignedIP;
        takenIPs.add(entry);
        return assignedIP;
    }
}
