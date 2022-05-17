package LabMids.q2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> disease = new HashMap<>();

        disease.put("caugh", "Fever");
        disease.put("headache", "ill");
        disease.put("Caugh and headache", "Corona");


        disease.put("headache", "cancer");
        disease.put("caugh", "normal fever");
        disease.remove("headache");
        disease.put("headache", null);

        System.out.println(disease);

        String[] arrOfkeys = disease.keySet().toArray(new String[0]);
        for (int i = 0; i < arrOfkeys.length; i++) {

            System.out.println("For value " + (i + 1) + ": ");
            if (disease.get(arrOfkeys[i]) == null )
                System.out.println(true);
            else
                System.out.println(false);

        }

        System.out.println(disease.isEmpty());


    }
}
