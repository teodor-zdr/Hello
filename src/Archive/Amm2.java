package Archive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Amm2 {
    public static void main(String args[]) throws IOException {
        try {
            File file = new File("c:\\apps\\test.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            long total=0;
            int count =0;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");
                String el[] = line.split("x");
                int[] array = Arrays.asList(el).stream().mapToInt(Integer::parseInt).toArray();

                long result;
                Arrays.sort(array);
                int min = array[0];
                int mid = array[1];
                int max = array[2];

//                for (int i =0;i<array.length;i++){
//                    System.out.println(array[i]);
//                }
//                for (int i = 0; i<array.length;i++){
//                    if(array[i] < min){
//                        min = array[i];
//                    }
//                }
//                for (int i = 0; i<array.length;i++){
//                    if(array[i] > max){
//                        max = array[i];
//                    }
//                }
//                for (int i = 0; i<array.length;i++){
//                    if(array[i] >= min && array[i] < max){
//                        mid = array[i];
//                    }
//                }
                result = 2*(min*mid + mid*max + min*max) +min*mid;

                System.out.println("Min " + min);
                System.out.println("Mid " + mid);
                System.out.println("Max " + max);
                System.out.println(result);
                System.out.println();
                total = result+total;
                count++;
                System.out.println(count);
                System.out.println("total "+total);
                System.out.println();
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
