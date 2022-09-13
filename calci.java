import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while(true){
            // take the operator as input
            System.out.println("enter the operater");
            char op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '5'){
                System.out.println("enter the two numbers");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                        ans = num1 + num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }


            }else if(op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Invalid opration!!!!");
            }

            System.out.println(ans);
        }

    }
}
