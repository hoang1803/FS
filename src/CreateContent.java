public interface CreateContent {
    void createFolder(String name);
    void createFile(String name, int size, String type);
    void createShortcut(Content content);
}
