package zadanie;

public class Szyfr
{
    String text;

    public Szyfr()
    {
        text = "Example";
    }
    public Szyfr(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String szyfruj(int przesuniecie)
    {
        StringBuilder nowy_text = new StringBuilder(text.length());
        for(int i = 0; i < text.length(); i++)
        {
            nowy_text.append((char) (text.charAt(i) + przesuniecie));
        }
        return nowy_text.toString();
    }
}
