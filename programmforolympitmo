#include <iostream>

using namespace std;

main () {
    int g = 10, f = 1, R = 0, i, t, Rmin = 100;
    float Z;
    int A[10] = {7,4,8,3,9,0,5,2,6,1};
    for (Z = 1.1; Z < 100;){
        while (true) {
            if (g > 1 || f == 1) {
                g = max(1,int(g/Z));
                f = 0;
                i = 0;
            }
            else {
                //cout << R;
                break;
            }
            while (i < 10 - g) {
                if (A[i] > A[i + g]) {
                    t = A[i];
                    A[i] = A[i + g];
                    A[i + g] = t;
                    f = 1;
                    R++;
                }
                i++;
            }
        }
       Rmin = min(Rmin,R);
       Z = Z + 0.1;
       g = 10;
       f = 1;
       R = 0;
       A[0] = 7;
       A[1] = 4;
       A[2] = 8;
       A[3] = 3;
       A[4] = 9;
       A[5] = 0;
       A[6] = 5;
       A[7] = 2;
       A[8] = 6;
       A[9] = 1;
    }
    cout << Rmin;
}
