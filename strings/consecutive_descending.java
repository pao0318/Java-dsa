bool solve(string s) {
    int start;
    int len = s.length();

    for (int i = 0; i < len / 2; i++) {
        string new_str = s.substr(0, i + 1);
        int num = atoi(new_str.c_str());
        start = num;
        while (new_str.size() < len) {
            num--;
            new_str += to_string(num);
        }
        if (new_str == s) {
            return 1;
        }
    }
    return 0;
}
