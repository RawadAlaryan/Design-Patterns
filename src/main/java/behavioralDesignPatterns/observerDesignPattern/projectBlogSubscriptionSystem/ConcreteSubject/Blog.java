package behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.ConcreteSubject;

import behavioralDesignPatterns.observerDesignPattern.projectBlogSubscriptionSystem.Subject.Subject;

public class Blog extends Subject {
    private String blogTitle;
    private String blogAuthor;
    private Post recentPost;
    
    public Blog(String blogTitle, String blogAuthor) {
    	super(blogTitle);
        this.blogTitle = blogTitle;
        this.blogAuthor = blogAuthor;
    }
    
    public String getBlogTitle() { return blogTitle; }
    public void setBlogTitle(String blogTitle) { this.blogTitle = blogTitle; }
	public String getBlogAuthor() { return blogAuthor; }
	public void setBlogAuthor(String blogAuthor) { this.blogAuthor = blogAuthor; }

	public void publish(Post post) {
        System.out.println("New Post is Published in\t" + blogTitle + "\t\ton Date/Time:\t" + post.getPostDate() + ".");
        this.recentPost = post;
        notifyAllObservers();  
    }

    public Post getRecentPost() { return this.recentPost; }
   
}
