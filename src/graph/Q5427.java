package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q5427{
    static int R, C;
    static int[] xdir = {-1,1,0,0};
    static int[] ydir = {0,0,-1,1};
    static int min;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++) {
            String[] temp = br.readLine().split(" ");
            R = Integer.parseInt(temp[1]);
            C = Integer.parseInt(temp[0]);
            Pos person = null;
            Queue<Pos> fires = new LinkedList<>();
            int[][] visited = new int[R+2][C+2];

            for(int i=1; i<R+1; i++){
                String s = br.readLine();
                for(int j=1; j<C+1; j++){
                    char c = s.charAt(j-1);
                    if(c == '*'){
                        fires.offer(new Pos(i,j));
                        visited[i][j] = -1;
                    }
                    else if(c == '@')
                        person = new Pos(i,j,0);
                    else if(c == '#')
                        visited[i][j] = -1;
                }
            }

            min = Integer.MAX_VALUE;
            bfs(person, fires, visited);
            if(min != Integer.MAX_VALUE)
                System.out.println(min);
            else
                System.out.println("IMPOSSIBLE");
        }
    }

    private static void bfs(Pos person, Queue<Pos> fires, int[][] visited){
        Queue<Pos> q = new LinkedList<>();
        visited[person.x][person.y] = 1;
        q.offer(person);
        while(!q.isEmpty()) {
            for(int i=0, end=fires.size(); i<end; i++){
                Pos f = fires.poll();
                int fx = f.x;
                int fy = f.y;

                for(int j=0; j<4; j++){
                    int dfx = fx + xdir[j];
                    int dfy = fy + ydir[j];
                    if(dfx > 0 && dfy > 0 && dfx < R+1 && dfy < C+1 && visited[dfx][dfy] != -1){
                        visited[dfx][dfy] = -1;
                        fires.offer(new Pos(dfx, dfy));
                    }
                }
            }

            for(int i=0, end=q.size(); i<end; i++) {
                Pos p = q.poll();
                int x = p.x;
                int y = p.y;
                int time = p.time;


                if(x == 0 || y == 0 || x == R+1 || y == C+1){
                    min = min > time ? time : min;
                    continue;
                }

                for(int j=0; j<4; j++){
                    int dx = x + xdir[j];
                    int dy = y + ydir[j];

                    if(dx >= 0 && dy >= 0 && dx <= R+1 && dy <= C+1){
                        if(visited[dx][dy] != -1 && visited[dx][dy] != 1) {
                            q.offer(new Pos(dx, dy, time+1));
                            visited[dx][dy] = 1;
                        }
                    }
                }
            }
        }
    }
}
class Pos{
    int x;
    int y;
    int time;

    Pos(int x, int y){
        this.x = x;
        this.y = y;
    }

    Pos(int x, int y, int time){
        this.x = x;
        this.y = y;
        this.time = time;
    }
}