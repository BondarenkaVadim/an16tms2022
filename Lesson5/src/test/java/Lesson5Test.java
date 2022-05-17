import org.junit.jupiter.api.Assertions;

class Lesson5Test {

    @org.junit.jupiter.api.Test
    void sum() {
        Assertions.assertEquals(26, Lesson5.sum(12, 14));
        Assertions.assertEquals(26, Lesson5.sum(0, 14));
        Assertions.assertEquals(26, Lesson5.sum(13, 14));


    }
}