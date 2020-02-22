import java.util.Scanner;

public class HR2_STDInSTDOut {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        double d = in.nextDouble();
        in.nextLine();
        String str = in.nextLine();

        System.out.println("String : "+ str);
        System.out.println("Integer: "+ i);
        System.out.println("Double : "+ d);


    }

}
