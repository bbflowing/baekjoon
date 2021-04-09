package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Q10472 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String answer = "";
        for (int i = 0; i < T; ++i) {
            HashMap<String, Boolean> check = new HashMap<>();
            String input = "000000000";
            check.put(input, true);
            String output = "";
            for (int a = 0; a < 3; ++a) {
                String line = br.readLine();
                for (int j = 0; j < 3; ++j) {
                    if (line.charAt(j) == '*') {
                        output += 1;
                    } else if (line.charAt(j) == '.') {
                        output += 0;
                    }
                }
            }
            //System.out.println("o: "+output);

            Queue<Pair> queue = new LinkedList<>();
            queue.add(new Pair(input, 0));
            while (!queue.isEmpty()) {
                Pair current = queue.poll();
                if (current.value.equals(output)) {
                    answer += current.count+"\n";
                    break;
                }
                for (int j = 1; j <= 9; ++j) {
                    ArrayList<Integer> change = new ArrayList<>();
                    if (j == 1) { //1, 2, 4
                        change.add(0);
                        change.add(1);
                        change.add(3);
                    } else if (j == 2) { //1, 2, 3, 5
                        change.add(0);
                        change.add(1);
                        change.add(2);
                        change.add(4);
                    } else if (j == 3) { //2, 3, 6
                        change.add(1);
                        change.add(2);
                        change.add(5);
                    } else if (j == 4) { //1, 4, 5, 7
                        change.add(0);
                        change.add(3);
                        change.add(4);
                        change.add(6);
                    } else if (j == 5) { //2, 4, 5, 6, 8
                        change.add(1);
                        change.add(3);
                        change.add(4);
                        change.add(5);
                        change.add(7);
                    } else if (j == 6) { //3, 5, 6, 9
                        change.add(2);
                        change.add(4);
                        change.add(5);
                        change.add(8);
                    } else if (j == 7) { //4, 7, 8
                        change.add(3);
                        change.add(6);
                        change.add(7);
                    } else if (j == 8) { //5, 7, 8, 9
                        change.add(4);
                        change.add(6);
                        change.add(7);
                        change.add(8);
                    } else if (j == 9) { //6, 8, 9
                        change.add(5);
                        change.add(7);
                        change.add(8);
                    }
                    String temp = press(change, current.value);
                    //System.out.println(temp);
                    if (!check.containsKey(temp)){
                        check.put(temp, true);
                        queue.add(new Pair(temp, current.count+1));
                    }
                }
            }
        }
        System.out.println(answer);
    }

    public static String press (ArrayList<Integer> change, String input) {
        char [] arr = input.toCharArray();
        for (int i=0; i<change.size(); ++i) {
            if (arr[change.get(i)] == '0') {
                arr[change.get(i)] = '1';
            } else {
                arr[change.get(i)] = '0';
            }
        }
        input = "";
        for (int i=0; i<9; ++i) {
            input += arr[i];
        }
        return input;
    }

     */
}

/*
class Pair {
    String value;
    int count;

    Pair (String value, int count) {
        this.value = value;
        this.count = count;
    }
}

 */
