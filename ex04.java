import java.util.Random;
public class DM4-1{
public static void main (String[] args)
{
Random r=new Random();
int ran;
int cnt1=0;
int cnt2=0;
System.out.println("Tossing a coin ...");
for(int i=1;i<=3;i++){
ran=r.nextInt(2);
switch(ran){
case 0:
cnt1++;
System.out.println("Round "+i+: Heads");
break;

case 1:
cnt2++;
System.out.println("Round "+i+": Tails");
break;
}
}
System.out.println(Heads: "+cnt1+", Tails: "+cnt2);
if(cnt1>cnt2)System.out.println("You won!");
                   else System.out.println("You lost…");
}
}
