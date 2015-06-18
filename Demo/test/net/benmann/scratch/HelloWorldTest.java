package net.benmann.scratch;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class HelloWorldTest {
	@Test public void testResult() {
        OutputStream outStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outStream);
        System.setOut(printStream);

        HelloWorld.main(null);
        
        assertEquals("Hello World", outStream.toString());
	}
}
