using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LetterDemo
{
    class Program
    {
        static void Main(string[] args)
        {
            Letter l1 = new Letter("Ron", "July 6");
            CertifiedLetter cl1 = new CertifiedLetter("Jim", "Febuary 12", 1234);
            Console.WriteLine(l1.ToString());
            Console.WriteLine(cl1.ToString());
        }
    }
}
