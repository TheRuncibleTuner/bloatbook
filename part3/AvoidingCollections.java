import java.util.*;

/**
 * This is an example from "Specializing the Implementation: Removing Collections Altogether"
 */
public class AvoidingCollections {

    interface Z {
	Collection<Integer> get();
    }

    static class X implements Z {
	Integer i = 3, j = 4;
	
	public Collection<Integer> get() {
	    Collection<Integer> l = new ArrayList<Integer>(2);
	    l.add(i); l.add(j);
	    return l;
	}
    }

    static class Y implements Z {
	Collection<Integer> c =  new ArrayList<Integer>(2);
	Y() {
	    c.add(3); c.add(4);
	}
	public Collection<Integer> get() {
	    return c;
	}
    }
    
    static public void main(String args[]) {
	int N = Integer.parseInt(args[0]);
	int M = Integer.parseInt(args[1]);
	
	long t1 = System.currentTimeMillis();
	doit(M, N, new X());
	long t2 = System.currentTimeMillis();
	doit(M, N, new Y());
	long t3 = System.currentTimeMillis();

	System.err.println( (t2-t1)/1000d + " " + (t3-t2)/1000d);
    }

    static int doit(int M, int N, Z z) {
	int m = 0;
	for (int i = 0; i < N; i++) {
	    m += z.get().size();
	    for (int j = 0; j < z.get().size(); j++) {
		m += /*Math.random() +*/ z.get().size();
	    }
	}
	return m;
    }
}
