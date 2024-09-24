class PDFFactory : IFileFactory
{
    public IFileConverter initiliczeConvert()
    {
        return new ConvertFromPDF();
    }

    
}