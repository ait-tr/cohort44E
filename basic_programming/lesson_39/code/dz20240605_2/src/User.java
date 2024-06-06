public class User {
    private String nickname;
    private String email;

    public User(String nickname, String email) {
        this.nickname = nickname;
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return nickname + " (" +  email + ")";
    }
}
