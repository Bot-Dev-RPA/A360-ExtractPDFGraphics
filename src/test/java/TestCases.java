import com.automationanywhere.botcommand.*;
import com.automationanywhere.botcommand.data.Value;
import com.automationanywhere.botcommand.data.impl.ListValue;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

public class TestCases {
    @Test
    public void testPDFtoImagesOnly() {
        String inputFile = "E:\\ScReAm\\Downloads\\Cheques( CH).pdf";
        String outputPath = "src/main/resources/test_files/Output/PDFtoImage";

        ExtractPDFImages pdFtoImage = new ExtractPDFImages();

        Value<List<Value>> outputFile = pdFtoImage.action(inputFile, "TIFF", "grayscale", outputPath);
        Assert.assertEquals(outputFile.toString(), "src/main/resources/test_files/Output/PDFtoImage/Cheques( CH)-00001.jpg");
    }
}
