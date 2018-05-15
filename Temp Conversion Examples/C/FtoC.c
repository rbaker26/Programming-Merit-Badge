#include <stdio.h>

int main()
{
	const int LOW_TEMP_F_WARNING = 0;
	const int HIGH_TEMP_F_WARNING = 100;

	float tempF = 0;
    float tempC = 0;

    unsigned int loopCount = 5;

    for(int i = 0; i < loopCount; i = i + 1)
    {
        printf("Enter a temperature in Fahrenheit:\t");
        scanf("%f", &tempF);
        
        tempC = (tempF-32.0f)*5.0f/9.0f;

        printf("The temperature in Celsius is:\t%f\n", tempC);

        if(tempF > HIGH_TEMP_F_WARNING)
        {
            printf("Remember to hydrate\n");
        }
        else if(tempF < LOW_TEMP_F_WARNING)
        {
            printf("Remember to take a jacket\n");
        }
        printf("\n");

    }
    return 0;
}