package behavioralDesignPatterns.iteratorDesignPattern.projectCollegeCourseIteratorSystem.Iterator;

public class ArtsIterator implements IteratorInterface {
    private String[] subjects;
    private int position;

    public ArtsIterator(String[] subjects)  {
        this.subjects = subjects;
        position = 0;
    }

    public void first()  { position = 0; }
    public String next()  { return subjects[position++]; }
    public boolean isDone() { return position >= subjects.length; }
    public String currentItem() { return subjects[position]; }
}