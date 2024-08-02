import java.lang.*;

/*
 * different classes storing the device types: router, hosts, switch, internet
 * 
 */

public class main {
    public static void main(String[] args) {
    
        host comp = new host();
        System.out.println(comp.mac);
        System.out.println(comp.ipv4);
    }
}
