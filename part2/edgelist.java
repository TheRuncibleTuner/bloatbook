import java.util.*;

public class edgelist {

    interface Edge extends List<Edge> {
    }

    static class EdgeImpl implements Edge {
	public List<Edge> subList(int start, int end) {
	    return this;
	}

	public Iterator<Edge> iterator() {
	    return iterator(0);
	}

	public Iterator<Edge> iterator(int from) {
	    return new Iterator<Edge>() {
		public void add(Edge e) {
		    throw new UnsupportedOperationException();
		}
		public void set(Edge e) {
		    throw new UnsupportedOperationException();
		}
		public void remove() {
		    throw new UnsupportedOperationException();
		}
		public Edge next() {
		    return EdgeImpl.this;
		}
		int i = 0;
		public boolean hasNext() {
		    return i++ == 0;
		}
	    };
	}

	public ListIterator<Edge> listIterator() {
	    return listIterator(0);
	}

	public ListIterator<Edge> listIterator(int from) {
	    return new ListIterator<Edge>() {
		public void add(Edge e) {
		    throw new UnsupportedOperationException();
		}
		public void set(Edge e) {
		    throw new UnsupportedOperationException();
		}
		public void remove() {
		    throw new UnsupportedOperationException();
		}
		public int previousIndex() {
		    return -1;
		}
		public int nextIndex() {
		    return 0;
		}
		public Edge previous() {
		    return EdgeImpl.this;
		}
		public boolean hasPrevious() {
		    return i++ == 0;
		}
		public Edge next() {
		    return EdgeImpl.this;
		}
		int i = 0;
		public boolean hasNext() {
		    return i++ == 0;
		}
	    };
	}

	public int lastIndexOf(Object e) {
	    if (e == this) return 0;
	    else return -1;
	}

	public int indexOf(Object e) {
	    return lastIndexOf(e);
	}

	public Edge[] toArray() {
	    return toArray(new Edge[1]);
	}

	public <Edge> Edge[] toArray(Edge[] a) {
	    if (a.length < 1) a = (Edge[])new Object[1];
	    a[0] = (Edge) this;
	    return a;
	}

	public boolean remove(Object e) {
	    throw new UnsupportedOperationException();
	}

	public boolean add(Edge e) {
	    throw new UnsupportedOperationException();
	}

	public Edge remove(int i) {
	    throw new UnsupportedOperationException();
	}

	public void add(int i, Edge e) {
	    throw new UnsupportedOperationException();
	}

	public Edge set(int i, Edge e) {
	    throw new UnsupportedOperationException();
	}

	public void clear() {
	    throw new UnsupportedOperationException();
	}

	public boolean retainAll(Collection c) {
	    throw new UnsupportedOperationException();
	}

	public boolean removeAll(Collection c) {
	    throw new UnsupportedOperationException();
	}

	public boolean containsAll(Collection c) {
	    throw new UnsupportedOperationException();
	}

	public boolean addAll(int i, Collection c) {
	    throw new UnsupportedOperationException();
	}

	public boolean addAll(Collection c) {
	    return addAll(0, c);
	}

	public Edge get(int i) {
	    if (i == 0) return this;
	    throw new IndexOutOfBoundsException();
	}

	public boolean contains(Object e) {
	    return e == this;
	}

	public boolean isEmpty() {
	    return false;
	}

	public int size() {
	    return 1;
	}
    }

    static public void main(String args[]) {
	Edge e = new EdgeImpl();
	List<Edge> l1 = new ArrayList<Edge>();
	l1.add(e);
	List<Edge> l2 = e;
	System.err.println(l1.size() + " " + l2.size() + " " + l1.containsAll(l2));
    }
}