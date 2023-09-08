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
        String[] fio = validatingFIO();
        model.save(new UserInfo(fio[0],
                fio[1],
                fio[2],
                view.getData(),
                Integer.parseInt(view.getPhone()),
                view.getGender().charAt(0))
        );
    }

    private String[] validatingFIO() {
        boolean run = true;
        String[] fioArr = new String[3];

        fioArr = view.getFIO().trim().split(" ");

        if (fioArr.length != 3)
            throw new RuntimeException("Некоррекстное ФИО!");


        return fioArr;
    }
}
