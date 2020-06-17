package behavioralDesignPatterns.mementoDesignPattern.projectTextEditor.CareTaker;

import behavioralDesignPatterns.mementoDesignPattern.projectTextEditor.Originator.FileWriterUtil;

public class FileWriterCaretaker {
    private Object obj;

    public void save(FileWriterUtil fileWriter){ this.obj=fileWriter.save(); }

    public void undo(FileWriterUtil fileWriter){ fileWriter.undoToLastSave(obj); }
}
