import java.util.*;

public class Main {
    // 1i
    D d = CompletableFuture.completedFuture(a)
            .thenApplyAsync(a -> f(a))
            .thenApplyAsync(b -> g(b))
            .thenApplyAsync(c -> h(c))
            .join();
    
    // 1ii
    CompletableFuture.supplyAsync(() -> f())
                    .thenApplyAsync(b -> g(b))
                    .thenAcceptAsync(c -> h(c))
                    .join();

    // 1iii
    CompletableFuture<B> bFuture = CompletableFuture.completedFuture(a)
                                    .thenApplyAsync(a -> f(a));
    CompletableFuture<C> cFuture = bFuture.thenApplyAsync(b -> g(b));
    CompletableFuture<D> dFuture = bFuture.thenApplyAsync(b -> h(b));
    E e = cFuture.thenCombineAsync(dFuture, (c, d) -> i(c,d))
                            .join();   
}
