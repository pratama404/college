import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReadJSONFromFileExample {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            // Membaca JSON dari file
            FileReader reader = new FileReader("data.json");
            Object obj = parser.parse(reader);

            JSONObject jsonObject = (JSONObject) obj;

            // Mengakses data yang telah dibaca
            String name = (String) jsonObject.get("name");
            Long age = (Long) jsonObject.get("age");

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
