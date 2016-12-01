package io.robusta.people.forum;

import io.robusta.people.Admin;
import io.robusta.people.User;

/**
 * Created by Robusta Code
 */
public class Comment implements Flaggable, Comparable<Comment> {

	String content;
	int score = 0;

	public Comment() {
	}

	public Comment(String content) {
		this.content = content;
	}

	public String html() {
		return "<span>" + this.content + "</span>";
	}

	public String html(User user) {
		return html() + "<span>" + user.name + "</span>";
	}

	public String html(Admin admin) {
		return html() + "<span>" + admin.getDirectory() + "</span>";

	}

	String[] flags = new String[3];
	int flagIndex = 0;

	@Override
	public String[] getFlags() {
		return flags;
	}

	@Override
	public boolean isFlagged() {
		if (flags[0] == null) {
			return false;
		} else {
			return true;

		}
	}

	@Override
	public void addFlag(String reason) {
		this.flags[flagIndex] = reason;
		flagIndex++;

	}

	@Override
	public int compareTo(Comment other) {

		if (this.score > other.score) {
			return 1;
		}
		if (this.score < other.score) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return this.content + " - " + this.score;
	}
}
