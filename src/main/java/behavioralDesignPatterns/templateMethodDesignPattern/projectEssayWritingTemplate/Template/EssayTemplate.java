package behavioralDesignPatterns.templateMethodDesignPattern.projectEssayWritingTemplate.Template;

public abstract class EssayTemplate {
	private String topic;
	 
    public EssayTemplate(String topic) { this.topic = topic; }
    
    public String getTopic() { return topic; }
	public void setTopic(String topic) { this.topic = topic; }

	//The  Template Method:
	public final void writeEssay() {
        doResearch();
        makeOutline();
        writeIntro();
        writeBody();
        writeConclusion(); 
    } 
 
    public void doResearch() { System.out.println("\tDoing some Research for the topic:\t" + topic + "."); }
 
    public void makeOutline() { System.out.println("\tMaking an Outline for the topic:\t" + topic + "."); }
 
    public void writeIntro() { System.out.println("\tWriting Introduction for the topic:\t" + topic + "."); }
    
    public abstract void writeBody();
    
    public void writeConclusion() { System.out.println("\tWriting a Conclusion for the topic:\t" + topic + "."); }
}
