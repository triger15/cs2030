class FPatterns {
  public static void main(String[] args) {
    SummaryStrategy st = (text, len) -> TextShorterner.shorten(text, len);
    createSnippet(st, "ancacaaaa");
    createSnippet(TextShorterner::shorten); // method referencing since args and return type fit

  }

  static String createSnippet(SummaryStrategy strat, String str) {
    return strat.summarize(str, 10);
  }
}

@FunctionalInterface
interface SummaryStrategy {
  String summarize(String text, int lengthLimit);
}

// Q2. Because functor laws state that the result of composition of two 
// functions g.h is same as calling f with h then with g.