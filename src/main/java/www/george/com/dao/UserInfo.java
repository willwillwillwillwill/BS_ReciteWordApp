package www.george.com.dao;

public class UserInfo {
    private String firstName;
    private String lastName;
    private String emailAddr;
    private String password;
    private Long emailState;


    public String getEmailAddr() {
        return emailAddr;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getEmailState() {
        return emailState;
    }

    public void setEmailState(Long emailState) {
        this.emailState = emailState;
    }
}
