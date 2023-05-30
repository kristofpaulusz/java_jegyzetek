
package model;

import java.util.ArrayList;
import java.util.HashMap;

public class JegyzetModel {
    /*
        Fájlbeolvasás
        Fájlkiírás
        Serializálás/Deserializálás
        Kép megjelenítés
    */
    private HashMap<String, ArrayList<Jegyzet>> jegyzeteim = new HashMap<>();

    public JegyzetModel() {
        testAdatok();
    }

    private void testAdatok() {
        
        jegyzeteim.put("Java", new ArrayList<>());
        jegyzeteim.put("Webprogramozás", new ArrayList<>());
        
       jegyzeteim.get("Java").add(new Jegyzet("java_proba1", "Ez egy Java probajegyzet"));
       jegyzeteim.get("Java").add(new Jegyzet("java_proba2", "Ez egy másik Java probajegyzet"));
       jegyzeteim.get("Webprogramozás").add(new Jegyzet("JS_proba1", "Webprogramozás_proba1"));
       jegyzeteim.get("Webprogramozás").add(new Jegyzet("JS_proba2", "Webprogramozás_proba2"));
    }

    public HashMap<String, ArrayList<Jegyzet>> getJegyzeteim() {
        return jegyzeteim;
    }
    
}
