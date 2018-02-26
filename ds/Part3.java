import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Deque;
import java.util.ArrayDeque;

/* Read the input one line at a time and, if the line numbered i is empty and
   i≥67, then output the line numbered i-67. In this way, the number of lines
	 you output is no more than the number of blank lines in the input. */
	 
public class Part3 {

	/**
	* Your code goes here - see Part0 for an example
	* @param r the reader to read from
	* @param w the writer to write to
	* @throws IOException
	*/
	public static void doIt(BufferedReader r, PrintWriter w) throws IOException {
		Deque<String> deq = new ArrayDeque<String>();
		for (String line = r.readLine(); line != null; line = r.readLine()) {
			deq.add(line);
			if (deq.size() > 67) {
				if (deq.peekLast().isEmpty()) {
					w.println(deq.removeFirst());
				} else {
					deq.removeFirst();
				}
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
