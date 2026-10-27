package strategy.export;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        // Создаем временный тестовый файл
        File file = new File("report.pdf");
        file.createNewFile();
        file.deleteOnExit();

        String destination = "/downloads";

        FileExporter exporter = new FileExporter(new ZipCompressionStrategy());
        exporter.export(file, destination);

        exporter.setStrategy(new RarCompressionStrategy());
        exporter.export(file, destination);

        exporter.setStrategy(new SevenZipCompressionStrategy());
        exporter.export(file, destination);
    }
}
