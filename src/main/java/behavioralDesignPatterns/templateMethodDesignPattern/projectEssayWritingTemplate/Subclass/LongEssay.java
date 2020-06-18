package behavioralDesignPatterns.templateMethodDesignPattern.projectEssayWritingTemplate.Subclass;

import behavioralDesignPatterns.templateMethodDesignPattern.projectEssayWritingTemplate.Template.EssayTemplate;

public class LongEssay extends EssayTemplate {
    public LongEssay(String topic) { super(topic); }
 
    @Override
    public void writeBody() { System.out.println("\tWriting 6 paragraphs for the topic:\t" + super.getTopic() + "."); }
}
