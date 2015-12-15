using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestScores
{
    class Program
    {
        static void Main(string[] args)
        {
            double input = 0;
            double total = 0;
            double average = 0;
            double nums = 0;

            Console.WriteLine("Enter in your test scores for the average");
            Console.WriteLine("Enter 111 when you're finished");
            while (input != 111)
            {
                input = Convert.ToDouble(Console.ReadLine());
                if (input <= 100 && input >= 0)
                {
                    Console.WriteLine("OK");
                    total += input;
                    ++nums;
                    average = total / nums;
                }
                else
                {
                    Console.WriteLine("You took " + nums + " tests");
                    Console.WriteLine("Your average is " + average);
                }
            }
        }
    }
}
