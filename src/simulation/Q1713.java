package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1713 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        ArrayList<Photo> photos = new ArrayList<>();
        int counter = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean check [] = new boolean [M+1];
        for (int i=1; i<=M; ++i) {
            int recommended = Integer.parseInt(st.nextToken());
            if (!check[recommended]) {
                if (counter < N) {
                    ++counter;
                } else if (counter == N) {
                    check[photos.remove(0).name] = false;
                }
                photos.add(new Photo(recommended, 1, i));
                check[recommended] = true;
            } else {
                for (int j = 0; j < photos.size(); ++j) {
                    if (photos.get(j).name == recommended) {
                        ++photos.get(j).number;
                    }
                }
            }
            Collections.sort(photos, new arrangeSort());
        }

        Collections.sort(photos, new nameSort());
        String answer = "";
        for (int i=0; i<photos.size(); ++i) {
            answer += photos.get(i).name + " ";
        }
        System.out.println(answer);
    }
}

class Photo {
    int name;
    int number;
    int time;

    Photo(int name, int number, int time) {
        this.name = name;
        this.number = number;
        this.time = time;
    }
}

class arrangeSort implements Comparator<Photo> {
    @Override
    public int compare(Photo p1, Photo p2) {
        if (p1.number > p2.number) {
            return 1;
        } else if (p1.number == p2.number) {
            if (p1.time > p2.time) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}

class nameSort implements Comparator<Photo> {
    @Override
    public int compare(Photo p1, Photo p2) {
        if (p1.name > p2.name) {
            return 1;
        } else {
            return -1;
        }
    }
}


