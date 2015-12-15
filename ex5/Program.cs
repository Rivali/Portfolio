using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BonusCalculation
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter in a salary and a raise");
            double input = double.Parse(Console.ReadLine());
            double inputRaise = double.Parse(Console.ReadLine());
            if (inputRaise < 1)
            {
                overload(input, inputRaise);
            }
            else if (inputRaise >= 1)
            {
                overload((int)inputRaise, input);
            }
        }

        private static void overload(double salary, double raise)
        {
            double math = salary * raise;
            double result = math + salary;
            Console.WriteLine("The salary was {0} and the raise was {1} the total outcome is {2}", salary.ToString("C"), math.ToString("C"), result.ToString("C"));
        }

        private static void overload(int raise, double salary)
        {

            double result = raise + salary;
            Console.WriteLine("The salary was {0} and the raise was {1} the total outcome is {2}", salary.ToString("C"), raise.ToString("C"), result.ToString("C"));
        }
    }
}