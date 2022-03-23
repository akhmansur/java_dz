package filesystem;

public class Main {

    public static void main(String[] args) {
        int N = 2;
        File firstFile = new File("first.txt");
        File secondFile = new File("second.jpg");

        File thirdFile = new File("third.pdf");
        File fourthFile = new File("fourth.bmp");

        Folder lastFolder1 = new Folder("lastFolder", firstFile,secondFile);
        Folder lastFolder2 = new Folder("lastFolder", thirdFile,fourthFile);

        Folder preLastFolder = new Folder("preLastFolder", lastFolder1, lastFolder2);
        Folder prePreLastFolder = new Folder("prePreLastFolder", preLastFolder);
        Folder root = new Folder("", prePreLastFolder);

        System.out.println("Path for first file: " + firstFile.getPath());
        System.out.println("Nth file of \"lastFolder2\": " + lastFolder2.getChilds()[N-1].getExtension());
    }
}