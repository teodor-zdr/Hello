public class Array {

    public static void main(String args[]) {
        int[] arr;
        arr = new int[]{6, 3, 2, 1, 6, 2, 2, 2, 0, -5, 10};
        System.out.println(arr.length-1);

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            System.out.println(arr[i]+" \t " +">"+"\t"+count);
            if(count!=0)
            {
                i=i+count-1;
            }
            count=0;
        }
    }
}

