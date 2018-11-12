#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;

// Headers
string toString (double);
int toInt (string);
double toDouble (string);

int main() {
    cout << "Introduce tu calificacion" << endl;
    int iCalificacion;
    
    cin >> iCalificacion;
    if (iCalificacion == 100) {
        cout << "A" << endl;
    } else {
        if (iCalificacion == 90) {
            cout << "B" << endl;
        } else {
            if (iCalificacion == 80) {
                cout << "C" << endl;
            } else {
                if (iCalificacion == 70) {
                    cout << "D" << endl;
                } else {
                    if (iCalificacion == 60) {
                        cout << "F" << endl;
                    } else {
                        cout << "Calificacion fuera de rango" << endl;
                    }
                }
            }
        }
    }
    return 0;
}

// The following implements type conversion functions.
string toString (double value) { //int also
    stringstream temp;
    temp << value;
    return temp.str();
}

int toInt (string text) {
    return atoi(text.c_str());
}

double toDouble (string text) {
    return atof(text.c_str());
}
