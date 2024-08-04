import java.util.*;
import java.lang.*;
import java.io.*;

public class MacAddress{

    public static ArrayList<String> takenMACs = new ArrayList<>();

    public static String generateMAC(){
        
        String options = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String MAC = "";
        Random random = new Random();
        int optionsIndex;
        
        for (int i = 0; i < 12; i++){
            optionsIndex = random.nextInt(36);
            MAC += options.charAt(optionsIndex);
            if((i % 2 == 1) && (i != 11)){
                MAC += "-";
            }
        }
        return MAC;
    }
    // class assures that MAC addresses cannot be identical
    public static String assignMAC(String host){

        String assignedMAC = "";
        String separator = ": ";
        int separatorIndex; 
        boolean isUnique = false;
        
        // check if randomly generated MAC Address is unique
        do {
            assignedMAC = MacAddress.generateMAC();
            System.out.println(assignedMAC);
            
            if(takenMACs.size() != 0){
                for (String element : takenMACs){

                    separatorIndex = element.indexOf(separator);
                    String entryMAC = element.substring(separatorIndex + separator.length());
                    
                    if (assignedMAC.equals(entryMAC)){
                        break;
                    } else {
                        isUnique = true;
                    }
                }
            } else {
                isUnique = true; 
            }
            
        } while (!isUnique);

        // add hostname and MAC entry table
        String entry = host + " : " + assignedMAC;
        takenMACs.add(entry);
        return assignedMAC;
    }
}
