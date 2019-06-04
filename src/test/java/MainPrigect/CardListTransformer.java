package MainPrigect;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CardListTransformer {
    public static  List <CardListMusic> wrap (List<WebElement> elements) {
        ArrayList <CardListMusic> res = new ArrayList<CardListMusic>();
        for (WebElement element : elements) {
            res.add(new CardListMusic(element));
        }
        return res;
    }

}
