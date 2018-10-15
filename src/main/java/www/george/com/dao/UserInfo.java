package www.george.com.dao;

public class UserInfo {
    private String emailAddr;
    private String password;
    private Long state;


    public Long getState() {
        return state;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public String getPassword() {
        return password;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setState(Long state) {
        this.state = state;
    }
}
