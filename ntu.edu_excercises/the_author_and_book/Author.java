package the_author_and_book;

public class Author {
    protected String name = null;
    protected String email = null;
    public Author (String name, String email) {
        this.email = email;
        this.name = name;
    }

    public String getName() { return name;}

    public String getEmail() { return email;}

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Name: " + name + "; Email: " + email;
    }


}
