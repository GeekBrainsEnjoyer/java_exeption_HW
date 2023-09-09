package MVP;

import Models.UserInfo;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void add() {
        try {
            String[] fio = creatingFioArr();
            model.save(new UserInfo(fio[0],
                    fio[1],
                    fio[2],
                    validatingBirtday(view.getBirthday()),
                    validatingPhoneNum(view.getPhone()),
                    validatingGender(view.getGender())
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String[] creatingFioArr() {
        String[] temp = view.getFIO().trim().split(" ");
        if (temp.length != 3)
            throw new RuntimeException("Некорректное ФИО!");

        return temp;
    }

    private String validatingBirtday(String data) {
        String[] dataTemp = data.trim().split("\\.");
        int day = Integer.parseInt(dataTemp[0]);
        int month = Integer.parseInt(dataTemp[1]);
        int year = Integer.parseInt(dataTemp[2]);

        if (dataTemp.length != 3)
            throw new RuntimeException("Некорректная дата дня рождения!");
        else if (day <= 0 || day >= 32)
            throw new RuntimeException("Некорректный день рождения!");
        else if (month <= 0 || month >= 13)
            throw new RuntimeException("Некорректный месяц рождения!");
        else if (year <= 1900 || year >= 2023)
            throw new RuntimeException("Некорректный год рождения!");

        return data;
    }

    private long validatingPhoneNum(String phoneNum) {
        long number = 0;
        try {
            number = Long.parseLong(phoneNum);
            if(number < 1000000000L || number > 1000000000000L)
                throw new RuntimeException("Некорректный номер телефона!");

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Некорректный номер телефона!");
        }
        return number;
    }

    private char validatingGender(String gender){
        char[] temp = gender.toCharArray();
        char gend = temp[0];
        char f = 'f';
        char m = 'm';
        if(temp.length > 1 || (gend != f && gend != m))
            throw new RuntimeException("Пол указан некорректно!");

        return gend;
    }
}
