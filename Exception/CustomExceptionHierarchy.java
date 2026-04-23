package Exception;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class CustomExceptionHierarchy {
    public static void main(String[] args) throws TaskNotFoundException , InvalidTaskDataException{
        try(Scanner sc = new Scanner(new File("C:\\Users\\LENOVO\\Desktop\\abc.txt"))){
            if (!sc.hasNextLine()) {
                throw new InvalidTaskDataException("The task file exists, but it is empty!");
            }
             while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
           throw new TaskNotFoundException("Could not locate the task file on the desktop", e);
        }
    }

    
}
