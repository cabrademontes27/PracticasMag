interface IFileConverter
{
    static readonly string DEFAULT_PATH = Environment.GetFolderPath(Environment.SpecialFolder.MyDocuments);

    const string OUTPUT_EXTENSION = ".jpg";

    void conversion(string name);
}