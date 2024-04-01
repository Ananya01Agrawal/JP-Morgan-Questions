import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nim=sc.nextInt();
        int kim=sc.nextInt();
        //int yui=0;
        int []anan=new int[nim];
        for(int i=0;i<nim;i++){
            anan[i]=sc.nextInt();
        }
        long sim=0;
        PriorityQueue<Integer>mp=new PriorityQueue<>(Collections.reverseOrder());
        for(int vim:anan){
            mp.offer(vim);
        }
        for(int i=0;i<kim;i++){
            int ani=mp.poll();
            sim+=ani;
            int qw=(int)Math.ceil((double)ani/3);
            mp.offer(qw);
        }
        System.out.println(sim);
    }
}

           
