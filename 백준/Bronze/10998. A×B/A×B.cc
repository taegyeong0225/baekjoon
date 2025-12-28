#include <iostream>
using namespace std;

#define MULAB(x, y) ((x) * (y))

int main() {
	int x;
	int y;

	cin >> x;
	cin >> y;

	cout << MULAB(x, y) << endl;

	return 0;
}