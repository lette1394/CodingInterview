package Practice;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static Practice.MySort.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

class MySortTest {

    @Test
    void selection_sort_should_return_origin() throws Exception {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        selectionSort(arr);

        assertThat(arr).isEqualTo(expected);
    }

    @Test
    void selection_sort_1() throws Exception {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};

        selectionSort(arr);

        assertThat(arr).isEqualTo(expected);
    }

    @Test
    void selection_sort_2() throws Exception {
        int[] arr = {5, 4, 3, 2, 1, 1, 24, 5, 6, 789, 44};
        int[] expected = {1, 1, 2, 3, 4, 5, 5, 6, 24, 44, 789};

        selectionSort(arr);

        assertThat(arr).isEqualTo(expected);
    }


    @Test
    void insert_sort_should_return_origin() throws Exception {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        insertSort(arr);

        assertThat(arr).isEqualTo(expected);
    }

    @Test
    void insert_sort_1() throws Exception {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};

        insertSort(arr);

        assertThat(arr).isEqualTo(expected);
    }

    @Test
    void insert_sort_2() throws Exception {
        int[] arr = {5, 4, 3, 2, 1, 1, 24, 5, 6, 789, 44};
        int[] expected = {1, 1, 2, 3, 4, 5, 5, 6, 24, 44, 789};

        insertSort(arr);

        assertThat(arr).isEqualTo(expected);
    }

    @Test
    void quick_sort_1() throws Exception {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};

        quickSort(arr);

        assertThat(arr).isEqualTo(expected);
    }

    @Test
    void quick_sort_2() throws Exception {
        int[] arr = {5, 4, 3, 2, 1, 1, 24, 5, 6, 789, 44};
        int[] expected = {1, 1, 2, 3, 4, 5, 5, 6, 24, 44, 789};

        quickSort(arr);
        assertThat(arr).isEqualTo(expected);
    }

    @Test
    void handles_empty_arr() {
        int[] arr1 = {};
        int[] arr2 = {};
        int[] arr3 = {};
        int[] expected = {};

        selectionSort(arr1);
        insertSort(arr2);
        quickSort(arr3);

        assertThat(arr1).isEqualTo(expected);
        assertThat(arr2).isEqualTo(expected);
        assertThat(arr3).isEqualTo(expected);
    }

    @Test
    void should_run_in_1_second() {
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
            System.out.println(iterate(100000000));
        });

        assertTimeoutPreemptively(Duration.ofMillis(1000), () -> {
            System.out.println(iterate(1000000000L));
        });
    }
}
