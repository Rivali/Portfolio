using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AdmissionModularized
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your GPA");
            double GPA = (Convert.ToDouble(Console.ReadLine()));
            Console.WriteLine("Enter your test score");
            double AdmissionTest = (Convert.ToDouble(Console.ReadLine()));
            Console.WriteLine(Admission(GPA, AdmissionTest));
        }
        private static string Admission(double GPA, double admissionTest)
        {
            string message = "";
            if ((GPA >= 3.0 && admissionTest >= 60) || (GPA < 3.0 && admissionTest >= 80))
            {
                message = "Accepted";
            }
            else
            {
                message = "Rejected";
            }

            return message;

        }
    }
}
