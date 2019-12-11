package com.singtel.bonus;

import java.util.HashMap;

public class SoundUtil {

    public static HashMap<String, String> getLanguage(String language) {
        HashMap<String, String> sounds = new HashMap<>();
        sounds.put("Danish", "kykyliky");
        sounds.put("Dutch", "kukeleku");
        sounds.put("Sinhala", "kukuku kuu");
        return sounds;

    }

}
