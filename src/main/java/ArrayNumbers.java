public class ArrayNumbers
{
  
public static void main(int[] array,int n)
   {
   for(int i=0; i<array.length; i++)
   {
       if (array[i]>n)
           System.out.println(array[i]);
   }
   System.out.println("Are the larger Numbers");
}

   public static void main(String[] args)
   {
       int[] array1 = {5,45,12,10,1,-4};
       int num1=6;
       main(array1,num1);
      
   }
}