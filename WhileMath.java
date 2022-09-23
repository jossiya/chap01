public class WhileMath {
    public static void main(String[] args) {
       int run = 0;
        System.out.println("시작!");
       while(run<1000000){
           int a=(int)(Math.random()*6)+1;
           int b= (int)(Math.random()*6)+1;

            run++;
           System.out.printf("(%d,%d)\n",a,b);
           if(a+b==5) {
               System.out.println("끝!");
               break;
           }
       }

    }
}
