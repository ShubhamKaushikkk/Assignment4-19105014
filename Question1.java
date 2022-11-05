import java.util.*;
public class Question1 {
    public static void main(String []args){
        int n;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        String c="";
        Vector v= new Vector(n);
        String s = sc.nextLine();
        v.add(s);
        while(v.size()<=n){
            s= sc.nextLine();
            if(s==c)
                break;
            else v.add(s);
        }
        if(v.size()>0)
        v.remove(0);
        System.out.println(v.toString());
    }
}
