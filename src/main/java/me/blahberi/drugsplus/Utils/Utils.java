package me.blahberi.drugsplus.Utils;

import org.bukkit.ChatColor;

import java.util.Hashtable;

public class Utils {
    public static String color(String s){
        Hashtable<String, String> colors = new Hashtable<>();
        colors.put("&dark_red", "&4");
        colors.put("&gold", "&c");
        colors.put("&yellow", "&c");
        colors.put("&dark_green", "&c");
        colors.put("&green", "&c");
        colors.put("&aqua", "&c");
        colors.put("&dark_aqua", "&c");
        colors.put("&dark_blue", "&c");
        colors.put("&blue", "&c");
        colors.put("&light_purple", "&c");
        colors.put("&dark_purple", "&c");
        colors.put("&white", "&c");
        colors.put("&gray", "&c");
        colors.put("&dark_gray", "&c");
        colors.put("&black", "&c");
        colors.put("&obf", "&c");
        colors.put("&bold", "&c");
        colors.put("&strike", "&c");
        colors.put("&underline", "&c");
        colors.put("&italic", "&c");
        colors.put("&reset", "&c");

        String[] words = s.split(" ");
        for (String word : words){
            if (word.charAt(0) == '&'){
                word = colors.get(word);
            }
        }
        s = String.join(" ", words);
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
