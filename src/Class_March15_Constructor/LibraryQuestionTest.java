package Class_March15_Constructor;

public class LibraryQuestionTest {
    public static void main(String[] args) {
        LibraryQuestion myTest = new LibraryQuestion
                ("How to Nail Java", "Johnny Dep",
                        31223234, 300, 'Y', 3 / 17 / 2020, 3 / 18 / 2020);
                myTest.available();
                myTest.returning();

    }

}
