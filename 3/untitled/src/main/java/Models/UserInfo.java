package Models;

public class UserInfo {
    private String secondName;
    private String firstName;
    private String otchestvo;
    private String birthday;
    private long phoneNum;
    private char gender;

    public UserInfo(String secondName, String firstName, String otchestvo, String date, long phoneNum, char gender) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.otchestvo = otchestvo;
        this.birthday = date;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
