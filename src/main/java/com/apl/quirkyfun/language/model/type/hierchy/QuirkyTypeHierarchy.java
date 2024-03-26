package com.apl.quirkyfun.language.model.type.hierchy;

import com.apl.quirkyfun.language.model.type.QuirkyType;
import com.apl.quirkyfun.language.model.type.number.QuirkyNumber;

import java.util.HashMap;

public class QuirkyTypeHierarchy {
    public static final QuirkyTypeHierarchy INSTANCE = new QuirkyTypeHierarchy();
    private final HashMap<String, Integer> hierarchy;

    private QuirkyTypeHierarchy() {
        this.hierarchy = new HashMap<>();
        this.hierarchy.put("QuirkyBoolean", 0);
        this.hierarchy.put("QuirkyShort", 1);
        this.hierarchy.put("QuirkyInteger", 2);
        this.hierarchy.put("QuirkyLong", 3);
        this.hierarchy.put("QuirkyFloat", 4);
        this.hierarchy.put("QuirkyDouble", 5);
    }

    public boolean isNumberType(QuirkyType<?> type) {
        return this.hierarchy.containsKey(type.getClass().getSimpleName());
    }

    public boolean isSubtype(QuirkyType<?> type1, QuirkyType<?> type2) {
        return isSubtype(type1.getClass().getSimpleName(), type2.getClass().getSimpleName());
    }

    public boolean isSubtype(QuirkyType<?> type1, String type2) {
        return isSubtype(type1.getClass().getSimpleName(), type2);
    }

    public boolean isSubtype(String type1, String type2) {
        Integer hierarchy1 = this.hierarchy.get(type1);
        Integer hierarchy2 = this.hierarchy.get(type2);
        if (hierarchy1 == null || hierarchy2 == null)
            return false;
        return hierarchy1 <= hierarchy2;
    }

    public boolean isCompatible(QuirkyType<?> type1, QuirkyType<?> type2) {
        return this.isSubtype(type1, type2) || this.isSubtype(type2, type1);
    }

    @SuppressWarnings("unchecked")
    public Class<? extends QuirkyNumber<?>> getHigherHierarchy(QuirkyNumber<?> type1, QuirkyNumber<?> type2) {
        Integer hierarchy1 = this.hierarchy.get(type1.getClass().getSimpleName());
        Integer hierarchy2 = this.hierarchy.get(type2.getClass().getSimpleName());
        return (Class<? extends QuirkyNumber<?>>) (hierarchy1 > hierarchy2 ? type1.getClass() : type2.getClass());
    }
}
