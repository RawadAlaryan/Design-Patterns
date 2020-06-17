package behavioralDesignPatterns.mementoDesignPattern.projectTextEditor.Memento;

public class Memento {
    private String filename;
    private StringBuilder content;

    public Memento(String file, StringBuilder content) {
        this.filename = file;
        //Notice the deep copy so that Memento and FileWriterUtil content variables don't refer to same object.
        this.content = new StringBuilder(content);
    }

	public String getFilename() { return filename; }

	public StringBuilder getContent() { return content; }
}
