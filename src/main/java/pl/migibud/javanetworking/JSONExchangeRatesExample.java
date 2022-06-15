package pl.migibud.javanetworking;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class JSONExchangeRatesExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://api.nbp.pl/api/exchangerates/tables/a/?format=json");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        System.out.println(connection.getResponseCode());

        if (connection.getResponseCode() != 200) {
            System.out.println("Not 200 response, quit");
            return;
        }

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
        );

//        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/pl/migibud/javanetworking/json.txt"));


        String str;
        StringBuffer stringBuffer = new StringBuffer();

        while ((str = reader.readLine()) != null) {
            stringBuffer.append(str);
        }

//        String jsonStr = stringBuffer.toString().replaceAll("\\[","").replaceAll("\\[","");
        String jsonStr = stringBuffer.toString();
//        System.out.println(jsonStr);

//        JSONObject jsonObject = new JSONObject(jsonStr);
        JSONArray jsonArray = new JSONArray(jsonStr);
//        System.out.println(jsonArray.get(0));
        JSONObject jsonObject = jsonArray.getJSONObject(0);
//        System.out.println(jsonObject);

        JSONArray jsonArray2 = jsonObject.getJSONArray("rates");
//        System.out.println(jsonArray2.getJSONObject());
        Map<String, Object> stringObjectMap = jsonObject.toMap();
//        JSONObject rates = stringObjectMap.entrySet().stream()
//                .filter(v -> v.getKey().equals("rates"))
//                .map(Map.Entry::getValue)
//                .findFirst()
//                .get();

        System.out.println(jsonArray2);

        Map<String, JSONObject> myMap = new HashMap<>();

        double mid = 0;
        for (int i = 0; i < jsonArray2.length(); i++) {
            String code = jsonArray2.getJSONObject(i).getString("code");
//            if ("USD".equals(code)){
//                mid = jsonArray2.getJSONObject(i).getDouble("mid");
//            }
            myMap.put(code, jsonArray2.getJSONObject(i));
        }

        System.out.println(myMap);

        float aFloat = myMap.entrySet().stream()
                .filter(v -> v.getKey().equals("USD"))
                .map(v -> v.getValue())
                .findFirst()
                .get().getFloat("mid");

        System.out.println(aFloat);

        //JSONObject rates = jsonObject.getJSONObject("value");
//        String sample = jsonObject.getString("menu");
//        String menu = jsonObject.getJSONObject("menu").getString("value");
//        System.out.println(menu);
//        JSONObject rates = jsonObject.getJSONObject("rates");
//        String currency = jsonObject.getString("currency");
//        System.out.println(currency);

//        JSONObject rates = jsonObject.getJSONObject("rates");
//
//        Map<String,Object> objMap = jsonArray2.getJSONObject()

        reader.close();
    }
}
