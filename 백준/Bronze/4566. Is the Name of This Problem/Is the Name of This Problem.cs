using System;
using System.Text.RegularExpressions;

class Program
{
    public static void Main()
    {
        var sr = new System.IO.StreamReader(Console.OpenStandardInput());
        var sw = new System.IO.StreamWriter(Console.OpenStandardOutput());
        var rgx = new Regex(@"^""([A-Z][A-Z ]*[A-Z]?)"" \1$");

        while (true)
        {
            var line = sr.ReadLine();

            if (line == "END")
            {
                break;
            }

            if (rgx.IsMatch(line))
            {
                sw.WriteLine("Quine(" + line.Substring(line.LastIndexOf("\"") + 2) + ")");
            }
            else
            {
                sw.WriteLine("not a quine");
            }
        }

        sr.Close();
        sw.Close();
    }
}