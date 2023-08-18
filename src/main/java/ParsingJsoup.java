import org.jsoup.Jsoup;

import java.io.IOException;

public class ParsingJsoup {
    public static void main(String[] args) {
        try {
            var document = Jsoup.connect("https://www.hackerrank.com/").get();
            var hrefElement = document.select("a");
            for (var element : hrefElement) {
                System.out.println(element.text());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
