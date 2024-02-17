import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class nnew {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner =new Scanner(new File("words.txt"));
        
        int count=0;
        while(scanner.hasNext()){
            String word=scanner.next();
            count++;
        }
        System.out.println("File has "+ count+" words");
    }
}