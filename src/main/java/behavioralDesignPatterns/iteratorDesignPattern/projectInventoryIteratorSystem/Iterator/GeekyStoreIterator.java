package behavioralDesignPatterns.iteratorDesignPattern.projectInventoryIteratorSystem.Iterator;

import java.util.ArrayList;

public class GeekyStoreIterator implements IteratorInterface {
    ArrayList<Product> catalog;
    int position = 0;

    public GeekyStoreIterator(ArrayList<Product> catalog) { this.catalog = catalog; }

    @Override
    public boolean hasNext() {
        if (position >= catalog.size() || catalog.get(position) == null) { return false; }
        else { return true; }
    }

    @Override
    public Object next() {
        Product product = catalog.get(position);
        position = position + 1;
        return product;
    }

	@Override
	public void remove() {
    	if (position <= 0) { throw new IllegalStateException("Can't remove item until you've done at least one next()"); }
        if (catalog.get(position-1) == null) {
            for (int i = position-1; i < (catalog.size() - 1); i++) { catalog.set(i, catalog.get(i+1)); }
            catalog.set(catalog.size() - 1, null);
        }
	}
}
