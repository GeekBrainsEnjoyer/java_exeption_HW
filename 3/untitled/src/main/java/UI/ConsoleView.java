package UI;

import MVP.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner sc;

    @Override
    public String getFIO() {
        System.out.println("Укажите ФИО(через пробел): ");
        return sc.nextLine();
    }

    public ConsoleView() {
        sc = new Scanner(System.in);
    }

    @Override
    public String getBirthday() {
        System.out.println("Укажите дату рождения формата dd.mm.yyyy: ");
        return sc.nextLine();
    }

    @Override
    public String getPhone() {
        System.out.println("Укажите номер телефона: ");
        return sc.nextLine();
    }

    @Override
    public String getGender() {
        System.out.println("Укажите пол(f - жен., m - муж.): ");
        return sc.nextLine();
    }
}
