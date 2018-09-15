public class Address{
   public static void main(String[] args)
   {
       String a=new String();
       String c=new String("1234");
       a=c;
       a="5678";
       System.out.println(c);//结果证明c不改变

       System.out.println(System.identityHashCode(c));//地址为1627800613
       System.out.println(System.identityHashCode(a));//地址为2065530879
   }
}
