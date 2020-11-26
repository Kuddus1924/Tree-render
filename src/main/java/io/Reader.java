package io;

import exception.TreeRenderException;

import java.io.*;
import java.util.ArrayList;

public class Reader {
    public static ArrayList<String> read(String fileName) throws TreeRenderException
    {

        ArrayList<String> result = new ArrayList<String>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)));
            String str = bufferedReader.readLine();
            while (str != null) {
                result.add(str);
                str = bufferedReader.readLine();
            }
            bufferedReader.close();
            return result;
        }
        catch (FileNotFoundException e)
        {
          throw new TreeRenderException("Файл " + fileName + " не найден.");
        }
        catch (IOException e)
        {
            throw  new TreeRenderException("Файл " + fileName + " не удалось прочитать.");
        }
    }

}
