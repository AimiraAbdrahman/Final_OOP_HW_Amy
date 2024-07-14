package View;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
    
    public Logger logger;
    FileHandler fh;

    public MyLogger(String file_name) throws IOException {
        
        File f = new File(file_name);
        if (!f.exists()) {
            f.createNewFile();
        }
        fh = new FileHandler(file_name, true);
        logger = Logger.getLogger(MyLogger.class.getName());
        logger.addHandler(fh);
        fh.setFormatter(new SimpleFormatter());

    }
}
