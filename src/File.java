public class File extends Content {

    private int size;
    private String type;
    
    public File(String name, int size, String type) {
        super(name);
        this.size = size;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected int getUsedSpace() {
        return size;
    }
}
