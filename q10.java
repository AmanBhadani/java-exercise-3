import java.io.*;


class Q10 {

    public byte[] readFile(String fileName, String extension) throws IOException{
        String text = "";
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
            file = new File(fileName.concat(".").concat(extension));
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String oneLineText;
            while ((oneLineText = bufferedReader.readLine()) != null){
                text = text.concat(oneLineText);
            }
            if (text.trim().isEmpty()){
                return null;
            }
        return text.getBytes();
    }
}
