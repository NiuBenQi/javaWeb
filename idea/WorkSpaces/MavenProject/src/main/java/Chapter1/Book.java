package Chapter1;

/**
 * @author benqi
 * @date 2020/1/5 12:04
 * @Description
 */
public class Book {
    private int id;
    private String name;
    private String auth;

    public Book(int id, String name, String auth) {
        this.id = id;
        this.name = name;
        this.auth = auth;
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

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }
}
