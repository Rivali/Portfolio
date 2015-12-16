using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestClassifiedAd
{
    class ClassifiedAd
    {
        public string category { get; set; }
        public int numberOfWords { get; set; }
        public double price { get; }

        public ClassifiedAd(string input)
        {
            numberOfWords = numOfWords(input);
            price = numberOfWords * .09;
        }
        public int numOfWords(string input)
        {
            int um = 0;
            for (int i = 0; i < input.Length; i++)
            {
                if (input.Substring(i, 1) == " ")
                    um++;
            }
            um++;
            return um;
        }
    }
}
