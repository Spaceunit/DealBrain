package Role;

import Account.*;

/**
 * Created by oleksiypolshchak on 4/17/16.
 */
abstract public class Subject {
    private String name;
    private String type;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
