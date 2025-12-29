public class Arraydemo {
    public static void main(String[] args){
        int [] numbers={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);
        double average=(double)sum/numbers.length;
        System.out.println("Average:"+average);
    }
}