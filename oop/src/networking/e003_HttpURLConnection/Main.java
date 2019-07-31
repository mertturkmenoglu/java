package networking.e003_HttpURLConnection;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/search?q=kotlin&oq=kotlin&sourceid=chrome&ie=UTF-8");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            for (int i = 1; i < 8; i++) {
                System.out.println(httpURLConnection.getHeaderFieldKey(i) + " = " + httpURLConnection.getHeaderField(i));
            }

            httpURLConnection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
