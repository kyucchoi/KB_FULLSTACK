package cliFramework.v2;

public class App {
    int studentNum = 0;
    int[] scores = null;

    Menu menu;

    public App() {
        menu = new Menu();
    }

    public void run() {
        while (true) {
            menu.printMenu();
            int selectNo = menu.getSelect();
//            executeCommand(selectNo);
        }
    }
}
