package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q1342 {
    /*
    public static int alphabets [];
    public static int answer;
    public static HashMap<String, Boolean> visited;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] S = br.readLine().toCharArray();
        alphabets = new int [26];
        for (int i=0; i<S.length; ++i) {
            ++alphabets[S[i]-'a'];
        }
        answer = 0;
        for (int i=0; i<26; ++i) {
            if (alphabets[i] != 0) {
                char[] result = new char[S.length];
                result[0] = (char) ('a'+i);
                --alphabets[i];
                visited = new HashMap<>();
                solve(result, 1);
                ++alphabets[i];
            }
        }
        System.out.println(answer);
    }

    public static void solve (char [] temp, int index) {
        if (index == temp.length) {
            String result = "";
            for (int i = 0; i < temp.length; ++i) {
                result += temp[i];
            }
            if (!visited.containsKey(result)) {
                visited.put(result, true);
                ++answer;
                //System.out.println(result);
            }
            return;
        }

        char previous = temp[index - 1];
        for (int i = 0; i < 26; ++i) {
            char target = (char) ('a' + i);
            if (previous != target && alphabets[target - 'a'] > 0) {
                temp[index] = target;
                --alphabets[target - 'a'];
                solve(temp, index + 1);
                temp[index] = ' ';
                ++alphabets[target - 'a'];
            }
        }
    }
     */
}
