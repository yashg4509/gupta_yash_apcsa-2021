package unit6;

import static java.lang.System.*;

public class PerfectRunner {
	public static void main(String args[]) {
		Perfect dag = new Perfect();
		dag.(496);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.(45);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.(6);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.(14);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.(8128);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.(1245);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.(33);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.(28);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.(27);
		dag.isPerfect();
		System.out.println(dag.toString());
		dag.(33550336);
		dag.isPerfect();
		System.out.println(dag.toString());
	}
}