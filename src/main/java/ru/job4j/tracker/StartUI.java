package ru.job4j.tracker;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            boolean invalid = true;
            do {
                try {
                    int select = input.askInt("Select: ");
                    UserAction action = actions[select];
                    run = action.execute(input, tracker);
                    invalid = false;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Invalid number of item");
                }
            } while (invalid);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu:");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output), new EditAction(output),
                new DeleteAction(output), new ShowAction(output),
                new FindByIdAction(output), new FindByNameAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
    }
}