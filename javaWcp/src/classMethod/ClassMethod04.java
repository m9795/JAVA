package classMethod;

import classMethod.human.Human04;

public class ClassMethod04 {
	public static void main(String[] args) {
		Human04 yamada = new Human04("山田");
		Human04 tanaka = new Human04("田中");
		Human04 kimura = new Human04("木村");
		Human04 aoki = new Human04("青木");
		
		Human04.staticMethodPrint();
		
		System.out.println(Human04.GREETING);
		

		yamada.instanceMethodPrint();
		tanaka.instanceMethodPrint();
		kimura.instanceMethodPrint();
		aoki.instanceMethodPrint();
	}
}
