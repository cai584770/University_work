package Prictice10_17_01;

public class auto_un {
	public static void main(String[] args) {
		Integer a = 234; // Integer a = Integer.value(234); �Զ�װ��
		int b = a; // int b = a.intValue(); �Զ�����
		
		Integer c = null;
//		if(c!=null) {
//			int d = c;
//		}
		
		// ���桾-128�� 127�� ֮��Ļ�������
		Integer i3 = -128;
		Integer i4 = -128;
		System.out.println(i3 == i4); // true i3��i4�ڻ��淶Χ��
		System.out.println(i3.equals(i4));// true
		// 1234���ڻ�������֮�䣬 ��ÿ�δ����Ķ����µĶ����ַ
		Integer i1 = 1234;
		Integer i2 = 1234;
		System.out.println(i1 == i2); // false i1��i2���ڻ��淶Χ�� �Ƚϵ��ǵ�ַ�� �����ǲ�ͬ�Ķ���
		System.out.println(i1.equals(i2)); // true �Ƚϵ���ֵ
	}
}
