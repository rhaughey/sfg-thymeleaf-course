package guru.springframework.commands;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Created by rfh on 12/15/2019
 */
public class LoginCommand {

    @NotEmpty
    @Size(min = 6, max = 25)
    private String userName;

    @NotEmpty
    @Size(min = 8, max = 25)
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
