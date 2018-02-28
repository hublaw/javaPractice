import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


/* Read the entire input one line at a time and then output the largest line
(according to the usual sorted order on Strings) followed by the largest line
that occurs after the last occurrence of the largest line, followed by the
largest line that occurs after that one, and so on. (Note that you will
always output the last input line.)
e.g. if your lines contain 4, 2, 7, 9, 0, 8, 1, 6, 3 then your output should
be the lines containing 9, 8, 6, 3 since 9 is the largest value, 8 is the
largest among {0,8,1,6,3}, 6 is the largest among {1,6,3} and three is the
largest and only value in {3}. */


public class Part7 {

	/**
	* Your code goes here - see Part0 for an example
	* @param r the reader to read from
	* @param w the writer to write to
	* @throws IOException
	*/
	public static void doIt(BufferedReader r, PrintWriter w) throws IOException {
		List<String> list = new ArrayList<String>();

		for (String line = r.readLine(); line != null; line = r.readLine()) {
			list.add(line);
		}

		while (list.size() > 0) {
			String max = "";
			for (String s : list) {
				max = (s.compareTo(max) > 0) ? s : max;
			}
			list = list.subList(list.lastIndexOf(max) + 1, list.size());
			System.out.println(max);
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
