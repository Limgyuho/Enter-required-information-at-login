package article.container;

import article.container.service.ArticleService;
import article.dao.ArticleDao;
import article.dao.MemberDao;
import creatboard18.dto.Article;

public class Container {

	 public static ArticleDao articleDao;
	 public static MemberDao memberDao;
	public static ArticleService articleService;
	 
	 static {
		 articleDao = new ArticleDao();
		 memberDao = new MemberDao();
	 }


}
