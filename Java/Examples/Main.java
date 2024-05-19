package Examples;

import com.orlygur.JSONObject;

public class Main {

    public static void main(String[] args) {
        JSONObject json = new JSONObject();

        json.put("Version", "0.0.1-SNAPSHOT");


        System.out.println("Version: " + json.get("Version"));
    }

}
