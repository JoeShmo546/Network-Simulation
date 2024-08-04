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
        
        do {
            assignedIP = IpAddress.generateIP();

            for (String currentEntry : takenIPs){

                separatorIndex = currentEntry.indexOf(separator);
                String entryIP = currentEntry.substring(separatorIndex + separator.length());

                if (assignedIP.equals(entryIP)){
                    break;
                }                 }
            isUnique = true;
            
        } while (!isUnique);

        String entry = host + " : " + assignedIP;
        takenIPs.add(entry);
        System.out.println(takenIPs);
        return assignedIP;
    }
}
