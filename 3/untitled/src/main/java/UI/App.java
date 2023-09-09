package UI;

import MVP.Model;
import MVP.Presenter;
import MVP.View;

import java.util.Scanner;

public class App {
    public static void Start() {
        View view = new ConsoleView();
        Model model = new Model();
        Presenter presenter = new Presenter(model, view);
        boolean working = true;

        try (Scanner sc = new Scanner(System.in)) {
            while (working) {
                System.out.println("1 - добавить информацию\n0 - выход");
                String key = sc.next();

                switch (key) {
                    case "1":
                        presenter.add();
                        break;

                    case "0":
                        System.out.println("Окончание работы.");
                        working = false;
                        break;

                    default:
                        System.out.println("Такой команды нет!");
                        break;
                }
            }

        }
    }
}
