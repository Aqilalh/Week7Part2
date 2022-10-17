package Assignment;

public abstract class User extends Admin implements IPrint{
    private String username;


    private String password;

    public User(String string1, String string2) {
        super(string1, string2);
    }

    public User(String string1, String string2, String username, String password) {
        super(string1, string2);
        this.username = username;
        this.password = password;
    }


    @Override
    public void print() {
        System.out.println(toString());
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


