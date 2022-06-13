package pl.migibud.javanetworking;

import java.io.*;
import java.net.Socket;

public class SocketDownloadWebPage {
	public static void main(String[] args) throws IOException {

		Socket socket = new Socket("duckduckgo.com",80);

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

		bufferedWriter.write("GET / HTTP/1.0\n\n");
		bufferedWriter.flush();

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		String data;
		while ((data=bufferedReader.readLine())!=null){
			System.out.println(data);
		}
	}
}
