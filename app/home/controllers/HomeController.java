package home.controllers;

import home.model.News;
import home.model.SampleData;
import home.services.HomeService;

import java.util.List;

import play.Logger;
import play.Logger.ALogger;
import play.libs.F.Function;
import play.libs.F.Function0;
import play.libs.F.Promise;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class HomeController extends Controller {
	private static final ALogger logger = Logger.of(HomeController.class);

	private final HomeService service = new HomeService();

	public Promise<Result> message() {
		Promise<News> promise = service.todayNews();

		Promise<Result> result = promise.map(new Function<News, Result>() {
			@Override
			public Result apply(News news) throws Throwable {
				logger.debug("Return news: {}", news);
				return ok(Json.toJson(news));
			}
		});

		return result;
	}

	public Promise<Result> loadValues() {

		return Promise.promise(new Function0<Result>() {
			@Override
			public Result apply() throws Throwable {
				List<SampleData> dataList = service.loadValues();
				return ok(Json.toJson(dataList));
			}
		});

	}
}
