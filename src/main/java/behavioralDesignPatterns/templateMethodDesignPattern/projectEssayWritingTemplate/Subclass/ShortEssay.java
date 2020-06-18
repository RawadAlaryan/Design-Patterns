package behavioralDesignPatterns.templateMethodDesignPattern.projectEssayWritingTemplate.Subclass;

import behavioralDesignPatterns.templateMethodDesignPattern.projectEssayWritingTemplate.Template.EssayTemplate;

public class ShortEssay extends EssayTemplate {
	public ShortEssay(String topic) { super(topic); }
 
    @Override
    public void writeBody() { System.out.println("\tWriting 2 paragraphs for the topic:\t" + super.getTopic() + "."); }
}
 
