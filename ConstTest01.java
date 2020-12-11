/*
	* 字面值：
		- 10、100
		- 3.14
		-“abc”
		-'a'
		-true、false
	* 字面值就是数据
	* 字面字是java源程序组成的部分之一，包括标识符和关键字，他们都是java源程序的组成部分
	* 数据在现实世界当中是分门别类的，所以数据在计算机编程当中也是有类型的：【数据类型】
		- 10、100      整数型字面值
		- 3.14         浮点型字面值
		-“abc”         字符串型
		-'a'           字符型
		-true、false   布尔型字面值

	* 注意：
		java语言当中所有的字符串型字面值必需使用双引号括起来，双引号是半角
		java语音当中所有的字符型字面值必须使用单引号括起来，单引号是半角
*/

public class ConstTest01
{
	public static void main(String[] args){
		System.out.println("abc");
		System.out.println(false);
		System.out.println(true);
		System.out.println('a');
		System.out.println(3.14);
		System.out.println(10);
		System.out.println(100);
		
		// 编译报错，因为单引号中只能存放单个字符，属于字符型字面值
		// System.out.println('ABC');
	}
}