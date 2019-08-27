package inter;

import symbols.*;

public class For extends Stmt{
	
	Expr expr;
	Stmt stmt1;
	Stmt stmt2;
	Stmt stmt3;
	
	public For() {
		expr=null;
		stmt1=null;
		stmt2=null;
		stmt3=null;
	}

	public void init(Expr expr,Stmt stmt1,Stmt stmt2,Stmt stmt3) {
		this.expr=expr;
		this.stmt1=stmt1;
		this.stmt2=stmt2;
		this.stmt3=stmt3;
		if(expr.type!=Type.Bool)
			expr.error("boolean required in For");
	}
	
	public void gen(int b, int a) {}
	
	public void display() {
		emit("stmt: for begin");
		stmt1.display();
		stmt3.display();
		stmt2.display();
		emit("stmt: for end");
	}
}
