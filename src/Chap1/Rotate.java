package Chap1;

import java.util.Iterator;
import java.util.Vector;

// 시계 방향으로 돌린다
public class Rotate {
    private int N;
    private int stage;
    private int currentLength;
    private int totalLength;
    private int index;
    private Integer[] origin;

    public void setVar(Integer[] origin) {
        this.N = (int)Math.sqrt(origin.length);
        this.totalLength = origin.length;
        this.origin = origin;
        this.currentLength = 0;
        this.stage = 1;
        this.index = 0;
    }

    public Vector<Vector<Integer>> ArrayToVector(Integer[] origin) {
        setVar(origin);

        Vector<Vector<Integer>> result = new Vector<>();

        for(int i = 0; i < this.N; i++)
            result.add(getStage());

        return result;
    }

    public Integer[] getArrayRotated(Integer[] origin) {
        Vector<Integer> result = new Vector<>();
        for(Vector<Integer> vec : ArrayToVector(origin))
            result.addAll(vec);

        return result.toArray(new Integer[origin.length]);
    }

    public Vector<Integer> getStage() {
        Vector<Integer> vec = new Vector<>();

        if(currentLength == totalLength-1) {
            vec.add(origin[index]);
            currentLength++;
            return vec;
        }

        leftToRight(vec);
        UpToDown(vec);
        rightToleft(vec);
        DownToUp(vec);

        this.index += this.N + 1;
        this.stage += 2;

        return vec;
    }

    public void rightToleft(Vector<Integer> vec) {
        SomeToSomeImpl(vec, -1);
    }

    public void UpToDown(Vector<Integer> vec) {
        SomeToSomeImpl(vec, this.N);
    }

    public void leftToRight(Vector<Integer> vec) {
        SomeToSomeImpl(vec, 1);
    }

    public void DownToUp(Vector<Integer> vec) {
        SomeToSomeImpl(vec, -this.N);
    }

    public void SomeToSomeImpl(Vector<Integer> vec, int acc) {
        int count = 0;

        while(count < N-stage && currentLength < totalLength) {
            vec.add(origin[index]);
            index += acc;
            count++;
            this.currentLength++;
        }
    }

    Integer[] mine(Integer[] origin) {
        Vector<Vector<Integer>> stageList = ArrayToVector(origin);
        Iterator<Vector<Integer>> stage_iter = stageList.iterator();

        Vector<Integer> stage = stage_iter.next();
        Vector<Integer> rotated = new Vector<>();

        for(int i = this.N-1; i < stage.size(); i++)
            rotated.add(stage.elementAt(i));

        for(int i = 0; i < this.N; i++)
            rotated.add(stage.elementAt(i));



        return new Integer[]{0};
    }

    boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length)
            return false;

        int n = matrix.length;

        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;

            for(int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];

                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }

        return true;

    }

    Integer[] RotateClockWise(Integer[] origin) {
        return mine(origin);
    }
}

