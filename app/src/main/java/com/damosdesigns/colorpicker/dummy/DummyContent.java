package com.damosdesigns.colorpicker.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {
    public static int mNumberOfSelections = 12;

    /**
     * An array of sample (dummy) items.
     */
    public static List<ColorListItem> ITEMS = new ArrayList<ColorListItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, ColorListItem> ITEM_MAP = new HashMap<String, ColorListItem>();

    static {
        float hue = 360.0f;
        float saturation = 1.0f;
        float value = 1.0f;
        float dHue = hue / mNumberOfSelections;

        for(int i = 0; i < mNumberOfSelections; i++){
            addItem(new ColorListItem(hue, saturation, value));
            hue -= dHue;
        }

//        addItem(new ColorListItem("1", "Item 1"));

    }

    private static void addItem(ColorListItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class ColorListItem {
        public String id;
        public String content;
        public float hue;
        public float saturation;
        public float value;


        public ColorListItem(float hue, float saturation, float value ) {
            this.hue = hue;
            this.saturation = saturation;
            this.value = value;
            this.content = "this hue is: " + hue;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
