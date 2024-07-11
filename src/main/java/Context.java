import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Context {
    private final Map<Class<?>, Supplier<?>> beanMap = new HashMap<>();

    public <T> void registerBean(Class<T> type, Supplier<T> supplier) {
        beanMap.put(type, supplier);
    }

    public <T> T getBean(Class<T> type) {
        Supplier<?> supplier = beanMap.get(type);
        if (supplier != null) {
            return type.cast(supplier.get());
        }
        throw new RuntimeException("No registered supplier for " + type.getName());
    }
}