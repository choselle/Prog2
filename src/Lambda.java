import java.io.*;

class Lambda extends Special {
		
    // TODO: Add any fields needed.

	
	    // TODO: Add an appropriate constructor.
	public Lambda(Node t){}
    void print(Node t, int n, boolean p) {
    	  Printer.printLambda(t, n, p);
  	}

  	@Override
  	public Node eval(Node node, Environment env) {
  		return new Closure(node, env);
  	}

}
