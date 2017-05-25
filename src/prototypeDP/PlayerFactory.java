package prototypeDP;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private static final Map<String, Player> prototypes = new HashMap<String, Player>();
    static {
        prototypes.put("Messi", new Messi());
        prototypes.put("Cristiano", new Cristiano());
        prototypes.put("Aboutrika", new Aboutrika());
    }
    
    public static Player getPrototype(String type) {
        try {
            return prototypes.get(type).clone();
        } catch (NullPointerException ex) {
            System.out.println("Prototype with name: " + type + ", doesn't exist");
            return null;
        }
    }



}
