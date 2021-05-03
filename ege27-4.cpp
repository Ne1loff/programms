#include <iostream>
using namespace std;
int main() {
    int n, a, p, left, right;
    int r[120];
    int m = 120;
    cin >> n;
    //обнуление массива r
    for (int i = 0; i < m; ++i)
        r[i] = 0;
    //обнуление переменных для записи ответа
    left = 0; right = 0;
    // ввод значений, поиск искомой пары
    for (int i = 0; i < n; ++i) {
        cin >> a; //считываем очередное значение
        p = a % m;
        if (p == 0) p = m;
        if (r[m - p] > a && r[m - p] + a > left + right) {
            left = r[m - p]; right = a; //обновление ответа
        }
        // обновление элемента r для соответствующего остатка
        if (p < m) {
            if (a > r[p]) r[p] = a;
        }
        else if (a > r[0]) r[0] = a;
    }
    cout << left << ' ' << right;
}
