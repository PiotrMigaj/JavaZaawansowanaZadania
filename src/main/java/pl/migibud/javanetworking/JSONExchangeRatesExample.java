package pl.migibud.javanetworking;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JSONExchangeRatesExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://api.nbp.pl/api/exchangerates/tables/a/?format=json");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        System.out.println(connection.getResponseCode());

        if(connection.getResponseCode() != 200) {
            System.out.println("Not 200 response, quit");
            return;
        }

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
        );

        String str;
        StringBuffer stringBuffer = new StringBuffer();

        while ((str = reader.readLine())!=null){
            stringBuffer.append(str);
        }

        String jsonStr = stringBuffer.toString().replaceAll("\\[","").replaceAll("\\[","");
        System.out.println(jsonStr);

        JSONObject jsonObject = new JSONObject(jsonStr);
//        JSONObject rates = jsonObject.getJSONObject("rates");
        String currency = jsonObject.getString("currency");
        System.out.println(currency);

        reader.close();
    }
}
