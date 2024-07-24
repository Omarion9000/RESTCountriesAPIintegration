package org.example.week11;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIService {
    private static final String API_URL = "https://restcountries.com/v3.1/name/";

    public static CountryResponse[] fetchCountry(String country) throws Exception {
        String urlString = API_URL + country;
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        Gson gson = new Gson();
        return gson.fromJson(response.toString(), CountryResponse[].class);
    }
}
