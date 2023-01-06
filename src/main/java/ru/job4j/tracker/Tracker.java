package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[this.size];
        int sizeRsl = 0;
        for (int i = 0; i < this.size; i++) {
            if (items[i].getName().equals(key)) {
                rsl[sizeRsl] = items[i];
                sizeRsl++;
            }
        }
        return Arrays.copyOf(rsl, sizeRsl);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index > -1) {
            item.setId(id);
            items[index] = item;
            return true;
        } else {
            return false;
        }
    }
}