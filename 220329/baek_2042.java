package al;

import java.io.*;
import java.util.*;

public class baek_2042 {
    static long arr[], tree[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 수의 개수
        int M = Integer.parseInt(st.nextToken());   // 변경 횟수
        int K = Integer.parseInt(st.nextToken());   // 구간 합 횟수

        arr = new long[N];
        tree = new long[4 * N]; // 4배 하면 모든 범위 수용 가능

        for (int i = 0; i < N; i++) 
            arr[i] = Long.parseLong(br.readLine());

        init(0, arr.length - 1, 1);

        for (int i = 0; i < M + K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            if (a == 1) {  // 변경
                long dif = c - arr[b - 1];
                update(0, arr.length - 1, 1, b - 1, dif);
            } 
            else if (a == 2)  // 구간 합
                bw.write(sum(0, arr.length - 1, 1, b - 1, c - 1) + "\n");
            else 
                return;
            
        }
        br.close();
        bw.flush();
        bw.close();
    }

    static long init(int start, int end, int node) {
        if (start == end)
            return tree[node] = arr[start];
        else {
            int mid = (start + end) / 2;
            return tree[node] = init(start, mid, node * 2) + init(mid + 1, end, node * 2 + 1);
        }
    }

    static long sum(int start, int end, int node, int left, long right) {
        if (left > end || right < start)   // 범위 밖
            return 0;
        
        if (left <= start && end <= right)  // 범위 안
            return tree[node];
        
        int mid = (start + end) / 2;
        return sum(start, mid, node * 2, left, right) + sum(mid + 1, end, node * 2 + 1, left, right);
    }

    static void update(int start, int end, int node, int index, long dif) { // index : 원래 배열에서 바꾸려는 자리, 
        if (index < start || index > end)  // 범위 밖                       // dif : 원래 값과 바꾸려는 값 차이
            return;

        tree[node] += dif; // 범위 안
        if (start == end) { // leaf 노드일 때
            arr[index] = tree[node];    
            return;
        }

        int mid = (start + end) / 2;
        update(start, mid, node * 2, index, dif);
        update(mid + 1, end, node * 2 + 1, index, dif);
    }
}