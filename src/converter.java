import java.io.*;

public class converter {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  File videoToConvert = new File("archivo");
	  try {
	    System.out.println("ffmpeg.exe -i \"" + videoToConvert.toString() + "\" -y \"" + videoToConvert.toString() + ".mp4" + "\"");
	    Runtime.getRuntime().exec("cmd /c ffmpeg.exe -i \"" + videoToConvert.toString() + "\" -y \"" + videoToConvert.toString() + ".mp4" + "\"");
	  }
	  catch (IOException e) {
	    System.out.println("Error.");
	  }
  } 
}
