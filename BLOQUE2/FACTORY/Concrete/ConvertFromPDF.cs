using Aspose.Words;

class ConvertFromPDF : IFileConverter
{

    private string defautPath = IFileConverter.DEFAULT_PATH;
    private const string EXTENSION = ".pdf";
    private string outPutExtension = IFileConverter.OUTPUT_EXTENSION;



    public void conversion(string fileName)
    {
        string inputFile = fileName + EXTENSION;
        string inputPath = Path.Combine(defautPath,inputFile);
        string outPutFile;
        string outPutPath;


        var pdfDocument = new Document(inputPath);

        for(int i = 0; i < pdfDocument.PageCount;i++)
        {
            var extractedPage = pdfDocument.ExtractPages(i,1);
            outPutFile = fileName + outPutExtension;
            outPutPath = Path.Combine(defautPath,outPutFile);
            extractedPage.Save(outPutPath);
        }
    }
}