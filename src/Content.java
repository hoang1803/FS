public abstract class Content {
    private String name;
    
    public Content(String name) {
        this.name = name;
    }
    
    protected abstract int getUsedSpace();
}
