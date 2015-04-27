package controllers;

import play.api.mvc.Action;
import play.api.mvc.AnyContent;

public class HtmlAsset {

	public static Action<AnyContent> loadHTML(String path, String html) {
		return controllers.Assets.at(path, html + ".html");
	}

}
