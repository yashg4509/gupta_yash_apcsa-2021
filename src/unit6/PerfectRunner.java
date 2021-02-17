package unit6;

import static java.lang.System.*;

public class PerfectRunner {
	public static void main(String args[]) {
		Perfect dag = new Perfect();
		dag.setNum(496);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.setNum(45);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.setNum(6);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.setNum(14);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.setNum(8128);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.setNum(1245);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.setNum(33);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.setNum(28);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.setNum(27);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.setNum(33550336);
		dag.isPerfect();
		System.out.println(dag.toString());
	}
}