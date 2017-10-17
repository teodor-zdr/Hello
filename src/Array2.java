public class Array2 {

    public static void main(String args[]) {
        int[] arr;
        arr = new int[]{6, 3, 2, 1, 6, 2, 2, 2, 0, -5, 10};
        int count =0;
        int temp;
        for(int i=0; i<arr.length; i++){
            temp = arr[i];
            for(int j=0; j<arr.length; j++){
                if(arr[j] == temp ){
                    count++;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[1] + " > " + count);
        }

    }
}
