package Media;

/**
 * Created by oleksiypolshchak on 4/16/16.
 */
public class SFile {
    private String name;
    private String type;
    private String path;


    public SFile(String name, String type, String path) {
        this.name = name;
        this.type = type;
        this.path = path;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public String getFullpath() {
        return toString(path+name+"."+type);
    }

}
