/** Wtf */
import java.util.*;

public class Main implements Function<String, Integer>, Predicate<T>  {
    public static void main(String[] args) {

    }    

    // Q2
    Predicate<T> and(Predicate<T> p1, Predicate<T> p2) {
        return (T x) -> {
            return p1.test(x) && p2.test(x);
        };
    }

    // Q3
    Function<String,Integer> indexOf = new Function<String, Integer>() {
       @Override
       public Integer apply(String s) {
           return s.indexOf(' ');
       } 
    };






}



/** Exercise
 * Q1: a: no. throws exceptions. b: no. prints to console. c: no. output is not deterministic. d: yes.
 *
 *
 *
 */
