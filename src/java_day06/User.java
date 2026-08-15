package java_day06;

public class User {
    private String ID;
    private String Username;
    private String Pass;

    public User(String ID, String username, String pass) {
        this.ID = ID;
        Username = username;
        Pass = pass;
    }

    public User() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }
}
