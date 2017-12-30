package Programmers;

class TryHelloWorld {
    public long chooseCity(int n, int[][] city) {
        int current = 0;
        long[] distance = new long[n];
        long[] index = new long[n];
        long min = 9223372036854775807L;
        long minIdx = 9223372036854775807L;

        for (current = 0; current < n; current++) {
            index[current] = city[current][0];
            for (int i = 0; i < n; i++) {
                distance[current] += Math.abs(city[current][0] - city[i][0]) * city[i][1];
            }
        }

        for (int i = 0; i < n; i++) {
            if(Math.min(distance[i], min) < min) {
                min = distance[i];
                minIdx = index[i];
            }
        }

        return minIdx;
    }

    public static void main(String[] args) {
        TryHelloWorld test = new TryHelloWorld();
        int tn = 6;
        int[][] tcity = {{-5, 11}, {-2,99}, {-8,14}, {1,987654}, {2,2}, {3,3}};
        System.out.println(test.chooseCity(tn, tcity));
    }
}