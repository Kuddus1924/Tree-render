package model;

public class TreeNode {
    private int level;
    private String number;
    public TreeNode(int level,String number)
    {
        this.level = level;
        this.number = number;
    }

    public int getLevel() {
        return level;
    }

    public String getNumber() {
        return number;
    }
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < level;i++)
        {
            stringBuilder.append('\t');
        }
        stringBuilder.append(number);
        return stringBuilder.toString();
    }
}
