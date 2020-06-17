package behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.ConcreteSubject;

import java.util.Date;

public class Post{
	private String postTitle;
	private Date postDate;
	
	public String getPostTitle() { return this.postTitle; }
	public Date getPostDate() { return this.postDate; }
	
	public Post(String postpostTitle) { 
		this.postTitle = postpostTitle;
		this.postDate = new Date();
	}
}

