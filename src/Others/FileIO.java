package Others;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIO {
    public static void main(String[] args) throws Exception {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
        bufferedWriter.write("Hello \n World");
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("output.txt"));
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();
    }
    public void print(){
        System.out.println("Hello");

    }
    public void print2(){
        System.out.println("Hello");
    }
}


class FileIO2 extends FileIO{
    public void print3(){
        System.out.println("Hello");
        print();
    }
}

class FileIO3 extends FileIO2{
    public void print4(){
        System.out.println("Hello");
        print();
    }
}