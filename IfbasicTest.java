import java.util.Scanner;
public class IfbasicTest {
    public static void main(String[] args) {
        //Q. 정수 1개를 입력 받아 입력된 수가 7의 배수인지를 출력하세요.
        Scanner s = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int x= s.nextInt();
        if (x%7==0){
            System.out.println("7의 배수입니다");
        } else{
            System.out.println("7의 배수가 아닙니다");
        }

        //Q. 나이를 입력 받아 19세 이상이면 성인임을 출력하는 코드를 작성하세요
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하시오");
        int age = sc.nextInt();
        if (age>=19){
            System.out.println("성인입니다");
        } else {
            System.out.println("성인이 아닙니다");
        }
        System.out.println("종료");
    }
}
