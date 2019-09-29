import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), res = 0;
        int[] h = new int[n];
        for (int i = 0; i < n; i++) h[i] = Integer.parseInt(br.readLine());
        br.close();
        for (int i = 0; i < n - 1; i++) for (int j = i + 1; j < n; j++) if (h[i] > h[j]) res++;
        System.out.println(res);
    }
}