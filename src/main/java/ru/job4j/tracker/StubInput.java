package ru.job4j.tracker;

public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    private Output out;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    public StubInput(String[] answers, Output out) {
        this.answers = answers;
        this.out = out;
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = Integer.parseInt(askStr(question));
                invalid = false;
            } catch (NumberFormatException nfe) {
                out.println("Please use numbers");
            }
        } while (invalid);
        return value;
    }
}