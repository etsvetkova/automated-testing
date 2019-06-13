package MainPrigect;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CardListMyTransformer {
    public static List<CardListMyCatalog> wrapMyCtalog (List<WebElement> elements) {
        ArrayList<CardListMyCatalog> mycatalog = new ArrayList<CardListMyCatalog>();
        for (WebElement element : elements) {
            mycatalog.add(new CardListMyCatalog(element));
        }
        return mycatalog;
    }
}
