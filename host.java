import java.util.*;

public class host {

    private String name;
    private String ipv4;
    private String mac;
    
    public host(String name){
        this.name = name;
        this.mac = "AD-BC-23-45-D9-D3";// Same with MAC Address
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
