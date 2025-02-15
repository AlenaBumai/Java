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
                //**положительные целын числа
                Arguments.of("1\n1\n1\n", "allequal"),// mimnimum
                Arguments.of("100\n100\n100\n", "allequal"),
                Arguments.of("4294967296\n4294967296\n4294967296\n", "allequal"),  //maxnimum int 4294967296

                Arguments.of("100\n100\n100\n", "allequal"),
                Arguments.of("100\n100\n200\n", "twoequal"),
                Arguments.of("100\n200\n300\n", "different"),
          //****отрицательные тесты - ненадлежащие числовые значения

                Arguments.of("1\n1\n0\n", "wrong"),
                Arguments.of("1\n1\n-1\n", "wrong"),
                Arguments.of("1\n1\n4294967297\n", "wrong"),//maxnimum int+1
                Arguments.of("1\n1\n1.11\n", "wrong"),

//**********Буквы, символы, пробел, пусто
                Arguments.of("1\n1\nF\n", "wrong"),
                Arguments.of("1\n1\n*\n", "wrong"),
                Arguments.of(" \n \n \n", "wrong")

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

        org.junit.jupiter.api.Assertions.assertEquals((Object) expected, (Object) actual);

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

