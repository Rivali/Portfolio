using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Chapter_14
{
    class Program
    {
        static void Main(string[] args)
        {
            string dirName = "";
            string ROOT = "D:\\";
            string ROOT2 = "D:\\Test\\";
            string sentinal = "end";
            string[] listOfFiles;
            string finalDir = "";
            string fileName;
            string finalFile;

            do
            {
                Console.Write("Enter a folder: ");
                dirName = Console.ReadLine();
                finalDir = ROOT + dirName;
                if (Directory.Exists(finalDir))
                {
                    Console.WriteLine("Directory exists, and it contains the following: ");
                    listOfFiles = Directory.GetFiles(finalDir);
                    for (int i = 0; i < listOfFiles.Length; i++)
                    {
                        Console.WriteLine($" {listOfFiles[i]}");
                    }
                    Console.Write("Enter in a file name: ");
                    fileName = Console.ReadLine();
                    finalFile = ROOT2 + fileName;
                    if (File.Exists(finalFile))
                    {
                        Console.WriteLine("File exists");
                        Console.WriteLine("File was created " + File.GetCreationTime(fileName));
                        Console.WriteLine("File was last accessed " + File.GetLastAccessTime(fileName));
                        Console.WriteLine("File was last written to " + File.GetLastWriteTime(fileName));
                    }
                    else
                    {
                        Console.WriteLine("File does not exist");
                    }
                }
                else
                {
                    Console.WriteLine("Directory does not exist");
                }
            }
            while (dirName != sentinal);
        }
    }
}
