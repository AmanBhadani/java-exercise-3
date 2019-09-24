import java.io.*;

class Q9 {
    File file;
    FileReader fileReader;
    BufferedReader bufferedReader;

    
    public void readFile(String path) throws IOException{
        file = new File(path);
        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);
    }

    

    public String getFileContentsAsString() throws IOException{
        StringBuilder stringBuilder = new StringBuilder();
        String string = null;
        while ((string = bufferedReader.readLine()) != null) {
            stringBuilder.append(string.toUpperCase());
        }
        if (stringBuilder.toString().trim().isEmpty()){
            return null;
        }
        return stringBuilder.toString().toUpperCase();
    }

    public int getFileLenght() throws IOException {
        return getFileContentsAsString().length();
    }

}