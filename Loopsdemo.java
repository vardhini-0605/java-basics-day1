public class Loopsdemo {
    public static void main(String[] args){
        for(int no=1;no<=10;no=no+1)
        {
            for(int i=1;i<=10;i=i+1){
                System.out.println(no+"X"+i+"="+(no*i));
            }
            System.out.println();
        }
    }
}

