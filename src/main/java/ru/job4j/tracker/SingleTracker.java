package ru.job4j.tracker;

import java.util.Arrays;

public final class SingleTracker {

    private final Tracker tracker = new Tracker();
    private static SingleTracker instanse = null;

    private SingleTracker() {
    }

    static SingleTracker getSingleTracker() {
        if (instanse == null) {
            instanse = new SingleTracker();
        }
        return instanse;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    private int indexOf(int id) {
        return tracker.indexOf(id);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}