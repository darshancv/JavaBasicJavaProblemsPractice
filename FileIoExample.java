import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileIoExample {

	public static void main(String[] args) throws Exception {
		
		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("cdef");
		
		List<String> output=null;
		
		try {
		File file=new File("D:\\Example.txt");
		FileOutputStream fileoutput=new FileOutputStream(file);
		BufferedOutputStream outputStream=new BufferedOutputStream(fileoutput);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(list);//serialization
		objectOutputStream.flush();
		objectOutputStream.close();
		
		
		
		FileInputStream fileinput=new FileInputStream("D:\\Example.txt");
		BufferedInputStream bufferedInputStream=new BufferedInputStream(fileinput);
		ObjectInputStream objectInputStream=new ObjectInputStream(bufferedInputStream);
		output=(List<String>) objectInputStream.readObject();//desrialization
		objectInputStream.close();
		
		System.out.println(output.toString());
		
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
