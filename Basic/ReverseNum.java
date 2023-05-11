package Basic;
public class ReverseNum {
    public static void main(String[] args){
        int num = 789456;
        int re=0;
        while(num>0){
            int temp = num%10;
            re = re*10+temp;
            num=num/10;

        }
        System.out.println(re);
    
    }
    
}
