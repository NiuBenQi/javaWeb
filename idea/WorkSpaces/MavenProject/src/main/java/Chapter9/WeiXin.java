package Chapter9;

import java.util.Random;
import java.util.Scanner;

/**
 * @author benqi
 * @date 2020/1/8 22:01
 * @Description  模拟微信抢红包功能
 */
public class WeiXin {

    public static void main(String[] args) {
        System.out.println("-------------微信红包-----------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入红包金额：");
        Double total = sc.nextDouble();
        System.out.println("请输入红包数量：");
        int bagCount = sc.nextInt();

        double min = 0.01; //红包最小金额
        Random c = new Random();

        for (int i=1;i<bagCount;i++){
            /**
             *  本次红包的最大金额 = 可分配金额 - （红包个数-已发红包个数）*最小金额
             */
            double max = total -(bagCount-i)*min;
            double bound = max-min; //本次红包 取值范围 13.34 *100 1314
            double safe = c.nextInt((int)(bound*100))/100;
            double money = safe + min;
            total = total- money;
            System.out.println("第"+i+"个红包"+String.format("%.2f",money)+"元");
        }
        System.out.println("第"+bagCount+"个红包"+String.format("%.2f",total)+"元");
        sc.close();
    }
}
