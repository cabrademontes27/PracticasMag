using Spire.Doc;
using SixLabors.ImageSharp;
using SixLabors.ImageSharp.PixelFormats;
class ConvertFromDocs : IFileConverter
{
    private string defautPath = IFileConverter.DEFAULT_PATH;
    private string outPutExtension = IFileConverter.OUTPUT_EXTENSION;
    public const string EXTENSION =".docx";

    public void conversion(string fileName)
    {
        string inputFile = fileName + EXTENSION;
        string inputPath = Path.Combine(defautPath,inputFile);
        string outPutFile;
        string outPutPath;

        var docxDocument = new Document();
        docxDocument.LoadFromFile(inputFile);

        for(int i = 0; i < docxDocument.PageCount; i++)
        {
            using(System.Drawing.Image pageImagen = docxDocument.SaveToImages(i,Spire.Doc.Documents.ImageType.Bitmap))
            {
                using (MemoryStream ms = new MemoryStream())
                {
                    pageImagen.Save(ms,System.Drawing.Imaging.ImageFormat.Bmp);
                    ms.Seek(0,SeekOrigin.Begin);

                    using(var Image = SixLabors.ImageSharp.Image.Load<Rgba32>(ms))
                    {
                        outPutFile = fileName + outPutExtension;
                        outPutPath = Path.Combine(defautPath,outPutFile);
                        Image.Save(outPutPath);
                    }
                }
            }
        }
    }
}