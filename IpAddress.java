import java.util.*;
import java.lang.*;
import java.io.*;

public class IpAddress{
    public static String generate_IP(){
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
    public static String assign_IP(String host){
        ArrayList<String> taken_IPs = new ArrayList<>();
        String assigned_IP = IpAddress.generate_IP();
        String entry = host + " : " + assigned_IP;
        taken_IPs.add(entry);
        return assigned_IP;
    }
}
