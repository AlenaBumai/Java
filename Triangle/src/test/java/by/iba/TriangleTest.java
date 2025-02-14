package by.iba;

import junit.framework.TestCase;
import junit.framework.TestResult;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Stream;

import static by.iba.Triangle.getNum;
import static org.junit.Assert.assertEquals;

public class TriangleTest {


    // Метод, который будет предоставлять параметры для теста
    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of("5\n5\n5\n", "allequal"),
                Arguments.of("5\n5\n3\n", "twoequal"),
                Arguments.of("5\n4\n3\n", "different"),
                Arguments.of("1\n1\n0\n", "wrong"),
                Arguments.of("1\n1\n-1\n", "wrong"),
                Arguments.of("1\n1\nF\n", "wrong"),
                Arguments.of("1\n1\n*\n", "wrong")
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testTrangle(String input, String expected) {

        Triangle triangle = new Triangle();

        String actual = triangle.defineTriangle();

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int[] nums = getNum();

        Stream<String> expectedValues = provideTestCases().map(arguments -> arguments.get(1));

        assertEquals(expected, actual);
    }




    //************************************************************
//    @Test
//        public void TestAllEqual() {
//
//            String input = "5\n5\n5\n";
//            InputStream in = new ByteArrayInputStream(input.getBytes());
//            System.setIn(in);
//            int[] result = getNum();
//            assertEquals("allequal", "allequal");//expected actual
//        }
//    @Test
//        public void TestTwoEqual () {
//
//            String input = "5\n5\n3\n";
//            InputStream in = new ByteArrayInputStream(input.getBytes());
//            System.setIn(in);
//            int[] result = getNum();
//            assertEquals("twoequal", "twoequal");//expected actual
//        }
//    @Test
//        public void TestDifferent () {
//
//            String input = "5\n4\n3\n";
//            InputStream in = new ByteArrayInputStream(input.getBytes());
//            System.setIn(in);
//            int[] result = getNum();
//            assertEquals("different", "different");//expected actual
//        }
//    @Test
//        public void TestWrong () {
//
//            String input = "0\n0\n0\n";
//            InputStream in = new ByteArrayInputStream(input.getBytes());
//            System.setIn(in);
//            int[] result = getNum();
//            assertEquals("wrong", "wrong");//expected actual
//        }
    }

