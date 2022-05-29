package pl.migibud.day3.nbpapi;

import org.codehaus.jackson.map.ObjectMapper;
import pl.migibud.day3.nbpapi.model.Rate;
import pl.migibud.day3.nbpapi.model.Root;

import java.io.*;
import java.net.URL;


public class App {

    public static void main(String[] args) throws IOException {


        //połączenie się do api nbp
        URL nbp = new URL("http://api.nbp.pl/api/exchangerates/tables/a/?format=json");
        InputStream inputStream = nbp.openConnection().getInputStream();
        String result = "";
        try(BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))){
            String inputLine;
            while ((inputLine= br.readLine())!=null){
                result+=inputLine;
            }
            br.readLine();
        }catch (IOException e){
            System.out.println("Exception: "+e);
        }
//        System.out.println(result);

        //mapping String result na obiekt Root
        ObjectMapper objectMapper = new ObjectMapper();
        Root root = objectMapper.readValue(result,Root[].class)[0];


        //wyciągnięcie przykładowego rejta
        double usd = root.getRates().stream()
                .filter(r -> r.getCode().equals("USD"))
                .mapToDouble(Rate::getMid)
                .findFirst()
                .orElse(0);

        System.out.println(usd);


    }


}
