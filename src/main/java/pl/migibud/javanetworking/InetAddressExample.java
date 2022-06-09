package pl.migibud.javanetworking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {

		try{
			InetAddress ip = InetAddress.getByName("www.migibud.pl");
			System.out.println("host: "+ip.getHostName());
			System.out.println("ip: "+ip.getHostAddress());
			InetAddress[] addresses = InetAddress.getAllByName("www.migibud.pl");
			System.out.println(addresses.length);
			for (int i=0;i< addresses.length;i++){
				System.out.println("addr: "+addresses[i]);
			}
		}catch (UnknownHostException e){
			e.printStackTrace();
		}

	}
}
