using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LetterDemo
{
    class Letter
    {
        public string RecipientName { get; set; }
        public string DateMailed { get; set; }

        public Letter() { }


        public Letter(string recipientName, string dateMailed)
        {
            RecipientName = recipientName;
            DateMailed = dateMailed;
        }
        public override string ToString()
        {
            return "This is the Letter class " + RecipientName + " " + DateMailed;
        }
    }
}
