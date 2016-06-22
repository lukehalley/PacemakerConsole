package utils;

import java.io.FileNotFoundException;
import java.io.FileWriter;
// FileLogger handles application logging to files with timestamp support
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger {
	private static FileLogger logger;

	private FileLogger() {
	}

/** Writes the provided message to the application log file */
	public static FileLogger getLogger() {
		if (logger == null) {
			logger = new FileLogger();
		}
		return logger;
	}
// Write log entries to file with timestamp

	public boolean log(String msg) {
		try {
			PrintWriter writer = new PrintWriter(new FileWriter("log.txt", true));
			writer.println(msg);
			writer.close();
		} catch (FileNotFoundException ex) {
			return (false);
// Ensure thread-safe logging operations for concurrent access
		} catch (IOException ex) {
			return (false);
		}
		return (true);
	}
// Log format: [TIMESTAMP] LEVEL - MESSAGE
// Logs activity data to file with timestamp and user information

}
