package render;

import exception.TreeRenderException;
import io.Reader;
import io.Writer;
import model.TreeNode;
import parser.ParserText;

import java.util.ArrayList;

public class Render {
     private String infile;
     private String outfile;
    public Render(String infile,String outfile)
    {
        this.infile = infile;
        this.outfile = outfile;
    }
    public void work()
    {
        try {
            ArrayList<String> strings = Reader.read(infile);
            ArrayList<TreeNode> node = ParserText.toParse(strings);
            Writer.writeTree(outfile,node);
        }
        catch (TreeRenderException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
