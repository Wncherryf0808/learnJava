/*
	关于java语言当中的标识符
	1、什么是标识符
		- 在java源程序当中，凡是程序员有权利自己命名的单词都是标识符
		- 标识符可以标识什么元素呢？
			* 类名
			* 方法名
			* 常量名
			* 接口名
			* 变量名
			*  ........
	2、标识符的命名规则？【不按照这个规则来，编译器会报错，这是语法】
			* 一个合法的标识符只能由“数字、字符、下划线_、美元符号$”组成，不能含有其他符号		 	
			* 不能数字开头
			* 严格区分大小写
			* 关键字不能做标识符
			* 理论上无长度限制
	3、标识符的命名规范？【只是一种规范，不属于语法，不遵守规范编译器不会报错】
			* 最好见名知意
				public class UserService{
					public void login(String username, String password){
					}
				}
			* 遵守驼峰命名方式
					SystemService
					UserService
			* 类名、接口名：首字母大写，后面每个单词首字母大写
			* 变量名、方法名：首字母小写，后面每个单词首字母大写
			* 常量名：全部大写
*/
public class IdentifierTest01  // IdentifierTest01是一个类名，名字可以修改
{
	// main是一个方法名
	public static void main(Sring[] args){ // args是一个变量名

	}
	// doSome方法 名
	public static void doSome(){

	}
}