package com.geeks.ds.hackerrank;//package com.geeks.ds.hackerrank;
//
//import com.google.gson.Gson;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class TestApi {
//
//
//        public static void main(String[] args) {
//            String keyword = "Houston";
//
//            String[] movieTitles = getFoodOutlets(keyword);
//            for (String title: movieTitles) {
//                System.out.println(title);
//            }
//        }
//
//        private static String[] getFoodOutlets(String substr) {
//            String response;
//            int page = 1;
//            int totalPages = 2;
//
//            Map<String,String> map = new HashMap<>();
//
//            while (page <= totalPages) {
//                try {
//                    URL url = new URL("https://jsonmock.hackerrank.com/api/food_outlets?city="+substr+"&page="+page);
//                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                    connection.setRequestMethod("GET");
//                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//
//                    while ((response = reader.readLine()) != null) {
//                        JsonObject jsonResponse = new Gson().fromJson(response, JsonObject.class);
//                        totalPages = jsonResponse.get("total_pages").getAsInt();
//                        JsonArray data = jsonResponse.getAsJsonArray("data");
//
//                        for (JsonElement datum: data) {
//                            String avgRating = ((JsonObject) datum).getAsJsonObject("user_rating").get("average_rating").getAsString();
//                            String name = ((JsonObject) datum).get("name").getAsString();
//                            map.put(name,avgRating);
//                            //titles.add(title);
//                        }
//                    }
//                    reader.close();
//                    page++;
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//            }
//            Map<String, String> result = map.entrySet().stream()
//                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
//                            (oldValue, newValue) -> oldValue, LinkedHashMap::new));
//
//            List<String> titles1 = new LinkedList<>(map.entrySet().stream()
//                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
//                            (oldValue, newValue) -> oldValue, LinkedHashMap::new)).keySet());
//
//            //List<String> titles = new ArrayList<>(result.keySet());
//            return titles1.toArray(new String[0]);
//        }
//    }
//
