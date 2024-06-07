import java.io.BufferedReader;
import java.io.InputStreamReader;

class Test{
  public static void main(String[] args){
    BufferedReader reader = new BufferedReader(
      new InputStreamReader(System.in));
    String name;
    try{
      System.out.println("enter your name");
      name = reader.readLine();
      System.out.println("name = "+name);
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}