package filesystem;

public class Folder extends AbstractFileSystemNode {
    private FileSystemNode[] childs;

    Folder(String name, FileSystemNode ...nodes) {
        this.childs = nodes;
        for(FileSystemNode child: this.childs) {
            child.setParentNode(this);
        }
        setName(name);
    }

    public FileSystemNode[] getChilds() {
        return this.childs;
    }
}
