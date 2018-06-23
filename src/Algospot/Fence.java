package Algospot;

import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Fence {
    public static void main(String[] args) {
        final InputStreamReader reader = new InputStreamReader(System.in);
        final BufferedReader in = new BufferedReader(reader);

        try {
            StringTokenizer st = new StringTokenizer(in.readLine());            
            int testCases = Integer.parseInt(st.nextToken());

            for (int t = 0; t < testCases; t++) {
                st = new StringTokenizer(in.readLine());
                int N = Integer.parseInt(st.nextToken());


                int[] fences = new int[N];
                st = new StringTokenizer(in.readLine());
                for (int i = 0; i < N; i++) {
                    fences[i] = Integer.parseInt(st.nextToken());
                }

                System.out.println(solve(N, fences));
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e.getCause());
        }
    }

    private static int solve(int N, int[] fences) {
        return solve(fences, 0, fences.length-1);
    }

    private static int solve(int[] fences, int left, int right) {
        if (left == right) {
            return fences[left];
        }

        int mid = (left+right)/2;
        int ret = max(solve(fences, left, mid), solve(fences, mid+1, right));

        int lo = mid, hi = mid+1;
        int height = min(fences[lo], fences[hi]);
        ret = max(ret, height * 2);

        while (left < lo && hi < right) {
            if (hi < right && fences[lo-1] < fences[hi+1]) {
                hi++;
                height = min(height, fences[hi]);
            } else {
                lo--;
                height = min(height, fences[lo]);
            }

            ret = max(ret, (hi-lo+1) * height);
        }

        return ret;
    }
}
