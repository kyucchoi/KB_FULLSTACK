package cliFramework.command;

import cliFramework.v2.Menu;

public class App {
    Menu menu;
    Command[] commands;

    public App() {
        menu = new Menu();
        commands = new Command[]{
                new InitScoresCommand(),
                new GetScoresCommand(),
                new PrintScoreCommand(),
                new AnalizeCommand(),
                new ExitCommand()
        };
    }

    public void executeCommand(int selectNo) {
        Command command = commands[selectNo - 1];
        command.execute();
    }

    public void run() {
        while (true) {
            menu.printMenu();
            int selectNo = menu.getSelect();
            executeCommand(selectNo);
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}
