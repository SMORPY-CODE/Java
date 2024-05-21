package Examples;

import com.orlygur.JSON.*;
import com.orlygur.window.*;

public class Main {

    public static void main(String[] args) {
    	Main main = new Main();
    	
        main.json();
        main.window();
        
    }
    
    public void window() {
    	 // Create an instance of a Window
        Window win = new Window("Java Window");

        // add text to the screen
        win.addText("Wow!", 200, 100);
    }
    
    public void json() {
    	//create a JSON instance named "JSON"
    	JSONObject json = new JSONObject();

        //add a stored value at the key "Version"
        json.put("Version", "0.0.1-SNAPSHOT");

        //print the key "Version"
        System.out.println("Version: " + json.get("Version"));
    }

}
