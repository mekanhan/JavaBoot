package class_March8;

public class MovieDecision {
    public static void main(String[] args) {
        movieDes(8,80,123);
        decideMovie(2.7,2000,134.23);
    }
    public static void movieDes(int imdb, int total, int box){
        int a=imdb*total/box;
        if (a>10){
            System.out.println("watch movie");
        }
        else {
            System.out.println("dont watch the movie");
        }
    }
    public static int decideMovie (double imdb, int totalVotes, double boxOffice){
        int result=0;
        double a;
        a=imdb*totalVotes/boxOffice;
        if (a>10){
            System.out.println("watch movie");
        }
        else {
            System.out.println("dont watch the movie");
        }
        return result;
    }
}
