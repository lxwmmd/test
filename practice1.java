public class practice1 {
    public static void main(String[] args) {
        int b1,b2,b3;
        for (int i=100;i<1000;i++) {
            /*判断输出水仙花数*/
            b3=i/100%10;
            b2=i/10%10;
            b1=i%10;
            if (Math.pow(b1,3)+Math.pow(b2,3)+Math.pow(b3,3)==i) {
                System.out.println("数"+i);
            }
        }
    }
}
