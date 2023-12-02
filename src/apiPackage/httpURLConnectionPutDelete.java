package apiPackage;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class httpURLConnectionPutDelete {
    public void putRequestExample() throws IOException {
        URL url = new URL("https://dummy.restapiexample.com/api/v1/update/26081");
        HttpURLConnection connectionPost = (HttpURLConnection) url.openConnection();
        connectionPost.setRequestMethod("PUT");
        connectionPost.setRequestProperty("Content_Type", "application/json");
        connectionPost.setDoOutput(true);

        String jsonBody = "{\"name\":\"Anil\",\"salary\":\"123456\",\"age\":\"27\"}";
        byte[] inputJson = jsonBody.getBytes();

        OutputStream outputStream = connectionPost.getOutputStream();
        outputStream.write(inputJson);
        System.out.println("Response Code : " + connectionPost.getResponseCode());
        System.out.println("Response Message : " + connectionPost.getResponseMessage());

        InputStream inputStream = connectionPost.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String msg;
        StringBuffer bufferMsg = new StringBuffer();

        while ((msg = bufferedReader.readLine()) != null) {
            bufferMsg.append(msg);
        }
        System.out.println(msg);
    }

        public void deleteRequestExample() throws IOException {
            URL url = new URL("https://dummy.restapiexample.com/api/v1/delete/26081");
            HttpURLConnection connectionPost = (HttpURLConnection) url.openConnection();
            connectionPost.setRequestMethod("DELETE");
            connectionPost.setRequestProperty("Content_Type","application/json");
            connectionPost.setDoOutput(true);

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

    public static void main(String[] args) throws IOException {
        httpURLConnectionPutDelete put = new httpURLConnectionPutDelete();
        //put.putRequestExample();
        put.deleteRequestExample();
    }
}
