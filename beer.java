
public class beer{
   public static void main(String[]args){
         int num=99;	
		 for(int i=num;i>=0;i--)
		{
                        if(i>2)
			{
				System.out.println(i+" bottles of beer on the wall,"+i+" bottles of beer.\nTake one down\nPass it around \n"+(i-1)+" bottles of beer on the wall\n");
			}

			else if(i==2)
			{
				System.out.println(i+" bottles of beer on the wall,"+i+" bottles of beer.\nTake one down\nPass it around \n"+(i-1)+" bottle of beer on the wall\n");
			}

			else if(i==1)
			{
				System.out.println(i+" bottle of beer on the wall,"+i+" bottles of beer.\nTake one down\nPass it around \n"+(i-1)+" bottle of beer on the wall\n");
			}
	                else
			{
				
				System.out.println("no more bottles of beer on the wall");
			}
			
			
		} 
	   }
	}
