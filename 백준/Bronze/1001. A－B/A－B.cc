#include <iostream>
using namespace std;

#define DIFFAB(x, y) ((x) - (y))

int main() {
	int x;
	int y;

	cin >> x;
	cin >> y;

	cout << DIFFAB(x, y) << endl;

	return 0;
}