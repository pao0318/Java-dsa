vector<int> solve(vector<int>& n) {
    int carry = 0 , pushval;
    vector<int> ans;
    for (int i = n.size() - 1; i >= 0; i--) {
        if (n[i] == 9) {
            if (carry != 0 || i == n.size() - 1) {
                pushval = 0;
                carry = 1;
            } else
                pushval = n[i];

        } else {
            if (i == n.size() - 1)
                pushval = n[i] + 1;
            else
                pushval = n[i] + carry;
            carry = 0;
        }
        ans.push_back(pushval);
    }
    if (carry != 0) ans.push_back(carry);
    reverse(ans.begin(), ans.end());
    return ans;
}
