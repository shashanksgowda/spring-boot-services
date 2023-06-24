package javaapp.Entity;

import java.util.HashMap;
import java.util.List;

public class Branch {
    private String id;
    private String name;

    public static HashMap<String, List<Vehicle>> vehicles = new HashMap();

    public Branch(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
