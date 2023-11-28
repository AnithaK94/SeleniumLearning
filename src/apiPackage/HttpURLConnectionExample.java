package apiPackage;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {
    public void getMethodExample() throws IOException{

       URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");
       HttpURLConnection connection =(HttpURLConnection)url.openConnection();
       connection.setRequestMethod("GET");
       connection.connect();
        // check status and get message
        int status = connection.getResponseCode();
        System.out.println("Status Code is: " +status);
        String statMessage = connection.getResponseMessage();
        System.out.println("The Status Message is : " +statMessage);
        // get the data
        InputStream input = connection.getInputStream();
        InputStreamReader inputreader = new InputStreamReader(input);

        BufferedReader bufferread = new BufferedReader(inputreader);
        String line;
        StringBuffer buffer = new StringBuffer();
        while((line = bufferread.readLine()) != null){
            buffer.append(line);
        }
        System.out.println(buffer);

    }

    public static void main(String[] args)  throws IOException {
        HttpURLConnectionExample connectEx = new HttpURLConnectionExample();
        connectEx.getMethodExample();
    }
}
