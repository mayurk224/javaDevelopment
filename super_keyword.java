public class super_keyword {
    // Super Keyword
    // a constructor for a child class always stats with an invocation of
    // one of the constructors in the parent class. If the parent class
    // has several constructors, then the one that is invoked is
    // determined by matching argument lists.

    // For ex: we should define a second constructor for a Movie that
    // does not include an argument for length

    // it starts out by invoking the parent constructor that does not
    // have an argument for length:

    // Example:
    // Video.java
    // public class Video{
    // String title;
    // int length;
    // boolean avail;
    // public Video (String ttl, int len){ // constructor without a third var
    // title = ttl; length = len;
    //                                    }
    //                     }

    // Movie.java
    // public class Movie extends Video{
    // String director, rating;
    // First Step: first include the super constructor parameter, then include the child class parameter
    // public Movie (String ttl, int len, String dir, String rat){
    // super(ttl, len); // then mention super constructor parameter with super keyword
    // director = dir; // then assign the class parameter
    // rating = rat;
    // }
    // }
}
