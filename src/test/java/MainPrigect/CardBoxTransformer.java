package MainPrigect;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CardBoxTransformer {
    public static List<CardBoxMusic> wrap(List<WebElement> elements) {
        ArrayList<CardBoxMusic> res = new ArrayList<CardBoxMusic>();
        for (WebElement element : elements) {
            res.add(new CardBoxMusic(element));
        }
        return res;
    }
}
