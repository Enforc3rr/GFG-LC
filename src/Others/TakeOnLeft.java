package Others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class TakeOnLeft {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] inputArray = br.readLine().split(" ");
        Stack<Integer> stack = new Stack<>();
        stack.add(Integer.parseInt(inputArray[0]));
        System.out.print(-1 + " ");

        for (int i = 1; i < size; i++) {

            int numberToCheck = Integer.parseInt(inputArray[i]); //ignore

            boolean reachedHere = false;
            Stack<Integer> tempStack = (Stack<Integer>) stack.clone();

            while (!tempStack.isEmpty()) {
                int numberPopped = tempStack.pop();
                if (numberPopped < numberToCheck) {
                    reachedHere = true;//ignore
                    System.out.print(numberPopped + " ");
                    break;
                }
            }


            if (tempStack.isEmpty()&& !reachedHere)
                System.out.print(-1 + " ");


            stack.add(numberToCheck);
        }
    }
}
