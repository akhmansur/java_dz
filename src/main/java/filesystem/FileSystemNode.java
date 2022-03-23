package filesystem;

public interface FileSystemNode {
    FileSystemNode getParent();
    String getName();
    String getPath();
    void setParentNode(FileSystemNode parent);
    void setName(String name);
    String getExtension();
}
