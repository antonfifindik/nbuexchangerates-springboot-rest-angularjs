package com.antonfifindik.json;


import org.json.JSONArray;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

@Component
public class JsonReader {
    private static String readAll(Reader reader) throws IOException {
        StringBuilder result = new StringBuilder();
        int cp;
        while ((cp = reader.read()) != -1)
            result.append((char) cp);

        return result.toString();
    }

    public static JSONArray readJsonFromUrl(String url) throws MalformedURLException, IOException {
        try (InputStream iStream = new URL(url).openStream(); BufferedReader reader = new BufferedReader(new InputStreamReader(iStream, Charset.forName("UTF-8")))) {
            String jsonText = readAll(reader);
            JSONArray result = new JSONArray(jsonText);
            return result;
        }
    }

}
