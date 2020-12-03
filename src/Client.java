import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        String inPut;
        Tv tv;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入生产电视的类型：(海尔 or 海信)");
        inPut = sc.nextLine();
        if(inPut.equals("海尔")){
            tv = new HaierFactory().makeTv();
            tv.using();
        }
        else if (inPut.equals("海信")){
            tv = new HisenseFactory().makeTv();
            tv.using();
        }
        else
            System.out.println("无该类型工厂，无法生产！");
    }
}
