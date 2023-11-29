package apiPackage;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
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
    public void postMethodExample() throws IOException {
        URL url = new URL("https://dummy.restapiexample.com/api/v1/create");
        HttpURLConnection connectionPost = (HttpURLConnection) url.openConnection();
        connectionPost.setRequestMethod("POST");
        connectionPost.setRequestProperty("Content_Type","application/json");
        connectionPost.setDoOutput(true);

        String jsonBody = "{\"name\":\"Anil\",\"salary\":\"123456\",\"age\":\"2\"}";
        byte[] inputJson = jsonBody.getBytes();

        OutputStream outputStream = connectionPost.getOutputStream();
        outputStream.write(inputJson);
        System.out.println("Response Code : " +connectionPost.getResponseCode());
        System.out.println("Response Message : " +connectionPost.getResponseMessage());

        InputStream inputStream = connectionPost.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String msg;
        StringBuffer bufferMsg = new StringBuffer();

        while ((msg = bufferedReader.readLine())!= null){
            bufferMsg.append(msg);
        }
        System.out.println(msg);

    }

    public static void main(String[] args)  throws IOException {
        HttpURLConnectionExample connectEx = new HttpURLConnectionExample();
        connectEx.getMethodExample();
        connectEx.postMethodExample();
    }
}
