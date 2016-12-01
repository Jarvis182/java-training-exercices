package io.robusta.people.forum;

import java.util.TreeSet;

import io.robusta.people.Admin;
import io.robusta.people.User;

public class ForumApplication {

	public static void main(String[] args) {

		User popey = new User("Popey", "pipe@b.com");

		int age = 40;
		popey.setAge(age);

		System.out.println(popey);

		Comment c = new Comment("Xav, plus bas!");
		System.out.println(c.html());

		System.out.println(c.html(popey));
		Admin admin = new Admin("Jojo");

		Admin neo = new Admin("Neo");
		System.out.println(c.html(neo));

		ImageComment ic = new ImageComment("Xav, plus bas!", popey,
				"http://radiobxi.org/blog/wp-content/uploads/2013/02/mrrelou-1.jpg");
		System.out.println(ic.html());

		System.out.println(c.isFlagged());
		// c.flags[0] = "pas cool!";
		c.addFlag("Le relou!");
		c.addFlag("Pas cool non plus");
		c.addFlag("Bad stuff");
		System.out.println(c.isFlagged());
		System.out.println("ic ? " + ic.isFlagged());
		c.score = 3;
		TreeSet<Comment> comments = new TreeSet<>();
		comments.add(c);
		comments.add(ic);

		System.out.println(comments);
		Comment last = comments.last();
		System.out.println(comments.last());
		

	}

}
