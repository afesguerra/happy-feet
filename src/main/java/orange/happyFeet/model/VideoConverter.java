package orange.happyFeet.model;

import java.io.File;
import java.io.IOException;

public class VideoConverter {
	private String fileAddress;
	private static File file;
	private final static String command = String.format("ffmpeg.exe -i \"%1$s\" -y \"%1$s.mp4\"", file.getAbsolutePath());


	public VideoConverter(String fileAddress) {
		this.fileAddress = fileAddress;
	}

	public boolean convertTo(String extension) throws IOException {
		File videoToConvert = new File(fileAddress);
		convert(videoToConvert, extension);
		return true;
	}
	public static File convertVideo(File origin) throws IOException {
		return convert(origin, ".mp4");
	}
	private static File convert(File origin, String extension) throws IOException {
		// Runtime.getRuntime().exec("cmd /c ffmpeg.exe -i \"" + videoToConvert.toString() + "\" -y \"" + videoToConvert.toString() + extension + "\"");
		Runtime.getRuntime().exec("cmd /c " + command);

		return null;
	}
}
