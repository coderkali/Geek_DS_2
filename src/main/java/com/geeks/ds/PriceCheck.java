package com.geeks.ds;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PriceCheck {

    public static int priceChecked(List<String> products,List<Float> productPrice, List<String> soldProducts, List<Float> soldPrice){
        int count =0;

        Map<String,Float> map = new HashMap<>();
        for(int i=0; i<products.size() ; i++){
            map.put(products.get(i),productPrice.get(i) );
        }

        for(int j =0; j<soldProducts.size() ; j++){
            Float actualPrice = map.get(soldProducts.get(j));
            Float expectedPrice = soldPrice.get(j);
            if(!actualPrice.equals(expectedPrice)){
                count++;
            }
        }



        return count;
    }

    public static void main(String[] args) {
       List<String> products = Arrays.asList("rice","sugar","wheat","cheese");
       List<Float> productPrice = Arrays.asList(16.89f,56.92f,20.89f,345.99f);
       List<String> soldProducts = Arrays.asList("rice","cheese");
       List<Float> soldPrice = Arrays.asList(18.99f,400.89f);
        System.out.println(priceChecked(products,productPrice,soldProducts,soldPrice));

    }
}
