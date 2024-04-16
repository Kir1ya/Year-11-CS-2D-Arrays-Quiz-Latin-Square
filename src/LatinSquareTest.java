import static org.junit.jupiter.api.Assertions.*;

class LatinSquareTest {

    private int[][] array2d;
    private int[][] array2d2;
    private int[][] array2d3;
    private int[][] array2d4;
    private int[][] array2d5;
    private int[][] array2d6;
    private int[][] array2d7;
    private int[][] array2d8;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        array2d = new int[][] {
                {1,2,3},
                {3,1,2},
                {2,3,1}
        };

        array2d2 = new int[][] {
                {1,2,3},
                {2,3,1},
                {3,1,2}
        };

        array2d3 = new int[][] {
                {1,2,3,4},
                {2,1,4,3},
                {3,4,1,2},
                {4,3,2,1}
        };

        array2d4 = new int[][] {
                {1,2,3,4,5},
                {2,4,1,5,3},
                {3,5,4,2,1},
                {4,1,5,3,2},
                {5,3,2,1,4}
        };

        array2d5 = new int[][] {
                {1,3,2},
                {2,3,1},
                {2,1,3}
        };

        array2d6 = new int[][] {
                {2,3,1},
                {1,3,2},
                {2,3,1}
        };

        array2d7 = new int[][] {
                {1,2,3,4},
                {2,1,4,1},
                {3,4,2,3},
                {4,3,1,2}
        };

        array2d8 = new int[][] {
                {1,2,3,4,5},
                {2,4,1,5,3},
                {3,5,4,2,1},
                {4,1,5,4,2},
                {5,3,2,1,3}
        };

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        array2d = null;
        array2d2 = null;
        array2d3 = null;
        array2d4 = null;
        array2d5 = null;
        array2d6 = null;
        array2d7 = null;
        array2d8 = null;
    }

    @org.junit.jupiter.api.Test
    void targetCheckSum1() {
        assertTrue(LatinSquare.targetCheckSum1(array2d.length) == 6);
        assertTrue(LatinSquare.targetCheckSum1(array2d2.length) == 6);
        assertTrue(LatinSquare.targetCheckSum1(array2d3.length) == 10);
        assertTrue(LatinSquare.targetCheckSum1(array2d4.length) == 15);
        assertTrue(LatinSquare.targetCheckSum1(array2d5.length) == 6);
        assertTrue(LatinSquare.targetCheckSum1(array2d6.length) == 6);
        assertTrue(LatinSquare.targetCheckSum1(array2d7.length) == 10);
        assertTrue(LatinSquare.targetCheckSum1(array2d8.length) == 15);
    }
    @org.junit.jupiter.api.Test
    void targetCheckSum2() {
        assertTrue(LatinSquare.targetCheckSum2(array2d.length) == 6);
        assertTrue(LatinSquare.targetCheckSum2(array2d2.length) == 6);
        assertTrue(LatinSquare.targetCheckSum2(array2d3.length) == 24);
        assertTrue(LatinSquare.targetCheckSum2(array2d4.length) == 120);
        assertTrue(LatinSquare.targetCheckSum2(array2d5.length) == 6);
        assertTrue(LatinSquare.targetCheckSum2(array2d6.length) == 6);
        assertTrue(LatinSquare.targetCheckSum2(array2d7.length) == 24);
        assertTrue(LatinSquare.targetCheckSum2(array2d8.length) == 120);
    }

    @org.junit.jupiter.api.Test
    void isLatinRows() {
        assertTrue(LatinSquare.isLatinRows(array2d, LatinSquare.targetCheckSum1(array2d.length),
                LatinSquare.targetCheckSum2(array2d.length)));
        assertTrue(LatinSquare.isLatinRows(array2d2, LatinSquare.targetCheckSum1(array2d2.length),
                LatinSquare.targetCheckSum2(array2d2.length)) == true);
        assertTrue(LatinSquare.isLatinRows(array2d3, LatinSquare.targetCheckSum1(array2d3.length),
                LatinSquare.targetCheckSum2(array2d3.length)) == true);
        assertTrue(LatinSquare.isLatinRows(array2d4, LatinSquare.targetCheckSum1(array2d4.length),
                LatinSquare.targetCheckSum2(array2d4.length)) == true);
        assertTrue(LatinSquare.isLatinRows(array2d5, LatinSquare.targetCheckSum1(array2d5.length),
                LatinSquare.targetCheckSum2(array2d5.length)) == true);
        assertTrue(LatinSquare.isLatinRows(array2d6, LatinSquare.targetCheckSum1(array2d6.length),
                LatinSquare.targetCheckSum2(array2d6.length)) == true);
        assertTrue(LatinSquare.isLatinRows(array2d7, LatinSquare.targetCheckSum1(array2d7.length),
                LatinSquare.targetCheckSum2(array2d7.length)) == false);
        assertTrue(LatinSquare.isLatinRows(array2d8, LatinSquare.targetCheckSum1(array2d8.length),
                LatinSquare.targetCheckSum2(array2d8.length)) == false);
    }

    @org.junit.jupiter.api.Test
    void isLatinColumns() {
        assertTrue(LatinSquare.isLatinColumns(array2d, LatinSquare.targetCheckSum1(array2d.length),
                LatinSquare.targetCheckSum2(array2d.length)) == true);
        assertTrue(LatinSquare.isLatinColumns(array2d2, LatinSquare.targetCheckSum1(array2d2.length),
                LatinSquare.targetCheckSum2(array2d2.length)) == true);
        assertTrue(LatinSquare.isLatinColumns(array2d3, LatinSquare.targetCheckSum1(array2d3.length),
                LatinSquare.targetCheckSum2(array2d3.length)) == true);
        assertTrue(LatinSquare.isLatinColumns(array2d4, LatinSquare.targetCheckSum1(array2d4.length),
                LatinSquare.targetCheckSum2(array2d4.length)) == true);
        assertTrue(LatinSquare.isLatinColumns(array2d5, LatinSquare.targetCheckSum1(array2d5.length),
                LatinSquare.targetCheckSum2(array2d5.length)) == false);
        assertTrue(LatinSquare.isLatinColumns(array2d6, LatinSquare.targetCheckSum1(array2d6.length),
                LatinSquare.targetCheckSum2(array2d6.length)) == false);
        assertTrue(LatinSquare.isLatinColumns(array2d7, LatinSquare.targetCheckSum1(array2d7.length),
                LatinSquare.targetCheckSum2(array2d7.length)) == true);
        assertTrue(LatinSquare.isLatinColumns(array2d8, LatinSquare.targetCheckSum1(array2d8.length),
                LatinSquare.targetCheckSum2(array2d8.length)) == false);
    }

    @org.junit.jupiter.api.Test
    void isLatinSquare() {
        assertTrue(LatinSquare.isLatinSquare(array2d) == true);
        assertTrue(LatinSquare.isLatinSquare(array2d2) == true);
        assertTrue(LatinSquare.isLatinSquare(array2d3) == true);
        assertTrue(LatinSquare.isLatinSquare(array2d4) == true);
        assertTrue(LatinSquare.isLatinSquare(array2d5) == false);
        assertTrue(LatinSquare.isLatinSquare(array2d6) == false);
        assertTrue(LatinSquare.isLatinSquare(array2d7) == false);
        assertTrue(LatinSquare.isLatinSquare(array2d8) == false);
    }

}