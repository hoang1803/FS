import java.util.ArrayList;
import java.util.List;

public class Folder extends Content implements CreateContent {

    List<Content> contentList;
    
    public Folder(String name) {
        super(name);
        this.contentList = new ArrayList<>();
    }

    @Override
    protected int getUsedSpace() {
        int usedSpace = 0;
        for (Content content : contentList) {
            usedSpace += content.getUsedSpace();
        }
        return usedSpace;
    }

    @Override
    public void createFolder(String name) {
        contentList.add(new Folder(name));
    }

    @Override
    public void createFile(String name, int size, String type) {
        contentList.add(new File(name, size, type));
    }

    @Override
    public void createShortcut(Content content) {
        if (content instanceof File || content instanceof Folder) {
            contentList.add(content);
        }
    }

    public void addContent(Content content) {
        contentList.add(content);
    }
}
