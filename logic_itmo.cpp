#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int a1 = 0, a = 0, i;
    bool A[8] = { 0,0,0,0,0,0,0,0 };
    bool F1 = true, F2 = true;
    while (F1 != 0 || F2 != 0) {
        i = 7;
        a1 = a;
        while (a1 > 0) {
            if (a1 >= pow(2, i)) {
                a1 -= pow(2, i);
                A[i] = 1;
            }
            i--;
        }
        F1 = ((!(A[0] != A[1]) + A[1]) + (!(A[2] != A[4]) + !A[6]) + (!(A[3] != A[5]) + A[7]));
        F2 = ((!(A[2] != A[4]) + A[7]) + (!(A[3] != A[6]) + !A[0]) + (!(A[4] != A[5]) + A[1]));
        a++;
        for (i = 0; i < 8; i++)
            A[i] = 0;
        cout << F1 << " " << F2 << " " << a << endl;
    }
    cout << --a;
    return 0;
}
