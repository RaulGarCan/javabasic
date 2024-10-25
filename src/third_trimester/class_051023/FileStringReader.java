package third_trimester.class_051023;

import java.io.*;
import java.nio.charset.Charset;

public class FileStringReader extends FileReader {

    private boolean isEOF = false;
    public FileStringReader(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    public FileStringReader(File file) throws FileNotFoundException {
        super(file);
    }

    public FileStringReader(FileDescriptor fd) {
        super(fd);
    }

    public FileStringReader(String fileName, Charset charset) throws IOException {
        super(fileName, charset);
    }

    public FileStringReader(File file, Charset charset) throws IOException {
        super(file, charset);
    }
    public String readString() throws IOException {
        String result = "";
        int i;
        while (true) {
            if (((i = read()) == -1) || ((char) i == '\n')) {
                return result;
            } else {
                result += (char) i;
            }
        }
    }
}
