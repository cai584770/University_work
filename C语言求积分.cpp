#include <stdio.h>

int main()
{
	float a, b;//���붨���ֵĻ������޺ͻ�������
	float x, y;
	float n, m;
	float sum = 0;
	float i = 1;

	printf("Please enter a:");
	scanf_s("%f", &a);
	printf("Please enter b:");
	scanf_s("%f", &b);
	printf("Please enter n:");
	scanf_s("%f", &n);
	m = (b - a) / n;

	while (i <= n)
	{
		x = a + i * m;
		y = x * x;
		sum = sum + y * m;
		i++;
	}

	printf("y������[%f,%f]�ϵĶ�����Ϊ:%f", a, b, sum);

	return 0;
}