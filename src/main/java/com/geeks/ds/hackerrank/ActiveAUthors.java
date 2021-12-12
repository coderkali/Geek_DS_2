package com.geeks.ds.hackerrank;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

public class ActiveAUthors {

    public static void main(String[] args) {
        int thershold = 10;

        List<String> movieTitles = getActiveAUthors(thershold);
        for (String title: movieTitles) {
            System.out.println(title);
        }
    }

    private static List<String> getActiveAUthors(int thershold) {
        String response;
        int page = 1;
        int totalPages = 2;

        List<String> authorsList = new ArrayList<>();

        while (page <= totalPages) {
            try {
                URL url = new URL("https://jsonmock.hackerrank.com/api/article_users?page="+page);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                while ((response = reader.readLine()) != null) {
                    JsonObject jsonResponse = new Gson().fromJson(response, JsonObject.class);
                    totalPages = jsonResponse.get("total_pages").getAsInt();
                    JsonArray data = jsonResponse.getAsJsonArray("data");

                    for (JsonElement datum: data) {
                        int submission_count = ((JsonObject) datum).get("submission_count").getAsInt();
                        if(submission_count > thershold){
                            String username = ((JsonObject) datum).get("username").getAsString();
                            authorsList.add(username);
                        }
                    }
                }
                reader.close();
                page++;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }


        //authorsList.sort(Comparator.naturalOrder());
        return authorsList;
    }
}
