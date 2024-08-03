import java.util.*;
import java.lang.*;
import java.io.*;

public class IpAddress{

    public static String generateIP(){
        Random rand = new Random();
        int octet;
        String IP = "";
        for (int i = 0; i < 4; i++){
            octet = rand.nextInt(256);
            IP += Integer.toString(octet);
            if(i != 3){
                IP += ".";
            }
        }
        return IP;
    }
    // class assures that IP addresses cannot be identical
    public static String assignIP(String host){

        ArrayList<String> takenIPs = new ArrayList<>();
        String separator = ": ";
        String assignedIP = "";
        int separatorIndex; 
        boolean isUnique = false;
        
        /* generate an IP Address
         * cycle through list of IP Addresses
         * check if the generated IP Address is equal to current IP Address in the cycle
         * if it is equal start over and generate a new IP Address 
         * this loop is infinite
         */
        while (!isUnique){
            assignedIP = IpAddress.generateIP();

            if (takenIPs.size() > 0){

                for (int i = 0; i < takenIPs.size(); i++){
                    String currentEntry = takenIPs.get(i);
                    separatorIndex = currentEntry.indexOf(separator);
                    String entryIP = currentEntry.substring(separatorIndex + separator.length());

                    if (assignedIP.equals(entryIP)){
                        break;
                    } else if (i == takenIPs.size()){
                        isUnique = true;
                        break;
                    }
                }

            } else {
                isUnique = true;
            }
        }

        String entry = host + " : " + assignedIP;
        takenIPs.add(entry);
        System.out.println(takenIPs);
        return assignedIP;
    }
}
