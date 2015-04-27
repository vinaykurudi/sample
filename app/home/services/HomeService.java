package home.services;

import home.model.News;
import home.model.SampleData;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import play.libs.F.Function0;
import play.libs.F.Promise;

public class HomeService {
	public Promise<News> todayNews() {
		return Promise.promise(new Function0<News>() {
			@Override
			public News apply() throws Throwable {
				return getNews();
			}
		});
	}

	public News getNews() {
		News news = new News();
		news.setDate(new Date());
		news.setMessage("Hello world :)");

		return news;
	}

	public List<SampleData> loadValues() {

		List<SampleData> dataList = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			dataList.add(new SampleData("sampleData" + i, "" + i));
		}
		return dataList;

	}
}
