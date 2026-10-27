package strategy.export;

import java.io.File;

public class RarCompressionStrategy extends BaseCompressionStrategy {
    @Override
    public void compress(File sourceFile, String outputDirectory) {
        String name = getFileNameWithoutExtension(sourceFile);
        System.out.println("[RAR] compression " + sourceFile.getName() + " -> " + outputDirectory + "/" + name + ".rar");
    }
}
