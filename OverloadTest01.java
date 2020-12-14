/*
	以下代码不适用“方法重载机制”，不使用overload，分析程序存在的缺点
	
		1.以下方法功能不同，但方法相似都是求和
		在以下程序当中，功能相似的方法，分别起了三个不同的名字，对于程序员来说，调用
		方法的时候不方便，程序员需要记忆更多的方法。
		
		2.代码不美观
*/

public class OverloadTest01
{
	public static void main(String[] args){
			
		//调用方法
		int result1 = sumInt(1, 2);
		System.out.println(result1);
		
		double result2 = sumDouble(1.0, 2.0);
		System.out.println(result2);
		
		long result3 = sumLong(1L, 2L);
		System.out.println(result3);
		
	}
	
	//定义一个方法，可计算两个int类型数据的和
	public static int sumInt(int a, int b){
		return a + b;
	}
	//定义一个方法，可计算两个double类型数据的和
	public static double sumDouble(double a, double b){
		return a + b;
	}
	//定义一个方法，可计算两个long类型数据的和
	public static long sumLong(long a, long b){
		return a + b;
	}
}

