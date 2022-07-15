package lemdaexpression;
@FunctionalInterface
public interface SumInter {
  public abstract int sum(int a,int b);
  static void m1() {
	  System.out.println("m1 runing");
  }
  default void m2() {
	  System.out.println("m2 method ");
  }
}
