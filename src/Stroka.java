import java.util.ArrayList;


public class Stroka {
    public void getName(String stroka){
        int index1 = 0;
        int index2 = 0;
        String check1 = "class=\"post__title_link\">";
        String check2 = "</a>";
        ArrayList<String> text = new ArrayList<String>();
        while (index1 !=-1) {
            index1 = stroka.indexOf(check1);
            if (index1 != -1) {
                stroka = stroka.substring(index1 + check1.length(), stroka.length());
                index2 = stroka.indexOf(check2);
                text.add(stroka.substring(0, index2));
            }
            index1 = stroka.indexOf(check1);
        }
        for (int i = 0; i <text.size(); i++)
        System.out.println(text.get(i));
    }
}
