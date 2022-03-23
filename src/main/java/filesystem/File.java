package filesystem;

import java.util.regex.Pattern;

public class File  extends AbstractFileSystemNode{
    File(String name) {
        setName(name);
    }

    public String getExtension() {
        String fe = "";
        fe = getName().replaceAll("^.*\\.(.*)$", "$1");
        return fe;
    }
}
