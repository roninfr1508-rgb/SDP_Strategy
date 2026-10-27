package strategy.export;

import java.io.File;

public interface CompressionStrategy {
    void compress(File sourceFile, String outputDirectory);
}
