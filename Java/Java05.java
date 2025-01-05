public class Java05 {
    public String EvenOdd(int num) {
      if(num % 2 == 0) return "EVEN";
      else return "ODD";
    }
    public static void main(String args[]) {
      Java05 j = new Java05();
      System.out.println(j.EvenOdd(14)); // EVEN
      System.out.println(j.EvenOdd(23)); // ODD
    }
}