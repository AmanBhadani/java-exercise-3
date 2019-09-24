import java.io.*;
import java.util.*;

import static java.lang.String.join;


class Q11 {


    public Map<String, Integer> calculateWordFrequency(String filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filePath)));
        List<String> stringList = new ArrayList<>();
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        String string = null;
        while ((string = bufferedReader.readLine()) != null) {
            stringList.add(string);
        }
        if ((stringList.isEmpty()) && (string == null || string.isEmpty())){
            return null;
        }
        String[] strings = String.join(" ", stringList).split(" ");
        stringList.clear();
        stringList = Arrays.asList(strings);

        for (String word: strings) {
            stringIntegerMap.put(word, Collections.frequency(stringList, word));
        }
        return stringIntegerMap;
    }

}