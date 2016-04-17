package Account;

import java.io.Serializable;

/**
 * Created by oleksiypolshchak on 4/17/16.
 */
public class AData implements Serializable {
    private String name = "Name";
    private String surname = "Surname";
    private String patronimyc = "Patronymic";

    public AData(String name, String surname, String patronimyc) {
        this.name = name;
        this.surname = surname;
        this.patronimyc = patronimyc;
    }
    private void setName(String name) {
        this.name = name;
    }

    private void setPatronimyc(String patronimyc) {
        this.patronimyc = patronimyc;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronimyc() {
        return patronimyc;
    }

    public String getSurname() {
        return surname;
    }


}

