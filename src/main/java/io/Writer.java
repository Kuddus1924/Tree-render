package io;

import exception.TreeRenderException;
import model.TreeNode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {
    public static void writeTree(String fileName, ArrayList<TreeNode> tree) throws TreeRenderException
    {

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            for(int i = 0;i < tree.size();i++)
            {
                fileWriter.write(tree.get(i).toString() + '\n');
                fileWriter.flush();
            }
            fileWriter.close();
        }
        catch (IOException e)
        {
            throw new TreeRenderException("Ошибка при записи в  " + fileName);
        }
    }

}
