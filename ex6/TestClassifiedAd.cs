using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestClassifiedAd
{
    class TestClassifiedAd
    {
        static void Main(string[] args)
        {
            

            Console.WriteLine("Enter in your ad name");
            string doesntMatter = Console.ReadLine();
            Console.WriteLine("Enter in your message");
            string input = Console.ReadLine();

            ClassifiedAd ad1 = new ClassifiedAd(input);

            Console.WriteLine("There are {0} words in your ad and that costs {1}", ad1.numberOfWords, ad1.price.ToString("c"));
        }
    }
}
