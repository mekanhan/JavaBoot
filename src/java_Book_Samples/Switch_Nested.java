package java_Book_Samples;

public class Switch_Nested {
    public static void main(String[] args){
        int count=1;
        int target=0;
        switch(count) {
            case 1:
                switch (target) { // nested switch
                    case 0:
                        System.out.println("target is zero");
                        break;
                }
        }
    }
}