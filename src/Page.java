import java.io.*;
import java.net.*;

public class Page {
    private final String address;

    public Page(String address){
        this.address = address;
    }
    public String getSource() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        URL url = new URL(this.address);
        InputStream inputStream = (InputStream) url.getContent();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        while (reader.ready()){
            stringBuilder.append(reader.readLine());
        }
        return stringBuilder.toString();
    }
}
