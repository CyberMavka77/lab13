package visitor;

import java.util.Map;

public interface Visitor<T> {
    void onGroupStart(Task<T> task);
    void onGroupEnd(Task<T> task);
    void onSignature(Task<T> task);
}
