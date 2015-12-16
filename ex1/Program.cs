using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RockPaperScissors
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("CHOOSE YOUR WEAPON! (R)OCK, (P)APER, or (S)CISSORS");
            string choice = Console.ReadLine();

            Random ranNumberGenerator = new Random();
            int randomNumber;
            randomNumber = ranNumberGenerator.Next(1, 4);

            if (choice == "r" || choice == "R" || choice == "rock" || choice == "Rock" || choice == "ROCK")
            {
                if (randomNumber == 1)
                {
                    Console.WriteLine("The computer chose SCISSORS");
                    Console.WriteLine("YOU WIN!");
                }
                else if (randomNumber == 2)
                {
                    Console.WriteLine("The computer chose ROCK");
                    Console.WriteLine("TIE!");
                }
                else if (randomNumber == 3)
                {
                    Console.WriteLine("The computer chose PAPER");
                    Console.WriteLine("YOU LOSE!");
                }
            }
            else if (choice == "p" || choice == "P" || choice == "paper" || choice == "Paper" || choice == "PAPER")
            {
                if (randomNumber == 1)
                {
                    Console.WriteLine("The computer chose SCISSORS");
                    Console.WriteLine("YOU LOSE!");
                }
                else if (randomNumber == 2)
                {
                    Console.WriteLine("The computer chose ROCK");
                    Console.WriteLine("YOU WIN!");
                }
                else if (randomNumber == 3)
                {
                    Console.WriteLine("The computer chose PAPER");
                    Console.WriteLine("TIE!");
                }
            }
            else if (choice == "s" || choice == "S" || choice == "scissors" || choice == "Scissors" || choice == "SCISSORS")
            {
                if (randomNumber == 1)
                {
                    Console.WriteLine("The computer chose SCISSORS");
                    Console.WriteLine("TIE!");
                }
                else if (randomNumber == 2)
                {
                    Console.WriteLine("The computer chose ROCK");
                    Console.WriteLine("YOU LOSE!");
                }
                else if (randomNumber == 3)
                {
                    Console.WriteLine("The computer chose PAPER");
                    Console.WriteLine("YOU WIN!");
                }
            }

        }
    }
}
