package filesystem;

abstract class AbstractFileSystemNode implements FileSystemNode {
    private String name;
    private FileSystemNode parent;
    public final FileSystemNode getParent() {
        return parent;
    }

    public String getName(){
        return name;
    }

    public final String getPath(){
        if(this.getParent() == null) {
            return this.getName();
        }
        return this.getParent().getPath() + "/" + this.getName();
    }

    public final void setParentNode(FileSystemNode parent) {
        this.parent = parent;
    }

    public final void setName(String name){
        this.name = name;
    }

    public String getExtension() {
        return "Is not a file";
    }
}
