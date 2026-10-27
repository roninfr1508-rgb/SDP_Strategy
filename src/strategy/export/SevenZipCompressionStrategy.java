package strategy.export;

import java.io.File;

public class SevenZipCompressionStrategy extends BaseCompressionStrategy {
    @Override
    public void compress(File sourceFile, String outputDirectory) {
        String name = getFileNameWithoutExtension(sourceFile);
        System.out.println("[7Z] compression " + sourceFile.getName() + " -> " + outputDirectory + "/" + name + ".7z");
    }
}