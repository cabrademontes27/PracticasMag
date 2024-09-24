class DocxFactory:IFileFactory
{

    IFileConverter initializeConverter()
    {
        return new ConvertFromPDF();
    }

    public string GetExtension()
    {
        return ConvertFromDocs.EXTENSION;
    }


}