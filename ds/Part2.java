import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;

/* Imagine each input line is numbered, starting from 0. Read the whole file and
   then output the lines numbered 0, 3, 6,... followed by the lines numbered 1,
	 4, 7,.... and finally followed by the lines numbered 2, 5, 8,.... */
	 
public class Part2 {

	/**
	 * Your code goes here - see Part0 for an example
	 * @param r the reader to read from
	 * @param w the writer to write to
	 * @throws IOException
	 */
	public static void doIt(BufferedReader r, PrintWriter w) throws IOException {
		List<String> arr1 = new ArrayList<String>();
		List<String> arr2 = new ArrayList<String>();
		List<String> arr3 = new ArrayList<String>();

    int line_index = 0;
		for (String line = r.readLine(); line != null; line = r.readLine()) {
			if (line_index % 3 == 0) {
				arr1.add(line);
			} else if (line_index % 3 == 1) {
				arr2.add(line);
			} else {
				arr2.add(line);
			}
			++line_index;
		}
		for (String s : arr1) {
			w.println(s);
		}
    for (String s : arr2) {
	    w.println(s);
    }
    for (String s : arr3) {
	    w.println(s);
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
