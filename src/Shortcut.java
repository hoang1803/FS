public class Shortcut extends Content {

    private Content root;

    public Shortcut(String name, Content root) {
        super(name);
        this.root = root;
    }

    @Override
    protected int getUsedSpace() {
        return 1;
    }
}
