package com.orlygur;

import java.util.HashMap;
import java.util.Map;

public class JSONObject {
    private Map<String, String> map;

    public JSONObject() {
        this.map = new HashMap<>();
    }

    public void put(String key, String value) {
        map.put(key, value);
    }
    
    public String get(String key) {
        return map.get(key);
    }
    
}
