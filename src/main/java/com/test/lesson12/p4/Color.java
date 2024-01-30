package com.test.lesson12.p4;

public enum Color {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");

    private String code;

    public String getCode() {
        return code;
    }

    public static Color getColorByCode(String code) {
        for (Color color : Color.values()) {
            if (color.getCode().equals(code)) {
                return color;
            }
        }
        return null;
    }


    Color(String code) {
        this.code = code;
    }
}
