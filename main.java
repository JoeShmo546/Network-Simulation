import java.lang.*;

/*
 * different classes storing the device types: router, hosts, switch, internet
 * 
 */

public class main {
    public static void main(String[] args) {
    
        host comp = new host("Lenovo");
        host comp2 = new host("HP");

        System.out.println(comp2.getIpv4());
        System.out.println(comp.getIpv4());
        System.out.println(comp2.getMac());
        System.out.println(comp.getMac());
        System.out.println(IpAddress.takenIPs);
        System.out.println(MacAddress.takenMACs);
    }
}
