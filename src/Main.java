public class Main {
    public static void main(String[] args) {
        Disk disk = new Disk("C", 1024);
        Folder folder = new Folder("Check");
        folder.createFile("dmm", 100, "text");
        folder.createFile("dmm2", 102, "binary");
        File file = new File("aloalo", 109, "text");
        Shortcut shortcut = new Shortcut("aloaloShortcut", file);
        folder.addContent(file);
        disk.addContent(folder);
        disk.addContent(shortcut);

        System.out.println("FreeSpace Disk: " + disk.getFreeSpace() + " KB");

    }
}