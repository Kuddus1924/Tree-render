package parser;

import exception.TreeRenderException;
import model.TreeNode;

import java.util.ArrayList;

public class ParserText {
    public static ArrayList<TreeNode> toParse(ArrayList<String> text) throws TreeRenderException
    {
        int levelCount = -1;
        ArrayList<TreeNode> result = new ArrayList<TreeNode>();
        for(int i = 0; i < text.size(); i++)
        {
            String fileLine = text.get(i);
            for (int j = 0;j < fileLine.length(); j++)
            {
                char test = fileLine.charAt(j);
                if(fileLine.charAt(j) == '(')
                {
                    levelCount++;
                    continue;
                }

                if(fileLine.charAt(j) == ')')
                {
                    levelCount--;
                    continue;
                }
                if((fileLine.charAt(j) >= 48)&&(fileLine.charAt(j) <= 57)) {
                    int c = j;
                    StringBuilder stringBuilder = new StringBuilder();
                    while ((fileLine.charAt(c) >= 48) && (fileLine.charAt(c) <= 57)) {
                        stringBuilder.append(fileLine.charAt(c));
                            c++;
                    }
                    result.add(new TreeNode(levelCount,stringBuilder.toString()));
                    j = c - 1;
                }
            }
        }
        if (levelCount == 0)
        {
                throw new TreeRenderException("Некорректные данные в исходном файле\n" +
                        "Количество открытых и закрытых фигурных скобок не совпадает");
        }
        return result;
    }

}
