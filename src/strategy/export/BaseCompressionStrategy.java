package strategy.export;

import java.io.File;

public abstract class BaseCompressionStrategy implements CompressionStrategy {
    protected String getFileNameWithoutExtension(File file) {
        String name = file.getName();
        int lastDotIndex = name.lastIndexOf('.');
        return (lastDotIndex == -1) ? name : name.substring(0, lastDotIndex);
    }
}
