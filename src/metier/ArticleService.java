package metier;

import java.util.ArrayList;

public class ArticleService {
	private ArrayList<Article> catalogue = new ArrayList<>();

	public ArticleService() {
		Article article1 = new Article(1, "bordeaux1", 100);
		Article article2 = new Article(2, "bordeaux2", 200);
		Article article3 = new Article(3, "bordeaux3", 300);

		catalogue.add(article1);
		catalogue.add(article2);
		catalogue.add(article3);
	}

	public ArrayList<Article> getCatalogue() {
		return catalogue;

	}
}
