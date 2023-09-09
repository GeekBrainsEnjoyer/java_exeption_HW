package MVP;

import Models.UserInfo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Model {
    public Model() {
    }

    public void save(UserInfo userInfo) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.format(
                    "src/main/java/Data/%s.txt", userInfo.getSecondName()), true));

            bufferedWriter.write(String.format("%s %s %s %s %d %s",
                    userInfo.getSecondName(),
                    userInfo.getFirstName(),
                    userInfo.getOtchestvo(),
                    userInfo.getBirthday(),
                    userInfo.getPhoneNum(),
                    userInfo.getGender()));

            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
