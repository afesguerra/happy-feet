package orange.happyFeet.control;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import orange.happyFeet.model.VideoConverter;

public class App {
	private final static Logger LOGGER = Logger.getLogger("ProgramSystem");
	public static void main(String[] args) {
		try {
			File file = new File("archivo");
			VideoConverter.convertVideo(file);
			LOGGER.log(Level.INFO, "Vídeo convertido con éxito.");
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Hubo un error al intentar convertir el vídeo.",e);
		}

	}

}
