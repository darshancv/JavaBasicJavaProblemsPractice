import java.io.IOException;
import java.util.*;
public class Print  {

	public static void main(String[] args) {
		try {
			System.out.write("hello".getBytes());											//message without using System.out.println
			System.out.format("%s", "hello hi");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if((System.out.printf("bye bye"))==null) {											//print message without semicolon
			
		}
		}

	}


