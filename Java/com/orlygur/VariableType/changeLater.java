package com.orlygur.VariableType;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class changeLater {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        
        changeLater changer = new changeLater();
        changer.getType(myVar);
        
        changer.listEnumContents();
    }
    
    public void getType(Level lvl) {
        switch(lvl) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
    
    public void listEnumContents() {
        System.out.println("Listing all contents of Level enum:");
        for (Level level : Level.values()) {
            System.out.println(level);
        }
    }

}
