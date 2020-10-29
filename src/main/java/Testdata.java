class Testdata {

public static int getTotal(int array[]){

int sum=0;

for(int i=0;i<array.length;i++)

sum+=array[i];

return sum;

}

public static double getAverage(int array[]){

int sum=getTotal(array);

double avg=(double)sum/array.length;

return avg;

}

public static int getMaximum(int array[]){

int max=array[0];

for(int i=0;i<array.length;i++){

if(array[i]>max)

max=array[i];

}

return max;

}

public static int getMinimum(int array[]){

int min=array[0];

for(int i=0;i<array.length;i++){

if(array[i]<min)

min=array[i];

}

return min;

}

public static void main(String args[]){

int array1[]={1,2,3,4,5,6};

System.out.println("Sum of array is "+getTotal(array1));

int array2[]={1,2,3,4};

System.out.println("Average of array is "+getAverage(array2));

int array3[]={1,2,3,4,5,6,7,8,9};

System.out.println("Max of array is "+getMaximum(array3));

int array4[]={1,2,3,4,5};

System.out.println("Min of array is "+getMinimum(array4));

}

}