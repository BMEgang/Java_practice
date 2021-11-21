package common;

import java.io.Serializable;

public class user implements Serializable {
    private static final long serialVersionUID=1L;
    private static String userId; //用户ID
    private String passwd; //用户密码

    public user(String userId, String passwd)
    {
        this.userId = userId;
        this.passwd = passwd;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public static String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
