import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

/* Read the whole input one line at a time and output each line if it is not a
prefix of some previous line. (One string s is a prefix of another string t if
t can be written as t=sx for some string x. For example, s='help' is a prefix of
t='helpful' because 'helpful' = 'help' + 'ful'). Take care not to waste memory,
so that your code stores the fewest number of lines possible.
Hint: Consider what happens when you compare 'help' and 'helpful' using the
usual ordering on Strings. */


public class Part8 {

	/**
	* Your code goes here - see Part0 for an example
	* @param r the reader to read from
	* @param w the writer to write to
	* @throws IOException
	*/
	public static void doIt(BufferedReader r, PrintWriter w) throws IOException {
		Set<String> set = new HashSet<String>();
		Boolean addLine;

		for (String line = r.readLine(); line != null; line = r.readLine()) {
			addLine = true;
			for (String s : set) {
				if (s.matches(line + "(.*)")) {
					addLine = false;
					break;
				}
			}
			if (addLine == true) {
				System.out.println(line);
				set.add(line);
			}
		}
	}

	/**
	* The driver.  Open a BufferedReader and a PrintWriter, either from System.in
	* and System.out or from filenames specified on the command line, then call doIt.
	* @param args
	*/
	public static void main(String[] args) {
		try {
			BufferedReader r;
			PrintWriter w;
			if (args.length == 0) {
				r = new BufferedReader(new InputStreamReader(System.in));
				w = new PrintWriter(System.out);
			} else if (args.length == 1) {
				r = new BufferedReader(new FileReader(args[0]));
				w = new PrintWriter(System.out);
			} else {
				r = new BufferedReader(new FileReader(args[0]));
				w = new PrintWriter(new FileWriter(args[1]));
			}
			long start = System.nanoTime();
			doIt(r, w);
			w.flush();
			long stop = System.nanoTime();
			System.out.println("Execution time: " + 10e-9 * (stop-start));
		} catch (IOException e) {
			System.err.println(e);
			System.exit(-1);
		}
	}
}
