package io.robusta.people.forum;

import io.robusta.people.User;

/**
 * Created by Robusta Code
 */
class ImageComment extends Comment {

	String url;
	User user;
	
	public ImageComment(String content, User user, String url) {
		this.content = content;
		this.url = url;
		this.user = user;
	}

	@Override
	public String html() {
		return super.html() +"<img src='"+this.url+"'>";
	}

}
