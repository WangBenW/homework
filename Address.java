public class Address{
   public static void main(String[] args)
   {
       String a=new String();
       String c=new String("1234");
       a=c;
       a="5678";
       System.out.println(c);//���֤��c���ı�

       System.out.println(System.identityHashCode(c));//��ַΪ1627800613
       System.out.println(System.identityHashCode(a));//��ַΪ2065530879
   }
}
