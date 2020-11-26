import render.Render;

public class TreeRender {
    static public void main(String args[])
    {
        if (args.length != 2)
        {
            System.out.println("Недопустимое число параметров\n" +
                    "Введите  путь к иходному файлу и к файлу для записи результата");
            return;
        }
        Render render = new Render(args[0],args[1]);
        render.work();
    }

}
