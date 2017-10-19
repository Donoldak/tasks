import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Page habr = new Page("https://habrahabr.ru/");
        Stroka titles = new Stroka();
        try {
            titles.getName(habr.getSource());
        }catch (IOException e){
            System.out.println("Возникла какая-то ошибка");
        }
    }

}
