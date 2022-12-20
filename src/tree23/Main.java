package tree23;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\A1eX\\Desktop\\PROCS.txt");
        int c;
        Tree23 tree = new Tree23();
        while ((c = reader.read()) != -1) {
            System.out.println((char) c);
            tree.root = tree.insert(tree.root, (char) c);
        }
        System.out.println("\n");
        tree.print(tree.root);
        tree.root = tree.deleteNode(tree.root, 10);
        System.out.println("\n");
        tree.print(tree.root);
    }
}
