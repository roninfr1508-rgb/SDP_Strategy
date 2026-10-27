package strategy.export;

import java.io.File;

public class FileExporter {
    private CompressionStrategy strategy;

    public FileExporter(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void export(File file, String outputDirectory) {
        if (file == null || !file.exists()) {
            System.err.println("Error: File not found!");
            return;
        }
        strategy.compress(file, outputDirectory);
    }
}
