package HomeWork1.Resolves.hw1;

public class Comments {
    public int userId;
    public int id;

    public String name;
    public String email;
    public String body;

    public String toString() {
        return STR."userId \{userId} , id \{id}, name \{name}, email \{email}, body \{body}";
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
