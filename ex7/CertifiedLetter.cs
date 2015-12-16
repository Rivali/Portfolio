using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LetterDemo
{
    class CertifiedLetter : Letter
    {
        public int TrackingNumber;
        new public string RecipientName;
        new public string DateMailed;

        public CertifiedLetter(string recipientName, string dateMailed, int trackingNumber)
        {
            TrackingNumber = trackingNumber;
            RecipientName = recipientName;
            DateMailed = dateMailed;
        }
        public override string ToString()
        {
            return "This is the CertifiedLetter class " + RecipientName + " " + DateMailed + " " + TrackingNumber;
        }
    }
}
