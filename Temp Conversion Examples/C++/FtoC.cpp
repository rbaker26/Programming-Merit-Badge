#include <iostream>
using namespace std;

int main()
{
 
    float usd = 0;
    float peso = 0;

    unsigned int loopCount = 5;

    for(int i = 0; i < loopCount; ++i)
    {
        cout << "Enter dollars:\t";
        cin >> usd;
        
        peso = (usd * 19.57);

        cout << "pesos = :\t" << peso << endl;

        cout << endl;

    }
    return 0;
}
