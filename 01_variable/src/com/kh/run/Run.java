package com.kh.run;

// import com.kh.variable.A_Variable; // import -> ���� ���� ���� ���� Ŭ������ ��ġ�� ������ִ� ����
import com.kh.variable.B_Constant;
import com.kh.variable.C_Cast;
import com.kh.variable.D_PrintMethod;
import com.kh.variable.E_KeyboardInput;

public class Run { // ���� Ŭ����
	public static void main(String[] args) { //���� �޼ҵ�
		// A_Variable Ŭ���� ����
		// 1. Ŭ���� �տ� ��Ű������ �� ���� Ŭ������ Ǯ�������� ����(com.kh.run �ȿ� �ִ� A_Variable�̴� �˷��ִ� ��)
//		com.kh.variable.A_Variable av = new com.kh.variable.A_Variable(); -> Ŭ���� �̸��� ������ �� ��Ű���� �ٸ��� ������ ��� �ִ� Ŭ������ ����Ű���� �ν� �� �� 
//		-------------------------- -> Ŭ������ Ǯ����
		
		//2. import�� ����Ͽ� ����
//		A_Variable av = new A_Variable(); // import�� �� ���� ����or���� ��翡 ���콺 �÷��� ����  or ctrl+shift+o -> import ����Ű
		//				---------------- -> �ش� Ŭ������ �˸��� �����, �� �˸��̸� av��� ������ ��Ƶΰ� ���� : Ŭ������ ������ ��
//		test.A_Variable av2 = test.new A_Variable(); -> test��Ű���� �ִ°� ����ϰ� �; import�� com.kh.variable��Ű�� �ڵ� ������
//      ---- -> ���� Ŭ������ �ٸ� ��Ű���� �ִ°� ����ϰ� ������ �տ� test. �̷��� ��Ű�� ����������
		
		// Ŭ���� �ȿ� �ִ� �޼ҵ� ����
//		av.declareVariable(); // av ���� �ȿ�(.) �ִ� declareVariable �޼ҵ� ����
//		av.initVariable();
		
//		B_Constant bc = new B_Constant();
//		bc.finalConstant(); // B_Constant Ŭ���� �˸��� bc ���� �� finalConstant �޼ҵ忡 ����
		
//		C_Cast cc = new C_Cast();
//		cc.rule1();
//		cc.rule2();
		
//		D_PrintMethod dp = new D_PrintMethod();
//		dp.printlnExample();
//		dp.printExample();
//		dp.printfExample();
	
		E_KeyboardInput eki = new E_KeyboardInput();
		eki.inputScanner2();
	}
}