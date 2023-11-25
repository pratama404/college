import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
public class WriteToPDFExample {
public static void main(String[] args) {
String filePath = "output.pdf";
try (PDDocument document = new PDDocument()) {
PDPage page = new PDPage();
document.addPage(page);
try (PDPageContentStream contentStream = new PDPageContentStream(document,
page)) {
contentStream.beginText();
contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
contentStream.newLineAtOffset(100, 700);
contentStream.showText("Hello, World!");
contentStream.endText();
}
document.save(filePath);
System.out.println("File PDF berhasil ditulis.");
} catch (IOException e) {
e.printStackTrace();
}
}
}