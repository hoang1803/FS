import java.util.ArrayList;
import java.util.List;

public class FS {
    private static List<Disk> diskList = new ArrayList<>();

    public static void createDisk(String name, int volume) {
        diskList.add(new Disk(name, volume));
    }

    public static void addDist(Disk disk) {
        diskList.add(disk);
    }

}
