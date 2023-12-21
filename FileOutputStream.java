import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
class FileOutputStream{
    
try{
FileInputStream f= new FileInputStream("f1.text");
Scanner S= new Scanner(f);
String n= S.nextLine();
System.out.println(n);
String n1= S.nextLine();
System.out.println(n1);
int n;
int c=0;
while (S.hasNextLine()) {
n=S.nextInt();
c++;
    System.out.println(n);
}
    System.out.println(c);
    
}
catch(FileNotFoundException e){
System.out.println("file does not exists");
}

}
