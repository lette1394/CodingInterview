package Chap16;

public class Problem16 {
    int[] input;

    public int[] getIndex(int[] input) {
        this.input = input;

        return solve();

    }

    private int[] solve() {
        return findAnswerIndexes(findIncorrectValues(findSubArray()));
    }

    private int[] findAnswerIndexes(Value value) {
        if (value.isError()) {
            return new int[] { -1, -1 };
        } else {
            return new int[] {
                    findAnswerLeftIndex(value.left),
                    findAnswerRightIndex(value.right)
            };
        }
    }

    private int findAnswerRightIndex(int right) {
        for (int i = input.length-1; i >= 0; i--) {
            if (right > input[i]) {
                return i;
            }
        }

        return -1;
    }

    private int findAnswerLeftIndex(int left) {
        for (int i = 0; i < input.length; i++) {
            if (left < input[i]) {
                return i;
            }
        }
        return -1;
    }

    private Value findIncorrectValues(Index index) {
        if (index.isSorted()) {
            return new Value(true);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = index.left; i <= index.right; i++) {
            min = Math.min(input[i], min);
            max = Math.max(input[i], max);
        }

        return new Value(min, max);
    }

    private Index findSubArray() {
        Index result = new Index(findLeftIndex(), findRightIndex());

        if (result.left == -1 || result.right == -1) {
            result.isSorted = true;
        }

        return result;
    }

    private int findLeftIndex() {
        for (int i = 0; i < input.length-1; i++) {
            if (input[i] > input[i+1]) {
                return i;
            }
        }
        return -1;
    }

    private int findRightIndex() {
        for (int i = input.length-1; i > 0; i--) {
            if (input[i] < input[i-1]) {
                return i;
            }
        }
        return -1;
    }


}

class Index {
    int left, right;
    boolean isSorted = false;

    Index(int left, int right) {
        this.left = left;
        this.right = right;
    }

    boolean isSorted() {
        return isSorted;
    }
}

class Value {
    int left, right;
    boolean error = false;

    Value(int left, int right) {
        this.left = left;
        this.right = right;
    }

    Value(boolean error) {
        this.error = error;
    }

    public boolean isError() {
        return error;
    }
}