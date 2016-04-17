package Account;

/**
 * Created by oleksiypolshchak on 4/15/16.
 */
public class Registration {
    private String name;
    private String surname;
    private String patronimyc;
    private String phone;
    private String email;
    private int id;

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

    public String getSurname() {
        return surname;
    }

    public String getPatronimyc() { return patronimyc;}

    public void setPatronimyc(String patronimyc) {this.patronimyc = patronimyc;}

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
}
