package controllers;

import play.Logger;
import play.api.mvc.Action;
import play.api.mvc.AnyContent;

public class Assets {

	public static Action<AnyContent> at(String directory, String file) {
		Logger.debug("Getting asset {}, {}", directory, file);
		return controllers.Assets.at(directory, file);
	}

}
