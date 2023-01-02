package com.itheima.d4_collection_test;

import java.util.Objects;

public class Card {
    private String size;
    private String color;
    private int index;  // 牌的真正大小

    public Card() {
    }

    @Override
    public String toString() {
        return size + color;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Card(String size, String color, int index) {
        this.size = size;
        this.color = color;
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(size, card.size) && Objects.equals(color, card.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color);
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
