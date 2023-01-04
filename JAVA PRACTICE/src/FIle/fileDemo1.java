
import java.io.File;

public class fileDemo1{
    public static void main(String[] args) {
        
      File f = new File("E:/JAVA/JAVA PRACTICE/src/FIle/person");
      f.mkdir();
      String path = f.getAbsolutePath();

      File file1 = new File(path+"/student.txt");
      File file2 = new File(path+"/teacher.txt");
      File file3 = new File(path+"/person.txt");

      try {
        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();
        System.out.println("Files are created");
      } catch (Exception e) {
       System.out.println("Exception");
      }

      if(file1.exists()){
        System.out.println("file exists");
      }
      file3.delete();
      if(file3.exists() == false){
        System.out.println("file doesnot exist");
      }

    }
}