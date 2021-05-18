package com.project610;

import java.util.ArrayList;
import java.util.HashMap;

public class Sprite {
    public String label;
    public ArrayList<String> files;
    public HashMap<String, Variant> variants = new HashMap<>();

    public Sprite setLabel(String s) {
        this.label = s;
        return this;
    }

    public Sprite addVariant (String name, Variant v) {
        variants.put(name, v);
        return this;
    }
}
