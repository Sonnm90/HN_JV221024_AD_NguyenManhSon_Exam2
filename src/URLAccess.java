import java.util.Scanner;
import java.util.Stack;

public class URLAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> accessListsURL = new Stack<>();
        boolean cont =true;
        int choice;
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập URL muốn truy cập\n" +
                    "2. Quay lại\n" +
                    "3. Thoát");
            choice =Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Enter URL to access:");
                    String URL = sc.nextLine();
                    accessListsURL.push(URL);
                    break;
                case 2:
                    accessListsURL.pop();
                    System.out.println(accessListsURL.peek());
                    break;
                case 3:
                    cont=false;
            }
        } while (cont);
    }
}
