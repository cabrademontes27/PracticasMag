interface IFileFactory
{
    IFileConverter initializeConverter();
    string GetExtension();
}