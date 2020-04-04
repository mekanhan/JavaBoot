package Class_March21_Constructor;

public class ArrayOps {
    public int IndexOfIntArray (int[] array , int number){
        for (int i = 0; i < array.length ; i++) {
            if (array[i]== number)
                return i;
        }
        return -1;
    }

    public int IndexOfStringArray (String[] array , String word){
        for (int i = 0; i < array.length ; i++) {
            if (array[i].equals(word) )
                return i;
        }

        return -1;
    }
}
