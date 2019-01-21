package BasicDataType;

public class BasicType {
	public static void main(String[] args){
	int a=4;
	int b=5;
	//boolean 类型
	boolean c=(b>a)&&(a!=b);//与
	System.out.println(c);
	double d=a;//自动转换
	System.out.println(d);
	double d1=5.4;
	int i=(int)d1;//强制转换
	System.out.println(i);
	//int类型转char
	int i2=97;
	char c1=(char)i2;//强制转换
	System.out.println(c1);
	//三目运算符
	String s= a>b ? "好":"坏";
	System.out.println(s);
	//if
	int i3=30;
	if(i3>10){
		System.out.println("0000");
	}
	else if(i3>20){
		System.out.println("1111");
	}
	else{
		System.out.println(2222);
	}
	//Switch
	int a4=4;
	switch(a4){
		case 1:
			System.out.println(9);
			break;
		case 4:
			System.out.println(99);
			break;
		default:
			System.out.println(999);
	}
	//while
	int i4=1;
	int sum=0;
	while(i4<11){
		sum+=i4;
		i4++;
	}System.out.println("sum="+sum);
	//for
	int sum1=0;
	for(int i5=1;i5<11;i5++){
		if(i5%2==0){
			sum1+=i5;
			i++;	
		}
	}System.out.println(sum1);
	int[] arr={1,2,3,4,5,6};
	for(int i9:arr){
		System.out.println(i9);
	}
	}
}