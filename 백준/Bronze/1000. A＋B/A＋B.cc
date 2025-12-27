#include <iostream>
using namespace std;

#define SUMAB(x, y) ((x) + (y))

int main() {
	int x;
	int y;

	cin >> x;
	cin >> y;

	cout << SUMAB(x, y) << endl;
	
	return 0;
}