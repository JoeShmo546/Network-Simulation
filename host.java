import java.util.*;

public class host {

    private String name;
    private String ipv4;
    private String mac;
    private Arraylist<String> arpCache = new Arraylist()<>;
    private Arraylist<String> routingTable = new Arraylist()<>;
    
    public host(String name){
        this.name = name;
        this.mac = MacAddress.assignMAC(name);
        this.ipv4 = IpAddress.assignIP(name); 
    }

    public String getName(){
        return name;
    }
    public String getIpv4(){
        return ipv4;
    }
    public String getMac(){
        return mac;
    }
        
}
