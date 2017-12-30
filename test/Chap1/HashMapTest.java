package Chap1;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class HashMapTest {
    HashMap<Integer, Student> buildStudent;
    StudentMap std = new StudentMap();

    @Before
    public void StudentInit() {
        HashMap<Integer, Student> map = new HashMap<>();
        Vector<Student> list = new Vector<>();

        for(int i = 0; i < 4; i++)
            list.add(new Student(i, "name" + Integer.toString(i)));

        Student[] students = list.toArray(new Student[list.size()]);

        StudentMap studentMap = new StudentMap();
        this.buildStudent = studentMap.buildMap(students);
    }

    @Test
    public void StudentTest() {

        assertEquals(buildStudent.get(0).getName(), "name0");
        assertEquals(buildStudent.get(1).getName(), "name1");
        assertEquals(buildStudent.get(2).getName(), "name2");
    }

    @Test
    public void merge() {
        String[] param1 = new String[]{"aaa", "bbb"};
        String[] param2 = new String[]{"123", "456"};
        ArrayList<String> result = new ArrayList<>();
        result.add("aaa");
        result.add("bbb");
        result.add("123");
        result.add("456");

        assertArrayEquals(std.merge(param1, param2).toArray(), result.toArray());
        assertArrayEquals(std.merge2(param1, param2), result.toArray(new String[result.size()]));
    }

    @Test
    public void joinWords() {
        String str1 = "i'm";
        String str2 = "so happy";
        String str3 = "for now.";
        String[] str = new String[]{str1, str2, str3};

        assertEquals("i'm, so happy, for now., ", std.joinWords(str));
        assertEquals("i'm so happy for now.", std.joinWords2(str));

    }


}
