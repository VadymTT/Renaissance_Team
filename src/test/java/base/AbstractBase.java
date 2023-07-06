package base;

import lombok.SneakyThrows;

abstract public class AbstractBase {

    protected void sleep(long millisecond) {
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
