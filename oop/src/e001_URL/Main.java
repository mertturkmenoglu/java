package e001_URL;


import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/search?q=kotlin&oq=kotlin&sourceid=chrome&ie=UTF-8");

            System.out.println(url.getAuthority());
            System.out.println(url.getDefaultPort());
            System.out.println(url.getFile());
            System.out.println(url.getHost());
            System.out.println(url.getPath());
            System.out.println(url.getPort());
            System.out.println(url.getProtocol());
            System.out.println(url.getQuery());
            System.out.println(url.getRef());
            System.out.println(url.getUserInfo());
            System.out.println(url.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
