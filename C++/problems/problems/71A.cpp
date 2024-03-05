
// https://codeforces.com/problemset/problem/71/A
#include <iostream>
#include <sstream>
#include <vector>
using namespace std;

void encodeStrings(vector<string>& strs) {
    for (auto & str: strs) {
        long len = str.size();
        if (len > 10) {
            stringstream ss;
            ss<<str[0]<<len-2<<str[len-1];
            str = ss.str();
        }
    }
}

int main(int argc, char* argv[]) {
    int n;
    cin>>n;
    vector<string> strs;
    string str;
    
    for(int i=0; i<n; i++) {
        cin>>str;
        strs.push_back(str);
    }

    encodeStrings(strs);
    for(auto str: strs) {
        cout<<str<<endl;
    }
    return 0;
}
