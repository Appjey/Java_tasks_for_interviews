package Easy.Task_1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Vector;

public class main {
    public static void main(String[] args) throws UnknownHostException{
        Vector<String> Available_Devices=new Vector<>();
        String myip=InetAddress.getLocalHost().getHostAddress();
        if(myip.equals("127.0.0.1")){
            System.out.println("This PC is not connected to any network!");
        }
        else {
            String mynetworkips= "";
            for(int i=myip.length()-1;i>=0;--i){
                if(myip.charAt(i)=='.'){
                    mynetworkips=myip.substring(0,i+1);
                    break;
                }
            }
            //System.out.println("My Device IP: " + myip+"\n");
            //System.out.println("Search log:");
            for(int i=1;i<=254;++i){
                try {
                    InetAddress addr=InetAddress.getByName(mynetworkips + Integer.toString(i));

                    if (addr.isReachable(0)){
                        System.out.println("Available: " + addr.getHostAddress());
                        Available_Devices.add(addr.getHostAddress());
                    }
                    else System.out.println("Not available: "+ addr.getHostAddress());
                }catch (IOException ignored){
                }
            }
            System.out.println("\nAll Connected devices(" + Available_Devices.size() +"):");
            for (String available_device : Available_Devices) System.out.println(available_device);
        }
    }
}