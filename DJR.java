public class DJR {
    static int num[] = new int[202];
        public static void main(String[] args){
        // System.out.println("Hello World!");
        num[1]=1; num[2]=1; int head,i;
        for (head=3;num[head-1]<=200;head++){
            num[head]=num[head-1]+num[head-2];
        }
        for (i=1;i<head-1;i++) System.out.println(Fibonacci.of(i));
    }
}
class Fibonacci{
    public static int of(int x){
        return DJR.num[x];
    }
}