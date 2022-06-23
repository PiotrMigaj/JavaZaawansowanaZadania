package pl.migibud.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CodziennePoradySerwer {

    public void doDziela(){
        try {
            ServerSocket gniazdoSrw = new ServerSocket(300);

            while (true){

                Socket gniazdo = gniazdoSrw.accept();

                PrintWriter writer = new PrintWriter( gniazdo.getOutputStream(), true);
                writer.println("HTTP/1.1 200 OK");
                writer.println("Content-Type: text/html; charset=utf-8");
                writer.println("Connection: Keep-Alive");
                writer.println();

                writer.println("czesc to ja");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CodziennePoradySerwer codziennePoradySerwer = new CodziennePoradySerwer();
        codziennePoradySerwer.doDziela();
    }

}
