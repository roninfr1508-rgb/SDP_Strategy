package strategy.export;

import java.io.File;

public class ZipCompressionStrategy extends BaseCompressionStrategy {
    @Override
    public void compress(File sourceFile, String outputDirectory) {
        String name = getFileNameWithoutExtension(sourceFile);
        System.out.println("[ZIP] compression " + sourceFile.getName() + " -> " + outputDirectory + "/" + name + ".zip");
    }
}
