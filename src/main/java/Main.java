import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if( scanner.nextInt() * scanner.nextInt() == scanner.nextInt() ){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
