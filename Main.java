import java.util.Random;
class Main {  
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(51);
    System.out.println("The Random number is:" + randomNum);
    
  }
}