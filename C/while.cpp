//while
#include <stdio.h>
void put1(int a, int b);
void put2();

int main()
{
	put1(99, 0);

	return 0;
}

void put1(int a, int b)
{
	a = 99;
	b = 0;

	while (b < a)
	{
		if (a > 1)
		{
			printf("%d bottles of beer on the wall. %d bottles of beer.\n", a, a);
			put2();
			if (a > 2)
				printf("%d bottles of beer on the wall.\n", a - 1);
			else
				printf("%d bottle of beer on the wall.\n", a - 1);
		}
		else
		{
			printf("%d bottle of beer on the wall. %d bottle of beer.\n", a, a);
			put2();
			printf("No more bottles on the wall.");
		}
		a--;
	}
}

void put2()
{
	printf("Take one down.\n");
	printf("Pass it around.\n");
}